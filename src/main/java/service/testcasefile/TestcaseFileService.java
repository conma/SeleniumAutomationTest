package service.testcasefile;

import model.Master;
import model.Testcase;

public interface TestcaseFileService
{
    // Đọc thông tin master
    public Master readMaster( String testcaseFilePath );
    // Ghi kết quả ra file testcase
    public void updateTestcaseIdResult( Master master, Testcase testcase, String testcaseFilePath );
}
