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
    public Master readMaster( String testcaseFilePath ) throws IOException, EncryptedDocumentException;

    // Đọc thông tin macro
    public MacroMap readMacro(String testcaseFilePath ) throws IOException, EncryptedDocumentException;

    // Ghi thông tin các lệnh
    public void writeCommands() throws IOException, EncryptedDocumentException;

    // Ghi kết quả ra file testcase
    public void updateTestcaseIdResult( String testcaseFilePath, Master master, List<Testcase> testcases ) throws IOException, EncryptedDocumentException;

    List<Testcase> initTestcaseList( String testcaseFilePath, Master master ) throws IOException;
}
