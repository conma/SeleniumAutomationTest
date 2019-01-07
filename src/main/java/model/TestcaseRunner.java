package model;

import org.openqa.selenium.WebDriver;

public class TestcaseRunner
{
    private static String property;
    private static String driverPath;
    private static WebDriver driver;
    private static boolean auto;
    private static Master master;
    private Testcase testcase;

    public TestcaseRunner(String property, String driverPath, boolean auto, WebDriver driver, Master master) {
        TestcaseRunner.property = property;
        TestcaseRunner.driverPath = driverPath;
        TestcaseRunner.auto = auto;
        TestcaseRunner.master = master;
        TestcaseRunner.driver = driver;
        this.testcase = new Testcase("", "");
    }

    public void run() {
        /*
         * for(String tcIdFile : tcIdFiles) {
         *  TCRunner = new TCRunner()
         * 
         * 
         * 
         * }
         */
    }
    public static String getProperty()
    {
        return property;
    }

    public static void setProperty( String property )
    {
        TestcaseRunner.property = property;
    }

    public static String getDriverPath()
    {
        return driverPath;
    }

    public static void setDriverPath( String driverPath )
    {
        TestcaseRunner.driverPath = driverPath;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    public static void setDriver( WebDriver driver )
    {
        TestcaseRunner.driver = driver;
    }

    public boolean isAuto()
    {
        return auto;
    }

    public void setAuto(boolean auto)
    {
        TestcaseRunner.auto = auto;
    }

    public static Master getMaster()
    {
        return master;
    }

    public static void setMaster( Master master )
    {
        TestcaseRunner.master = master;
    }

    public Testcase getTestcase()
    {
        return testcase;
    }

    public void setTestcase(Testcase testcase)
    {
        this.testcase = testcase;
    }
}
