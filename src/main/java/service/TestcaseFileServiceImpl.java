package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;

import model.Master;

@Service
public class TestcaseFileServiceImpl implements TestcaseFileService
{
    @Override
    public Master readMaster( String testcaseFilePath )
    {
        InputStream testcasesInputStream;
        try
        {
            testcasesInputStream = new FileInputStream( testcaseFilePath );
            Workbook wb = WorkbookFactory.create( testcasesInputStream );

            Sheet master = wb.getSheet( "Master" );
            Row firstRowMaster = master.getRow( 0 );
            Row secondRowMaster = master.getRow( 1 );
            Row thirdRowMaster = master.getRow( 2 );

            boolean updateTC = true;
            String updateTcValue = thirdRowMaster.getCell( 1 ).getStringCellValue();
            if ( updateTcValue.equalsIgnoreCase( "f" ) || updateTcValue.equalsIgnoreCase( "false" ) )
            {
                updateTC = false;
            }
            int firstRowOfTestcase = (int) firstRowMaster.getCell( 1 ).getNumericCellValue() - 1;
            int lastRowOfTestcase = (int) secondRowMaster.getCell( 1 ).getNumericCellValue() - 1;
            int stepColumn = firstRowMaster.getCell( 4 ).getStringCellValue().toCharArray()[0] - 'A';
            int resultColumn = secondRowMaster.getCell( 4 ).getStringCellValue().toCharArray()[0] - 'A';
            int noteColumn = thirdRowMaster.getCell( 4 ).getStringCellValue().toCharArray()[0] - 'A';
            testcasesInputStream.close();

            return new Master( updateTC, firstRowOfTestcase, lastRowOfTestcase, stepColumn, resultColumn, noteColumn );

        }
        catch ( FileNotFoundException e )
        {
            // TODO Xử lý khi không tìm thấy file
        }
        catch ( EncryptedDocumentException | IOException e )
        {
            // TODO Xử lý khi không đọc được file excel
        }
        return null;
    }

}