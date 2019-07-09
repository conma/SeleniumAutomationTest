package service.testcasefile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import model.MacroMap;
import org.apache.poi.EncryptedDocumentException;

import model.Master;
import model.Testcase;

public interface TestcaseFileService
{
    // Đọc thông tin master
    public Master readMaster( String testcaseFilePath ) throws FileNotFoundException, IOException, EncryptedDocumentException;
    // Đọc thông tin macro
    public MacroMap readMacro(String testcaseFilePath ) throws FileNotFoundException, IOException, EncryptedDocumentException;
    // Ghi kết quả ra file testcase
    public void updateTestcaseIdResult( String testcaseFilePath, Master master, List<Testcase> testcases ) throws FileNotFoundException, IOException, EncryptedDocumentException;
}
