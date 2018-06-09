package com.li.hello.entity;

public class SysRoleAuth {
    private String sysAccreditId;

    private String sysRoleId;

    private String resId;

    private String operId;

    private String resAddr;

    public SysRoleAuth(String sysAccreditId, String sysRoleId, String resId, String operId, String resAddr) {
        this.sysAccreditId = sysAccreditId;
        this.sysRoleId = sysRoleId;
        this.resId = resId;
        this.operId = operId;
        this.resAddr = resAddr;
    }

    public SysRoleAuth() {
        super();
    }

    public String getSysAccreditId() {
        return sysAccreditId;
    }

    public void setSysAccreditId(String sysAccreditId) {
        this.sysAccreditId = sysAccreditId == null ? null : sysAccreditId.trim();
    }

    public String getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId == null ? null : sysRoleId.trim();
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public String getResAddr() {
        return resAddr;
    }

    public void setResAddr(String resAddr) {
        this.resAddr = resAddr == null ? null : resAddr.trim();
    }
}