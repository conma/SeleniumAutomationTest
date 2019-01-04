package model;

public class Master
{
    private boolean updateTC;
    private int autoColumn;
    private int firstRowOfTestcase;
    private int lastRowOfTestcase;
    private int idColumn;
    private int stepColumn;
    private int expectColumn;
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

    public int getAutoColumn()
    {
        return autoColumn;
    }

    public void setAutoColumn(int autoColumn)
    {
        this.autoColumn = autoColumn;
    }

    public boolean getUpdateTC()
    {
        return updateTC;
    }

    public void setUpdateTC(boolean updateTC)
    {
        this.updateTC = updateTC;
    }

    public int getFirstRowOfTestcase()
    {
        return firstRowOfTestcase;
    }

    public void setFirstRowOfTestcase(int firstRowOfTestcase)
    {
        this.firstRowOfTestcase = firstRowOfTestcase;
    }

    public int getLastRowOfTestcase()
    {
        return lastRowOfTestcase;
    }

    public void setLastRowOfTestcase(int lastRowOfTestcase)
    {
        this.lastRowOfTestcase = lastRowOfTestcase;
    }

    public int getIdColumn()
    {
        return idColumn;
    }

    public void setIdColumn(int idColumn)
    {
        this.idColumn = idColumn;
    }

    public int getStepColumn()
    {
        return stepColumn;
    }

    public void setStepsColumn(int stepsColumn)
    {
        this.stepColumn = stepsColumn;
    }

    public int getExpectColumn()
    {
        return expectColumn;
    }

    public void setExpectColumn(int expectColumn)
    {
        this.expectColumn = expectColumn;
    }

    public int getResultColumn()
    {
        return resultColumn;
    }

    public void setResultColumn(int resultColumn)
    {
        this.resultColumn = resultColumn;
    }

    public int getNoteColumn()
    {
        return noteColumn;
    }

    public void setNoteColumn(int noteColumn)
    {
        this.noteColumn = noteColumn;
    }
}
