package model;

public class Master
{
    private String auto;
    private String updateTC;
    private int firstRowOfTestcase;
    private int lastRowOfTestcase;
    private int idColumn;
    private int stepsColumn;
    private int expectColumn;
    private int resultColumn;
    private int noteColumn;

    public Master(String auto, String updateTC, int firstRowOfTestcase, int lastRowOfTestcase, int idColumn,
            int stepsColumn, int expectColumn, int resultColumn, int noteColumn) {
        this.auto = auto;
        this.updateTC = updateTC;
        this.firstRowOfTestcase = firstRowOfTestcase;
        this.lastRowOfTestcase = lastRowOfTestcase;
        this.idColumn = idColumn;
        this.stepsColumn = stepsColumn;
        this.expectColumn = expectColumn;
        this.resultColumn = resultColumn;
        this.noteColumn = noteColumn;
    }

    public String getAuto()
    {
        return auto;
    }

    public void setAuto(String auto)
    {
        this.auto = auto;
    }

    public String getUpdateTC()
    {
        return updateTC;
    }

    public void setUpdateTC(String updateTC)
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

    public int getStepsColumn()
    {
        return stepsColumn;
    }

    public void setStepsColumn(int stepsColumn)
    {
        this.stepsColumn = stepsColumn;
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
