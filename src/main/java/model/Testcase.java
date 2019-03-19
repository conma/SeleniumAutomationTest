package model;

import java.util.ArrayList;
import java.util.List;

public class Testcase
{
    private String id;

    private int row;

    private String scriptFileName;

    private TestcaseStatus testcaseStatus;

    private List<String> info;

    private List<String> error;

    public Testcase( String scriptFileName )
    {
        this.id = scriptFileName.split( "-" )[0];
        this.row = Integer.parseInt( scriptFileName.split( "-" )[1] );
        this.scriptFileName = scriptFileName;
        this.testcaseStatus = TestcaseStatus.PASSED;
        this.info = new ArrayList<String>();
        this.error = new ArrayList<String>();
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

    public List<String> getInfo()
    {
        return info;
    }

    public void setInfo( List<String> info )
    {
        this.info = info;
    }

    public List<String> getError()
    {
        return error;
    }

    public void setError( List<String> error )
    {
        this.error = error;
    }

}
