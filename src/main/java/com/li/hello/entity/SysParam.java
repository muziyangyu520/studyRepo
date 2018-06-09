package com.li.hello.entity;

public class SysParam {
    private String paramId;

    private String parParam;

    private String paramName;

    private String paramValue;

    private Integer paramNum;

    private String paramTypeId;

    private String createTime;

    private String modifyTime;

    private String state;

    public SysParam(String paramId, String parParam, String paramName, String paramValue, Integer paramNum, String paramTypeId, String createTime, String modifyTime, String state) {
        this.paramId = paramId;
        this.parParam = parParam;
        this.paramName = paramName;
        this.paramValue = paramValue;
        this.paramNum = paramNum;
        this.paramTypeId = paramTypeId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
    }

    public SysParam() {
        super();
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId == null ? null : paramId.trim();
    }

    public String getParParam() {
        return parParam;
    }

    public void setParParam(String parParam) {
        this.parParam = parParam == null ? null : parParam.trim();
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public Integer getParamNum() {
        return paramNum;
    }

    public void setParamNum(Integer paramNum) {
        this.paramNum = paramNum;
    }

    public String getParamTypeId() {
        return paramTypeId;
    }

    public void setParamTypeId(String paramTypeId) {
        this.paramTypeId = paramTypeId == null ? null : paramTypeId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}