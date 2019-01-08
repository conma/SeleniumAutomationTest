package model;

public class Testcase
{
    private String id;

    private int row;

    private String scriptFileName;

    public Testcase( String id, String scriptFileName )
    {
        this.id = id;
        this.scriptFileName = scriptFileName;
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

}
