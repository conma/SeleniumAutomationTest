package service.testcasefile;

import java.util.List;

import model.Master;
import model.Testcase;

public interface TestcaseFileService
{
    // Đọc thông tin master
    public Master readMaster( String testcaseFilePath );
    // Ghi kết quả ra file testcase
    public void updateTestcaseIdResult( String testcaseFilePath, Master master, List<Testcase> testcases );
}
