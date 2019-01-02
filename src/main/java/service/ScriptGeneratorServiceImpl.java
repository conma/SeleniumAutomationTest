package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
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
public class ScriptGeneratorServiceImpl
{
    private Master master;

    private final String TAB = "\t";

    private final String NEW_LINE = "\n";

    private final String START = NEW_LINE + TAB;

    public static void main( String[] args )
    {
        try
        {
            new ScriptGeneratorServiceImpl().scriptGenerator( "testcases/Testcases.xls", "scripts" );
        }
        catch ( EncryptedDocumentException | IOException e )
        {
            System.out.println( "File not found or can't read!" );
        }
    }

    public void scriptGenerator( String testcaseFilePath, String scriptFolderPath ) throws EncryptedDocumentException, IOException
    {
        boolean tcAuto = false;
        InputStream testcasesInputStream = new FileInputStream( testcaseFilePath );
        Workbook wb = WorkbookFactory.create( testcasesInputStream );

        master = new TestcaseFileServiceImpl().readMaster( testcaseFilePath );

        int firstRowOfTestcase = master.getFirstRowOfTestcase();
        int lastRowOfTestcase = master.getLastRowOfTestcase();
        int autoColumn = master.getAutoColumn();
        int stepColumn = master.getStepColumn();
        int expectColumn = master.getExpectColumn();

        Sheet sheet = wb.getSheetAt( 0 );
        for ( int i = firstRowOfTestcase; i <= lastRowOfTestcase; i++ )
        {
            Row tcRow = sheet.getRow( i );

            String testcaseAuto = tcRow.getCell( autoColumn ).getStringCellValue();
            if ( testcaseAuto.equalsIgnoreCase( "false" ) || testcaseAuto.equalsIgnoreCase( "f" ) )
            {
                tcAuto = false;
            }
            else
            {
                tcAuto = true;
            }
            if ( !tcAuto )
            {
                return;
            }

            String testcaseId = tcRow.getCell( 0 ).getStringCellValue();
            File file = new File( scriptFolderPath + "/" + testcaseId );
            FileWriter scriptFileWriter = new FileWriter( file );

            scriptFileWriter.write( "begin" + NEW_LINE );

            // TODO generate script here
            String testcaseStep = tcRow.getCell( stepColumn ).getStringCellValue();
            String scriptStep = generateStep( testcaseStep );

            // TODO generate expect
            String testcaseExpect = tcRow.getCell( expectColumn ).getStringCellValue();
            String scriptExpect = generateExpect( testcaseExpect );

            scriptFileWriter.write( scriptStep );
            scriptFileWriter.write( START + scriptExpect );

            scriptFileWriter.write( NEW_LINE );
            scriptFileWriter.write( "end" );
            // end the Testcase
            // Đóng luồng
            scriptFileWriter.close();

        }

    }

    private String generateStep( String orginalStep )
    {
        String step = orginalStep;
        step = step.replaceAll( "\\d+\\.\\s+", "\t" );
        step = step.replaceFirst( "(?i)mở trang", "get" );
        step = step.replaceAll( "(?i)[Đđ]iền", "sendKeys" );
        step = step.replaceAll( "(?i)click\\s+button\\s+", "clickButton " );
        step = step.replaceAll( "(?i)click\\s+link\\s+", "clickLink " );
        step = step.replaceAll( "(?i)vào\\s+textbox\\s+", " " );
        step = step.replaceAll( "“", "\"" );
        step = step.replaceAll( "”", "\"" );

        return step;
    }

    private String generateExpect( String testcaseExpect )
    {
        // TODO Auto-generated method stub
        return testcaseExpect;
    }
}
