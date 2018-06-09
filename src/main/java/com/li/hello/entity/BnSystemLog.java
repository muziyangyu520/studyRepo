package com.li.hello.entity;

public class BnSystemLog {
    private String logId;

    private String sysUserKey;

    private String userOperateDt;

    private String loginTime;

    private String loginIp;

    private String userAccount;

    private String logType;

    private String userOperateContent;

    private String userOperate;

    public BnSystemLog(String logId, String sysUserKey, String userOperateDt, String loginTime, String loginIp, String userAccount, String logType, String userOperateContent, String userOperate) {
        this.logId = logId;
        this.sysUserKey = sysUserKey;
        this.userOperateDt = userOperateDt;
        this.loginTime = loginTime;
        this.loginIp = loginIp;
        this.userAccount = userAccount;
        this.logType = logType;
        this.userOperateContent = userOperateContent;
        this.userOperate = userOperate;
    }

    public BnSystemLog() {
        super();
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getSysUserKey() {
        return sysUserKey;
    }

    public void setSysUserKey(String sysUserKey) {
        this.sysUserKey = sysUserKey == null ? null : sysUserKey.trim();
    }

    public String getUserOperateDt() {
        return userOperateDt;
    }

    public void setUserOperateDt(String userOperateDt) {
        this.userOperateDt = userOperateDt == null ? null : userOperateDt.trim();
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime == null ? null : loginTime.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getUserOperateContent() {
        return userOperateContent;
    }

    public void setUserOperateContent(String userOperateContent) {
        this.userOperateContent = userOperateContent == null ? null : userOperateContent.trim();
    }

    public String getUserOperate() {
        return userOperate;
    }

    public void setUserOperate(String userOperate) {
        this.userOperate = userOperate == null ? null : userOperate.trim();
    }
}