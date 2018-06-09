package com.li.hello.entity;

public class SysBinarFile {
    private String fileId;

    private String orgFileName;

    private String fileSize;

    private Integer refNum;

    private String userId;

    private String fileSavePath;

    private String createTime;

    private String state;

    public SysBinarFile(String fileId, String orgFileName, String fileSize, Integer refNum, String userId, String fileSavePath, String createTime, String state) {
        this.fileId = fileId;
        this.orgFileName = orgFileName;
        this.fileSize = fileSize;
        this.refNum = refNum;
        this.userId = userId;
        this.fileSavePath = fileSavePath;
        this.createTime = createTime;
        this.state = state;
    }

    public SysBinarFile() {
        super();
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getOrgFileName() {
        return orgFileName;
    }

    public void setOrgFileName(String orgFileName) {
        this.orgFileName = orgFileName == null ? null : orgFileName.trim();
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    public Integer getRefNum() {
        return refNum;
    }

    public void setRefNum(Integer refNum) {
        this.refNum = refNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFileSavePath() {
        return fileSavePath;
    }

    public void setFileSavePath(String fileSavePath) {
        this.fileSavePath = fileSavePath == null ? null : fileSavePath.trim();
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
}