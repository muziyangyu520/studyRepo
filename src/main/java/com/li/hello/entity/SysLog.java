package com.li.hello.entity;

public class SysLog {
    private String logId;

    private String operateTime;

    private String logName;

    private String logAccount;

    private String logIp;

    private String operateType;

    private String logType;

    private String createTime;

    private String note;

    public SysLog(String logId, String operateTime, String logName, String logAccount, String logIp, String operateType, String logType, String createTime, String note) {
        this.logId = logId;
        this.operateTime = operateTime;
        this.logName = logName;
        this.logAccount = logAccount;
        this.logIp = logIp;
        this.operateType = operateType;
        this.logType = logType;
        this.createTime = createTime;
        this.note = note;
    }

    public SysLog() {
        super();
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime == null ? null : operateTime.trim();
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName == null ? null : logName.trim();
    }

    public String getLogAccount() {
        return logAccount;
    }

    public void setLogAccount(String logAccount) {
        this.logAccount = logAccount == null ? null : logAccount.trim();
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp == null ? null : logIp.trim();
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}