package service.testcasefile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import model.MacroMap;
import model.command.Command;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import model.Master;
import model.Testcase;

@Service
public class TestcaseFileServiceImpl implements TestcaseFileService {
    private static final String MASTER_SHEET_NAME = "Master";
    private static final String MACRO_SHEET_NAME = "Macro";
    private static final String COMMANDS_SHEET_NAME = "Commands";

    @Override
    public Master readMaster( String testcaseFilePath ) throws IOException, EncryptedDocumentException {
        InputStream inputStream = new FileInputStream( testcaseFilePath );
        Workbook wb = new XSSFWorkbook( inputStream );

        Sheet master = wb.getSheet( MASTER_SHEET_NAME );
        Row firstRowMaster = master.getRow( 0 );
        Row secondRowMaster = master.getRow( 1 );
        Row thirdRowMaster = master.getRow( 2 );

        boolean updateTC = true;
        try {
            updateTC  = thirdRowMaster.getCell( 1 ).getBooleanCellValue();
        } catch ( Exception e ) {
            String updateTcValue = thirdRowMaster.getCell( 1 ).getStringCellValue();
            if ( updateTcValue.equalsIgnoreCase( "f" ) || updateTcValue.equalsIgnoreCase( "false" ) ) {
                updateTC = false;
            }
        }

        int firstRowOfTestcase = (int) firstRowMaster.getCell( 1 ).getNumericCellValue() - 1;
        int lastRowOfTestcase = (int) secondRowMaster.getCell( 1 ).getNumericCellValue() - 1;
        int stepColumn = firstRowMaster.getCell( 4 ).getStringCellValue().toCharArray()[0] - 'A';
        int resultColumn = secondRowMaster.getCell( 4 ).getStringCellValue().toCharArray()[0] - 'A';
        int noteColumn = thirdRowMaster.getCell( 4 ).getStringCellValue().toCharArray()[0] - 'A';
        return new Master( updateTC, firstRowOfTestcase, lastRowOfTestcase, stepColumn, resultColumn, noteColumn );
    }

    @Override
    public MacroMap readMacro( String testcaseFilePath ) throws IOException, EncryptedDocumentException {
        MacroMap macroMap = new MacroMap();

        InputStream inputStream = new FileInputStream( testcaseFilePath );
        Workbook wb = new XSSFWorkbook( inputStream );
        Sheet macroSheet = wb.getSheet( MACRO_SHEET_NAME );
        Iterator<Row> iterator = macroSheet.iterator();
        String macroName, macroValue;
        while ( iterator.hasNext() ) {
            Row currentRow = iterator.next();
            macroName = currentRow.getCell( 0 ).getStringCellValue();
            macroValue = currentRow.getCell( 1 ).getStringCellValue();
            if ( macroName != null && !macroName.isEmpty() )
                macroMap.addMacro( macroName, macroValue );
        }
        return macroMap;
    }

    @Override
    public void writeCommands() throws IOException, EncryptedDocumentException {
        String originalTestcaseFile = getClass().getClassLoader().getResource( "Testcase.xlsx" ).getFile();

        InputStream inputStream = null;
        OutputStream outputStream = null;

        Row row;
        Cell cellCommand, cellParam, cellDescription;
        int i = 3;
        final int COMMAND = 0, PARAMS = 1, DESCRIPTION = 2;

        inputStream = inputStream = new FileInputStream( originalTestcaseFile );

        Workbook wb = WorkbookFactory.create( inputStream );

        CellStyle style = wb.createCellStyle();
        short BLACK = 0;
        style.setBorderBottom( BorderStyle.THIN );
        style.setBorderRight( BorderStyle.THIN );
        style.setBottomBorderColor( BLACK );
        style.setRightBorderColor( BLACK );
        style.setLeftBorderColor( BLACK );
        style.setTopBorderColor( BLACK );
        style.setShrinkToFit( true );
        style.setWrapText( true );

        Sheet commandsSheet = wb.getSheet( COMMANDS_SHEET_NAME );

        for ( Command command : Command.values() ) {
            row = commandsSheet.createRow( i );

            cellCommand = row.createCell( COMMAND );
            cellCommand.setCellValue( command.getValue() );
            cellCommand.setCellStyle( style );

            cellParam = row.createCell( PARAMS );
            cellParam.setCellValue( Arrays.toString( command.getParams() ) );
            cellParam.setCellStyle( style );

            cellDescription = row.createCell( DESCRIPTION );
            cellDescription.setCellValue( command.getDescription() );
            cellDescription.setCellStyle( style );

            i++;
        }
        outputStream = new FileOutputStream( originalTestcaseFile );
        wb.write( outputStream );
        outputStream.close();
        inputStream.close();
    }

    @Override
    public void updateTestcaseIdResult( String testcaseFilePath, Master master, List<Testcase> testcases )
            throws IOException, EncryptedDocumentException {
        if ( master.isUpdateTC() ) {
            Row row;
            InputStream inputStream = null;
            OutputStream outputStream = null;

            inputStream = new FileInputStream( testcaseFilePath );
            Workbook wb = WorkbookFactory.create( inputStream );
            Sheet testcaseSheet = wb.getSheetAt( 0 );
            for ( Testcase testcase : testcases ) {
                row = testcaseSheet.getRow( testcase.getRow() );
                row.getCell( master.getResultColumn() ).setCellValue( testcase.getTestcaseStatus().getName() );
                row.getCell( master.getNoteColumn() ).setCellValue( row.getCell( master.getNoteColumn() ).getStringCellValue() + testcase.getNote() );

                outputStream = new FileOutputStream( testcaseFilePath );
                wb.write( outputStream );
            }
            outputStream.close();
        } else {
            System.out.println( "[info] Auto update testcase is now false!" );
        }
    }

    @Override
    public List<Testcase> initTestcaseList( String testcaseFilePath, Master master ) throws IOException {
        List<Testcase> testcases = new ArrayList<>();
        Row row;
        InputStream inputStream = new FileInputStream( testcaseFilePath );
        Workbook wb = WorkbookFactory.create( inputStream );
        Sheet testcaseSheet = wb.getSheetAt( 0 );
        String tcId, tcStep;

        for ( int i = master.getFirstRowOfTestcase(); i < master.getLastRowOfTestcase(); i++ ) {
            row = testcaseSheet.getRow( i );
            tcId = row.getCell( 0 ).getStringCellValue();
            tcStep = row.getCell( master.getStepColumn() ).getStringCellValue();
            if ( !tcId.isEmpty() && !tcStep.isEmpty() ) {
                Testcase testcase = new Testcase( row.getCell( 0 ).getStringCellValue(), i );
                testcases.add( testcase );
            }
        }
        return testcases;
    }

}
