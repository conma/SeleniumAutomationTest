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
import org.springframework.stereotype.Component;

import model.Master;

@Component
public class TestcaseFileServiceImpl implements TestcaseFileService
{
    @Override
    public Master readMaster(String testcaseFilePath)
    {
        InputStream testcasesInputStream;
        try
        {
            testcasesInputStream = new FileInputStream(testcaseFilePath);
            Workbook wb = WorkbookFactory.create(testcasesInputStream);

            Sheet master = wb.getSheet("Master");
            Row firstRowMaster = master.getRow(0);
            Row secondRowMaster = master.getRow(1);
            Row thirdRowMaster = master.getRow(2);
            Row fourthRowMaster = master.getRow(3);
            Row fifthRowMaster = master.getRow(4);

            int firstRowOfTestcase = (int) firstRowMaster.getCell(1).getNumericCellValue() - 1;
            int lastRowOfTestcase = (int) secondRowMaster.getCell(1).getNumericCellValue() - 1;
            int autoColumn = firstRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';
            int stepColumn = secondRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';
            int expectColumn = thirdRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';
            int resultColumn = fourthRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';
            int noteColumn = fifthRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';

            //
//            private String auto;
//            private String updateTC;
//            private int firstRowOfTestcase;
//            private int lastRowOfTestcase;
//            private int idColumn;
//            private int stepsColumn;
//            private int expectColumn;
//            private int resultColumn;
//            private int noteColumn;
            //
            
            // reading Information
            Sheet tcSheet = wb.getSheetAt( 0 );
            String auto = master.getRow(rownum);
            return new Master(auto, idColumn, stepsColumn, expectColumn, resultColumn, noteColumn);

        } catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (EncryptedDocumentException | IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }

}
