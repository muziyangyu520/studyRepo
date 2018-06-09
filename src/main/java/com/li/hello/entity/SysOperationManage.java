package com.li.hello.entity;

public class SysOperationManage {
    private String operId;

    private String operName;

    private String operCode;

    private String operType;

    private String resKey;

    private String linkUrl;

    private String operFun;

    private String createTime;

    private String state;

    private String operClass;

    public SysOperationManage(String operId, String operName, String operCode, String operType, String resKey, String linkUrl, String operFun, String createTime, String state, String operClass) {
        this.operId = operId;
        this.operName = operName;
        this.operCode = operCode;
        this.operType = operType;
        this.resKey = resKey;
        this.linkUrl = linkUrl;
        this.operFun = operFun;
        this.createTime = createTime;
        this.state = state;
        this.operClass = operClass;
    }

    public SysOperationManage() {
        super();
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode == null ? null : operCode.trim();
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    public String getResKey() {
        return resKey;
    }

    public void setResKey(String resKey) {
        this.resKey = resKey == null ? null : resKey.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getOperFun() {
        return operFun;
    }

    public void setOperFun(String operFun) {
        this.operFun = operFun == null ? null : operFun.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getOperClass() {
        return operClass;
    }

    public void setOperClass(String operClass) {
        this.operClass = operClass == null ? null : operClass.trim();
    }
}