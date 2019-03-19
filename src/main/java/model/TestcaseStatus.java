package model;

public enum TestcaseStatus
{
    ERROR("Error"), PASSED("Passed"), NOT_PASSED("Failed");
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
