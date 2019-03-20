package service.testcasefile;

import java.io.InputStream;
import java.io.OutputStream;

import model.Master;
import model.Testcase;

public interface TestcaseFileService
{
    // Đọc thông tin master
    public Master readMaster( InputStream inputStream );
    // Ghi kết quả ra file testcase
    public void updateTestcaseIdResult( InputStream inputStream, OutputStream outputStream, Master master, Testcase testcase );
}
