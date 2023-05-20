package co.com.accenture.automation.utils;

public enum MsgError {
    MSG_VALUE_ERROR_LOGIN("Value no found in login, expect \"%s\", actual \"%s\""),
    MSG_VALUE_ERROR_SHOPPING_CART("Value no found in shopping cart, expect \"%s\", actual \"%s\"");
    private String msg;

    private MsgError(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}