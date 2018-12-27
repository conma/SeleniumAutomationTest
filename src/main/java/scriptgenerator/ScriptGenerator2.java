package scriptgenerator;

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

/*
 * Đọc các testcase từ 1 file TC
 * Mỗi TCs được genrate ra thành 1 file riêng
 * Chạy từng file riêng lẻ
 */

public class ScriptGenerator2
{
    private static final String TAB = "\t";

    private static final String NEW_LINE = "\n";

    private static final String START = NEW_LINE + TAB + TAB;

    public static void main( String[] args )
    {
        try
        {
            scriptGenerator( "testcases/Testcases.xls", "scripts" );
        }
        catch ( EncryptedDocumentException | IOException e )
        {
            System.out.println( "File not found or can't read!" );
        }
    }

    public static void scriptGenerator( String testcaseFilePath, String scriptFolderPath ) throws EncryptedDocumentException, IOException
    {
        boolean tcAuto = false;
        InputStream testcasesInputStream = new FileInputStream( testcaseFilePath );
        Workbook wb = WorkbookFactory.create( testcasesInputStream );

        Sheet master = wb.getSheet( "master" );
        Row firstRowMaster = master.getRow( 0 );
        Row secondRowMaster = master.getRow( 1 );
        Row thirdRowMaster = master.getRow( 2 );
        // Row fourthRowMaster = master.getRow(3);
        // Row fifthRowMaster = master.getRow(4);

        int firstRowOfTestcase = (int) firstRowMaster.getCell( 1 ).getNumericCellValue() - 1;
        int lastRowOfTestcase = (int) secondRowMaster.getCell( 1 ).getNumericCellValue() - 1;
        int autoColumn = firstRowMaster.getCell( 4 ).getStringCellValue().toCharArray()[0] - 'A';
        int stepColumn = secondRowMaster.getCell( 4 ).getStringCellValue().toCharArray()[0] - 'A';
        int expectColumn = thirdRowMaster.getCell( 4 ).getStringCellValue().toCharArray()[0] - 'A';
        // int resultColumn = fourthRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';
        // int noteColumn = fifthRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';

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

            // if TC is tested by selenium, generate TCs
            String testcaseId = tcRow.getCell( 0 ).getStringCellValue();
            File file = new File( scriptFolderPath + "/" + testcaseId );
            FileWriter scriptFileWriter = new FileWriter( file );

            // begin the Testcase
            scriptFileWriter.write( "begin" );

            String testcaseStep = tcRow.getCell( stepColumn ).getStringCellValue();
            String testcaseExpect = tcRow.getCell( expectColumn ).getStringCellValue();

            scriptFileWriter.write( NEW_LINE + TAB + "testcaseId: " + testcaseId );
            scriptFileWriter.write( TAB + "testcaseAuto: " + testcaseAuto + NEW_LINE );
            String steps = testcaseStep; // .replaceAll( "^1\\.\\s+", "\t\t" );
            steps = steps.replaceAll( "\\d+\\.\\s+", "\t\t" );
            steps = steps.replaceFirst( "(?i)mở trang", "get" );
            steps = steps.replaceAll( "(?i)[Đđ]iền", "sendKeys" );
            steps = steps.replaceAll( "(?i)click\\s+button\\s+", "clickButton " );
            steps = steps.replaceAll( "(?i)click\\s+link\\s+", "clickLink " );
            steps = steps.replaceAll( "(?i)vào\\s+textbox\\s+", " " );
            steps = steps.replaceAll( "“", "\"" );
            steps = steps.replaceAll( "”", "\"" );

            scriptFileWriter.write( steps );
            scriptFileWriter.write( START + testcaseExpect );
            scriptFileWriter.write( "\n\tendTC" + NEW_LINE );

            System.out.print( "\nid " + testcaseId );
            System.out.print( "\tauto:" + testcaseAuto );
            System.out.print( "\n\tstep:" + steps );

            scriptFileWriter.write( "end" );
            // end the Testcase
            // Đóng luồng
            scriptFileWriter.close();

        }

    }
}
