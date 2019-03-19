package model;

public class Master
{
    private boolean updateTC;
    private int firstRowOfTestcase;
    private int lastRowOfTestcase;
    private int stepColumn;
    private int resultColumn;
    private int noteColumn;

    public Master(boolean updateTC, int firstRowOfTestcase, int lastRowOfTestcase, 
            int stepColumn, int resultColumn, int noteColumn) {
        this.updateTC = updateTC;
        this.firstRowOfTestcase = firstRowOfTestcase;
        this.lastRowOfTestcase = lastRowOfTestcase;
        this.stepColumn = stepColumn;
        this.resultColumn = resultColumn;
        this.noteColumn = noteColumn;
    }

    public boolean getUpdateTC()
    {
        return updateTC;
    }

    public void setUpdateTC( boolean updateTC )
    {
        this.updateTC = updateTC;
    }

    public int getFirstRowOfTestcase()
    {
        return firstRowOfTestcase;
    }

    public void setFirstRowOfTestcase( int firstRowOfTestcase )
    {
        this.firstRowOfTestcase = firstRowOfTestcase;
    }

    public int getLastRowOfTestcase()
    {
        return lastRowOfTestcase;
    }

    public void setLastRowOfTestcase( int lastRowOfTestcase )
    {
        this.lastRowOfTestcase = lastRowOfTestcase;
    }

    public int getStepColumn()
    {
        return stepColumn;
    }

    public void setStepsColumn( int stepsColumn )
    {
        this.stepColumn = stepsColumn;
    }

    public int getResultColumn()
    {
        return resultColumn;
    }

    public void setResultColumn( int resultColumn )
    {
        this.resultColumn = resultColumn;
    }

    public int getNoteColumn()
    {
        return noteColumn;
    }

    public void setNoteColumn( int noteColumn )
    {
        this.noteColumn = noteColumn;
    }
}
