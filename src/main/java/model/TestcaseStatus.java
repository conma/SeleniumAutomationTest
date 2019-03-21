package model;

public enum TestcaseStatus
{
    ERROR("Error"), PASSED("Passed"), FAILED("Failed");
    private String name;

    private TestcaseStatus( String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    };
    
}
