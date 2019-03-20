package service.scriptgenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.ErrorCode;
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
        // Xóa hết các TCs cũ
        File scriptDir = new File( scriptFolderPath );
        for ( File file : scriptDir.listFiles() )
            file.delete();

        try
        {
            InputStream testcaseInputStream;
            testcaseInputStream = new FileInputStream( testcaseFilePath );

            Workbook wb = WorkbookFactory.create( testcaseInputStream );

            master = testcaseFileService.readMaster( testcaseFilePath );

            int firstRowOfTestcase = master.getFirstRowOfTestcase();
            int lastRowOfTestcase = master.getLastRowOfTestcase();
            int AutoStepColumn = master.getStepColumn();

            Sheet sheet = wb.getSheetAt( 0 );
            for ( int i = firstRowOfTestcase; i <= lastRowOfTestcase; i++ )
            {
                Row tcRow = sheet.getRow( i );

                String testcaseAutoStep = tcRow.getCell( AutoStepColumn ).getStringCellValue();
                if ( testcaseAutoStep.equals( null ) || testcaseAutoStep.equals( "" ) )
                {
                    return;
                }

                String testcaseId = tcRow.getCell( 0 ).getStringCellValue();
                File file = new File( scriptFolderPath + "/" + testcaseId + "-" + i );
                FileWriter scriptFileWriter = new FileWriter( file );

                scriptFileWriter.write( "begin" + NEW_LINE );
                scriptFileWriter.write( testcaseAutoStep.replaceAll( "^", "\t" ).replaceAll( "\n", "\n\t" ) );
                scriptFileWriter.write( NEW_LINE );
                scriptFileWriter.write( "end" );
                scriptFileWriter.close();
            }
            testcaseInputStream.close();
        }
        catch ( FileNotFoundException e )
        {
            System.out.println( "Testcase file not found at: " + testcaseFilePath
                    + "\nTry another path to Testcase file!");
            e.printStackTrace();
            System.exit( ErrorCode.TESTCASE_FILE_NOT_FOUND );
        }
        catch ( EncryptedDocumentException e )
        {
            System.out.println( "Testcase file is encrypted!" );
            e.printStackTrace();
            System.exit( ErrorCode.TESTCASE_FILE_ENCRYPTED );
        }
        catch ( IOException e )
        {
            System.out.println( "Error when generating scritp files!" );
            e.printStackTrace();
            System.exit( ErrorCode.IO_EXCEPTION_SCRIPT_GENERATOR );
        }

    }

}
