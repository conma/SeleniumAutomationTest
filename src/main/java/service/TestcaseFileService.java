package service;

import model.Master;

public interface TestcaseFileService
{
    // Đọc thông tin master
    public Master readMaster(String testcaseFilePath);
    // Ghi kết quả ra file testcase
}
