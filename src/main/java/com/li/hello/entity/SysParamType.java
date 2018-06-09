package com.li.hello.entity;

public class SysParamType {
    private String paramTypeId;

    private String paramTypeCode;

    private String paramTypeName;

    private String paramTypeDesc;

    private String createTime;

    private String modifyTime;

    private String state;

    public SysParamType(String paramTypeId, String paramTypeCode, String paramTypeName, String paramTypeDesc, String createTime, String modifyTime, String state) {
        this.paramTypeId = paramTypeId;
        this.paramTypeCode = paramTypeCode;
        this.paramTypeName = paramTypeName;
        this.paramTypeDesc = paramTypeDesc;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
    }

    public SysParamType() {
        super();
    }

    public String getParamTypeId() {
        return paramTypeId;
    }

    public void setParamTypeId(String paramTypeId) {
        this.paramTypeId = paramTypeId == null ? null : paramTypeId.trim();
    }

    public String getParamTypeCode() {
        return paramTypeCode;
    }

    public void setParamTypeCode(String paramTypeCode) {
        this.paramTypeCode = paramTypeCode == null ? null : paramTypeCode.trim();
    }

    public String getParamTypeName() {
        return paramTypeName;
    }

    public void setParamTypeName(String paramTypeName) {
        this.paramTypeName = paramTypeName == null ? null : paramTypeName.trim();
    }

    public String getParamTypeDesc() {
        return paramTypeDesc;
    }

    public void setParamTypeDesc(String paramTypeDesc) {
        this.paramTypeDesc = paramTypeDesc == null ? null : paramTypeDesc.trim();
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