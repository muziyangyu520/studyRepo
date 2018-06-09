package com.li.hello.entity;

public class SysOrgan {
    private String orgId;

    private String orgName;

    private String orgCode;

    private Integer sort;

    private String orgPar;

    private String orgArea;

    private String createTime;

    private String modifyTime;

    private String state;

    private String createUserId;

    private String createUserOrgan;

    public SysOrgan(String orgId, String orgName, String orgCode, Integer sort, String orgPar, String orgArea, String createTime, String modifyTime, String state, String createUserId, String createUserOrgan) {
        this.orgId = orgId;
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.sort = sort;
        this.orgPar = orgPar;
        this.orgArea = orgArea;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
        this.createUserId = createUserId;
        this.createUserOrgan = createUserOrgan;
    }

    public SysOrgan() {
        super();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getOrgPar() {
        return orgPar;
    }

    public void setOrgPar(String orgPar) {
        this.orgPar = orgPar == null ? null : orgPar.trim();
    }

    public String getOrgArea() {
        return orgArea;
    }

    public void setOrgArea(String orgArea) {
        this.orgArea = orgArea == null ? null : orgArea.trim();
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

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getCreateUserOrgan() {
        return createUserOrgan;
    }

    public void setCreateUserOrgan(String createUserOrgan) {
        this.createUserOrgan = createUserOrgan == null ? null : createUserOrgan.trim();
    }
}