package model;

public class Testcase
{
    private String id;
    private int row;
    private String script;

    public Testcase(String id, String script) {
        this.id = id;
        this.script = script;
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

    public void setId(String id)
    {
        this.id = id;
    }

    public String getScript()
    {
        return script;
    }

    public void setScript(String script)
    {
        this.script = script;
    }

}
