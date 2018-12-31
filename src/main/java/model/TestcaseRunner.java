package model;

public class TestcaseRunner
{
    private boolean auto;
    private Testcase testcase;

    public TestcaseRunner() {
        this.auto = false;
        this.testcase = new Testcase("DF_TCID", "BLANK_TC_SCRIPT");
    }

    public TestcaseRunner(boolean auto, Testcase testcase) {
        this.auto = auto;
        this.testcase = testcase;
    }

    public boolean isAuto()
    {
        return auto;
    }

    public void setAuto(boolean auto)
    {
        this.auto = auto;
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
