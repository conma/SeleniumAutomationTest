package model;

public class ExitCode
{
    /*
     * Program: 0-9
     * Browser and Driver: 1xx
     * Test case file: 8xx
     * Script folder: 3xx
     * UNKNOWN - 4xx
     */
    public static final int PROGRAM_EXCUTE_SUCCESSED = 0;
    public static final int WRONG_PARAMETER = 1;

    public static final int WRONG_BROWSER_NAME = 100;
    public static final int DRIVER_NOT_FOUND = 101;
    public static final int BROWSER_AND_DRIVER_NOT_MATCH = 102;

    public static final int TESTCASE_FILE_NOT_FOUND = 800;
    public static final int TESTCASE_FILE_ENCRYPTED = 801;
    public static final int TESTCASE_FILE_IN_USE = 810;
    public static final int IO_EXCEPTION_SCRIPT_GENERATOR = 850;

    public static final int SCRIPT_FOLDER_NOT_FOUND = 300;

    public static final int UNKNOWN_SELENE_ERROR = 400;
}
