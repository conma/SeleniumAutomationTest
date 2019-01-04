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
public class ScriptGeneratorServiceImpl implements ScriptGeneratorService
{
    private Master master;

    private final String NEW_LINE = "\n";

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

    @Override
    public void scriptGenerator( String testcaseFilePath, String scriptFolderPath ) throws EncryptedDocumentException, IOException
    {
        // Xóa hết các TCs cũ
        File scriptDir = new File(scriptFolderPath);
        for(File file: scriptDir.listFiles()) 
                file.delete();

        InputStream testcasesInputStream = new FileInputStream( testcaseFilePath );
        Workbook wb = WorkbookFactory.create( testcasesInputStream );

        master = new TestcaseFileServiceImpl().readMaster( testcaseFilePath );

        int firstRowOfTestcase = master.getFirstRowOfTestcase();
        int lastRowOfTestcase = master.getLastRowOfTestcase();
        int stepColumn = master.getStepColumn();

        Sheet sheet = wb.getSheetAt( 0 );
        for ( int i = firstRowOfTestcase; i <= lastRowOfTestcase; i++ )
        {
            Row tcRow = sheet.getRow( i );

            String testcaseStep = tcRow.getCell( stepColumn ).getStringCellValue();
            if ( testcaseStep.equals( null ) || testcaseStep.equals( "" ) ) {
                return;
            }

            String testcaseId = tcRow.getCell( 0 ).getStringCellValue();
            File file = new File( scriptFolderPath + "/" + testcaseId );
            FileWriter scriptFileWriter = new FileWriter( file );

            scriptFileWriter.write( "begin" + NEW_LINE );
            scriptFileWriter.write( testcaseStep.replaceAll( "^", "\t" ).replaceAll( "\n", "\n\t" ) );
            scriptFileWriter.write( NEW_LINE );
            scriptFileWriter.write( "end" );

            // Đóng luồng
            scriptFileWriter.close();

        }

    }

}
