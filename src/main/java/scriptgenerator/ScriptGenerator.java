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

public class ScriptGenerator {
    public static void main(String[] args) {
        try {
            scriptGenerator("testcases/Testcases.xls");
        } catch (EncryptedDocumentException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void scriptGenerator(String filePath) throws EncryptedDocumentException, IOException {
        InputStream testcasesInputStream = new FileInputStream(filePath);
        Workbook wb = WorkbookFactory.create(testcasesInputStream);

        Sheet master = wb.getSheet("master");
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

        Sheet sheet = wb.getSheetAt(0);
        for (int i = firstRowOfTestcase; i <= lastRowOfTestcase; i++) {
            Row tcRow = sheet.getRow(i);
            String tcId = tcRow.getCell(0).getStringCellValue();
            String autoTest = tcRow.getCell(autoColumn).getStringCellValue();
            String step = tcRow.getCell(stepColumn).getStringCellValue();
            String expect = tcRow.getCell(expectColumn).getStringCellValue();
            String result = tcRow.getCell(resultColumn).getStringCellValue();
            String note = tcRow.getCell(noteColumn).getStringCellValue();
            
            System.out.print("\nid " + tcId);
            System.out.print("\tauto:" + autoTest);
            System.out.print("\n\tstep:" + step);
            System.out.print("\texpect:" + expect);
            System.out.print("\tresult:" + result);
            System.out.print("\tnote:" + note);
        }
    }
}
