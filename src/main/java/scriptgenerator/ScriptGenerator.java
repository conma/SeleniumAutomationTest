package scriptgenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ScriptGenerator
{
    public static void main( String[] args )
    {
        try
        {
            scriptGenerator( "testcases/Testcases.xls" );
        }
        catch ( EncryptedDocumentException | IOException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void scriptGenerator( String filePath ) throws EncryptedDocumentException, IOException
    {
        InputStream inp = new FileInputStream( filePath );
        Workbook wb = WorkbookFactory.create( inp );
        Sheet sheet = wb.getSheetAt( 0 );
        int firstRowOfTestcase1 = (int) sheet.getRow( 4 ).getCell( 1 ).getNumericCellValue();
        int firstRowOfTestcase2 = (int) sheet.getRow( 5 ).getCell( 1 ).getNumericCellValue();
        int numOfTCs = firstRowOfTestcase2 - firstRowOfTestcase1;
        System.out.println( "Numof TCs: " + numOfTCs);
        for(int i=firstRowOfTestcase1; i <  firstRowOfTestcase2; i++) {
            System.out.println( sheet.getRow( i ).getCell( 0 ).getStringCellValue() );
        }
    }
}
