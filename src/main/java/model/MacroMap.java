package model;

import java.util.HashMap;
import java.util.Map;

public class MacroMap
{
    private Map<String, String> macro;

    public MacroMap()
    {
        this.macro = new HashMap<String, String>();
    }

    public Map<String, String> getMacro()
    {
        return macro;
    }

    public void setMacro( Map<String, String> macro )
    {
        this.macro = macro;
    }

    public void addMacro( String macroName, String value )
    {
        macro.put( macroName, value );
    }

    public String getMacroValue( String macroName )
    {
        return macro.get( macroName );
    }
}
