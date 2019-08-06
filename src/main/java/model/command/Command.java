package model.command;

import java.util.Arrays;

public enum Command
{
    GET("get", "Truy cập Url", Command.PARAM_URL),
    ACCESS("access", "Truy cập Url", Command.PARAM_URL),
    CLICK("click", "Click phần tử", Command.PARAM_ELEMENT),
    DOUBLE_CLICK("doubleClick", "Double click vào phần tử", Command.PARAM_ELEMENT),
    SEND_KEYS("sendKeys", "Input dữ liệu vào thẻ input/textarea", Command.PARAM_ELEMENT, Command.PARAM_STRING),
    HOVER("hover", "hover vào phần tử", Command.PARAM_ELEMENT),

    ENABLE_ELEMENT_BY_ID("enableElementById", "Enable phần tử theo id", Command.PARAM_ELEMENT),
    ENABLE_ELEMENT_BY_NAME("enableElementByName", "Enable phần tử theo name", Command.PARAM_ELEMENT),
    ENABLE_ELEMENT_BY_XPATH("enableElementByXPath", "Enable phần tử theo XPath", Command.PARAM_ELEMENT),
    SELECT_BY_INDEX("selectByIndex", "Select select box theo vị trí", Command.PARAM_ELEMENT, Command.PARAM_POSITION),
    SELECT_BY_TEXT("selectByText", "Select select box theo text", Command.PARAM_ELEMENT, Command.PARAM_STRING),

    VERIFY_TEXT("verifyText", "Kiểm tra text của phần tử", Command.PARAM_ELEMENT, Command.PARAM_STRING),
    VERIFY_TITLE("verifyTitle", "Kiểm tra tiêu đề trang web", Command.PARAM_STRING),
    VERIFY_ENABLE("verifyEnable", "Kiểm tra phần tử được enable", Command.PARAM_ELEMENT),
    VERIFY_DISABLE("verifyDisable", "Kiểm tra phần tử được disable", Command.PARAM_ELEMENT),
    VERIFY_NOT_FOUND("verifyNotFound", "Kiểm tra không tồn tại phần tử", Command.PARAM_ELEMENT),
    VERIFY_CHECKED("verifyChecked", "Kiểm tra radio button được check", Command.PARAM_ELEMENT),
    VERIFY_CHECKEDS("verifyCheckeds", "Kiểm tra các radio button được check (VD: verifyCheckeds  \"element1, element2, element3\")", Command.PARAM_ELEMENTS),
    VERIFY_NOT_CHECKED("verifyNotChecked", "Kiểm tra radio button chưa được check", Command.PARAM_ELEMENT),
    VERIFY_NOT_CHECKEDS("verifyNotCheckeds", "Kiểm tra các radio button chưa được check (VD: verifyCheckeds  \"element1, element2, element3\")", Command.PARAM_ELEMENTS),

    EXEC("exec", "Thực hiện macro, macro lấy trong file testcase, sheet \"Macro\"", Command.PARAM_MACRO),
    WAIT_SECOND("waitSecond", "Đợi chính xác số giây", Command.PARAM_SECONDS),
    QUIT("quit", "Thoát chương trình", Command.PARAM_NONE);

    private String value;
    private String description;
    private String[] params;

    private static final String PARAM_ELEMENT = "element";
    private static final String PARAM_ELEMENTS = "elements";
    private static final String PARAM_STRING = "string";
    private static final String PARAM_URL = "url";
    private static final String PARAM_MACRO = "macro";
    private static final String PARAM_SECONDS = "seconds";
    private static final String PARAM_POSITION = "position";
    private static final String PARAM_NONE = "none";

    Command( String value, String description, String... params )
    {
        this.value = value;
        this.description = description;
        this.params = params;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }

    public String[] getParams()
    {
        return params;
    }

    public void setParams( String[] params )
    {
        this.params = params;
    }

    @Override
    public String toString()
    {
        return "Command{" +
                "value='" + value + '\'' +
                ", params=" + Arrays.toString(params) +
                ", description='" + description + '\'' +
                '}';
    }
}
