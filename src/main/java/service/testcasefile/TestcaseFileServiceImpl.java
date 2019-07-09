package service.testcasefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import model.MacroMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import model.Master;
import model.Testcase;

@Service
public class TestcaseFileServiceImpl implements TestcaseFileService
{
    private static final String MASTER_SHEET_NAME = "Master";
    private static final String MACRO_SHEET_NAME = "Macro";

    @Override
    public Master readMaster( String testcaseFilePath ) throws FileNotFoundException, IOException, EncryptedDocumentException
    {
        InputStream inputStream = new FileInputStream( testcaseFilePath );
        Workbook wb = new XSSFWorkbook( inputStream );

        Sheet master = wb.getSheet( MASTER_SHEET_NAME );
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
        return new Master( updateTC, firstRowOfTestcase, lastRowOfTestcase, stepColumn, resultColumn, noteColumn );
    }

    @Override
    public MacroMap readMacro( String testcaseFilePath ) throws FileNotFoundException, IOException, EncryptedDocumentException
    {
        MacroMap macroMap = new MacroMap();

        InputStream inputStream = new FileInputStream( testcaseFilePath );
        Workbook wb = new XSSFWorkbook( inputStream );
        Sheet macroSheet = wb.getSheet( MACRO_SHEET_NAME );
        Iterator<Row> iterator = macroSheet.iterator();
        String macroName, macroValue;
        while ( iterator.hasNext() ) {
            Row currentRow = iterator.next();
            macroName = currentRow.getCell(0).getStringCellValue();
            macroValue = currentRow.getCell(1).getStringCellValue();
            macroMap.addMacro(macroName, macroValue);
        }
        return macroMap;
    }

    @Override
    public void updateTestcaseIdResult( String testcaseFilePath, Master master, List<Testcase> testcases )
            throws FileNotFoundException, IOException, EncryptedDocumentException
    {
        if ( master.isUpdateTC() )
        {
            InputStream inputStream = null;
            OutputStream outputStream = null;

            inputStream = new FileInputStream( testcaseFilePath );
            Workbook wb = WorkbookFactory.create( inputStream );
            Sheet testcaseSheet = wb.getSheetAt( 0 );
            for ( Testcase testcase : testcases )
            {
                Row row = testcaseSheet.getRow( testcase.getRow() );
                row.getCell( master.getResultColumn() ).setCellValue( testcase.getTestcaseStatus().getName() );
                row.getCell( master.getNoteColumn() ).setCellValue( row.getCell( master.getNoteColumn() ).getStringCellValue() + testcase.getNote() );

                outputStream = new FileOutputStream( testcaseFilePath );
                wb.write( outputStream );
            }
            outputStream.close();
        }
        else
        {
            System.out.println( "[info] Auto update testcase is now false!" );
        }
    }

}
