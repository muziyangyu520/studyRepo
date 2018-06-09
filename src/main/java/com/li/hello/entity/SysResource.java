package com.li.hello.entity;

public class SysResource {
    private String resId;

    private String resCode;

    private String resName;

    private String parResId;

    private String resDes;

    private String resUrl;

    private Integer resSeq;

    private String createTime;

    private String modifyTime;

    private String state;

    private String resType;

    public SysResource(String resId, String resCode, String resName, String parResId, String resDes, String resUrl, Integer resSeq, String createTime, String modifyTime, String state, String resType) {
        this.resId = resId;
        this.resCode = resCode;
        this.resName = resName;
        this.parResId = parResId;
        this.resDes = resDes;
        this.resUrl = resUrl;
        this.resSeq = resSeq;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
        this.resType = resType;
    }

    public SysResource() {
        super();
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode == null ? null : resCode.trim();
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getParResId() {
        return parResId;
    }

    public void setParResId(String parResId) {
        this.parResId = parResId == null ? null : parResId.trim();
    }

    public String getResDes() {
        return resDes;
    }

    public void setResDes(String resDes) {
        this.resDes = resDes == null ? null : resDes.trim();
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
    }

    public Integer getResSeq() {
        return resSeq;
    }

    public void setResSeq(Integer resSeq) {
        this.resSeq = resSeq;
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

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }
}