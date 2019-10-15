package model;

public class Testcase
{
    private static final int TESTCASE_ID = 0;
    private static final int ROW = 1;
    private static final String HYPHEN = "-";

    private String id;

    private int row;

    private String scriptFileName;

    private TestcaseStatus testcaseStatus;

    private String note;

    public Testcase( String scriptFileName )
    {
        this.id = scriptFileName.split( HYPHEN )[TESTCASE_ID];
        this.row = Integer.parseInt( scriptFileName.split( HYPHEN )[ROW] );
        this.scriptFileName = scriptFileName;
        this.testcaseStatus = TestcaseStatus.PASSED;
        this.note = "";
    }

    public Testcase(String id, int row) {
        this.id = id;
        this.row = row;
        this.scriptFileName = id;
        this.testcaseStatus = TestcaseStatus.PASSED;
        this.note = "";
    }

    public String getId()
    {
        return id;
    }

    public int getRow()
    {
        return row;
    }

    public void setRow( int row )
    {
        this.row = row;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public String getScriptFileName()
    {
        return scriptFileName;
    }

    public void setScriptFileName( String scriptFileName )
    {
        this.scriptFileName = scriptFileName;
    }

    public TestcaseStatus getTestcaseStatus()
    {
        return testcaseStatus;
    }

    public void setTestcaseStatus( TestcaseStatus testcaseStatus )
    {
        this.testcaseStatus = testcaseStatus;
    }

    public String getNote()
    {
        return note;
    }

    public void setNote( String note )
    {
        this.note = note;
    }

}
