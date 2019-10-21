package model;

public class Testcase
{
    private String id;

    private int row;

    private TestcaseStatus testcaseStatus;

    private String note;

    public Testcase(String id, int row) {
        this.id = id;
        this.row = row;
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
