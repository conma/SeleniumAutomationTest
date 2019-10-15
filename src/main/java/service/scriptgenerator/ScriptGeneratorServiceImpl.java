package service.scriptgenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import model.MacroMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.ExitCode;
import model.Master;
import service.testcasefile.TestcaseFileService;

@Service
public class ScriptGeneratorServiceImpl implements ScriptGeneratorService
{
    private Master master;

    private final String NEW_LINE = "\n";

    @Autowired
    private TestcaseFileService testcaseFileService;

    @Override
    public void generateScriptFiles( String testcaseFilePath, String scriptFolderPath )
    {
        // Xóa hết các TCs, script cũ
        File scriptDir = new File( scriptFolderPath );
        if ( !scriptDir.exists() )
            scriptDir.mkdirs();
        for ( File file : scriptDir.listFiles() )
            file.delete();

        try
        {
            InputStream testcaseInputStream;
            testcaseInputStream = new FileInputStream( testcaseFilePath );

            Workbook wb = new XSSFWorkbook( testcaseInputStream );

            // Generate Testcase Script files
            master = testcaseFileService.readMaster( testcaseFilePath );

            int firstRowOfTestcase = master.getFirstRowOfTestcase();
            int lastRowOfTestcase = master.getLastRowOfTestcase();
            int AutoStepColumn = master.getStepColumn();

            Sheet sheet = wb.getSheetAt( 0 );
            for ( int i = firstRowOfTestcase; i <= lastRowOfTestcase; i++ )
            {
                Row tcRow = sheet.getRow( i );

                String testcaseAutoStep = tcRow.getCell( AutoStepColumn ).getStringCellValue().trim();
                if ( testcaseAutoStep.equals( null ) || testcaseAutoStep.equals( "" ) )
                {
                    continue;
                }

                String testcaseId = tcRow.getCell( 0 ).getStringCellValue();
                File file = new File( scriptFolderPath + "/" + testcaseId );
                FileWriter scriptFileWriter = new FileWriter( file );

                scriptFileWriter.write( "begin" + NEW_LINE );
                scriptFileWriter.write( testcaseAutoStep.replaceAll( "^", "\t" ).replaceAll( "\n", "\n\t" ) );
                scriptFileWriter.write( NEW_LINE );
                scriptFileWriter.write( "end" );
                scriptFileWriter.close();
            }

            // Generate Macro files
            MacroMap macroMap = testcaseFileService.readMacro( testcaseFilePath );
            for ( Map.Entry<String, String> entry : macroMap.getMacro().entrySet())
            {
                File file = new File( scriptFolderPath + "/" + entry.getKey() );
                FileWriter scriptFileWriter = new FileWriter( file );

                scriptFileWriter.write( "begin" + NEW_LINE );
                scriptFileWriter.write( entry.getValue().replaceAll( "^", "\t" ).replaceAll( "\n", "\n\t" ) );
                scriptFileWriter.write( NEW_LINE );
                scriptFileWriter.write( "end" );
                scriptFileWriter.close();
            }

        }
        catch ( FileNotFoundException e )
        {
            System.out.println( "Testcase file not found at: " + testcaseFilePath + "\nTry another path to Testcase file!" );
            e.printStackTrace();
            System.exit( ExitCode.TESTCASE_FILE_NOT_FOUND );
        }
        catch ( EncryptedDocumentException e )
        {
            System.out.println( "File " + testcaseFilePath + " is encrypted!" );
            System.out.println( "Error code: " + ExitCode.TESTCASE_FILE_ENCRYPTED );
            System.exit( ExitCode.TESTCASE_FILE_ENCRYPTED );
        }
        catch ( IOException e )
        {
            System.out.println( "Error when generating scritp files!" );
            e.printStackTrace();
            System.exit( ExitCode.IO_EXCEPTION_SCRIPT_GENERATOR );
        }

    }

}
