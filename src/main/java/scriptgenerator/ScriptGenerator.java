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

public class ScriptGenerator
{
    private static final String TAB = "\t";

    private static final String NEW_LINE = "\n";

    public static void main( String[] args )
    {
        try
        {
            scriptGenerator( "testcases/Testcases.xls", "scripts/Tescases.txt" );
        }
        catch ( EncryptedDocumentException | IOException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void scriptGenerator( String testcaseFilePath, String scriptFilePath ) throws EncryptedDocumentException, IOException
    {
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
        // int expectColumn = thirdRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';
        // int resultColumn = fourthRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';
        // int noteColumn = fifthRowMaster.getCell(4).getStringCellValue().toCharArray()[0] - 'A';

        File file = new File( scriptFilePath );
        FileWriter scriptFileWriter = new FileWriter( file );
        scriptFileWriter.write( "begin" + NEW_LINE );

        String updateTCs = thirdRowMaster.getCell( 1 ).getStringCellValue();

        scriptFileWriter.write( TAB + "updateTCs: " + updateTCs );
        // scriptFileWriter.write( TAB + "" +  + NEW_LINE);
        scriptFileWriter.write( NEW_LINE );

        Sheet sheet = wb.getSheetAt( 0 );
        for ( int i = firstRowOfTestcase; i <= lastRowOfTestcase; i++ )
        {
            Row tcRow = sheet.getRow( i );

            String testcaseId = tcRow.getCell( 0 ).getStringCellValue();
            String testcaseAuto = tcRow.getCell( autoColumn ).getStringCellValue();
            String testcaseStep = tcRow.getCell( stepColumn ).getStringCellValue();

            scriptFileWriter.write( NEW_LINE +  TAB + "testcaseId: " + testcaseId );
            scriptFileWriter.write( TAB + "testcaseAuto: " + testcaseAuto + NEW_LINE);
            String steps = testcaseStep; //.replaceAll( "^1\\.\\s+", "\t\t" ); 
            steps = steps.replaceAll( "\\d+\\.\\s+", "\t\t" );
            steps = steps.replaceFirst( "(?i)mở trang", "get" );
            steps = steps.replaceAll( "(?i)[Đđ]iền", "sendKeys" );
            steps = steps.replaceAll( "(?i)click\\s+button\\s+", "clickButton " );
            steps = steps.replaceAll( "(?i)click\\s+link\\s+", "clickLink " );
            steps = steps.replaceAll( "(?i)vào\\s+textbox\\s+", " " );
            
            scriptFileWriter.write( steps + "\n\tendTC" + NEW_LINE);

            System.out.print( "\nid " + testcaseId );
            System.out.print( "\tauto:" + testcaseAuto );
            System.out.print( "\n\tstep:" + steps );
            String target = "FOOBar";
            target = target.replaceAll("(?i)foo", "");
            System.out.println(NEW_LINE + target);
        }

        scriptFileWriter.write( "end" );
        // Đóng luồng
        scriptFileWriter.close();
    }
}
