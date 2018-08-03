package com.framework.cylab.labportal.Config;

public class AjaxResult {

    private String resultCode;
    private String resultMessage;
    private Object data;
    private Object otherData;
    private String debugMessage;
    private String extra;
    private int totalCount;
    private int nExtra;


    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }
    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getDebugMessage() {
        return debugMessage;
    }
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra) {
        this.extra = extra;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public int getnExtra() {
        return nExtra;
    }
    public void setnExtra(int nExtra) {
        this.nExtra = nExtra;
    }
    public Object getOtherData() {
        return otherData;
    }
    public void setOtherData(Object otherData) {
        this.otherData = otherData;
    }

}
