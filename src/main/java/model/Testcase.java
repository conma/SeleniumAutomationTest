package model;

public class Testcase
{
    private String id;

    private int row;

    private String scriptFileName;

    private TestcaseStatus testcaseStatus;

    private String note;

    public Testcase( String scriptFileName )
    {
        this.id = scriptFileName.split( "-" )[0];
        this.row = Integer.parseInt( scriptFileName.split( "-" )[1] );
        this.scriptFileName = scriptFileName;
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
