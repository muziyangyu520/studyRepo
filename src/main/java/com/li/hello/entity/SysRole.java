package com.li.hello.entity;

public class SysRole {
    private String roleId;

    private String roleName;

    private String roleDesc;

    private Integer sort;

    private String isSysInit;

    private String createTime;

    private String modifyTime;

    private String state;

    public SysRole(String roleId, String roleName, String roleDesc, Integer sort, String isSysInit, String createTime, String modifyTime, String state) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.sort = sort;
        this.isSysInit = isSysInit;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
    }

    public SysRole() {
        super();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIsSysInit() {
        return isSysInit;
    }

    public void setIsSysInit(String isSysInit) {
        this.isSysInit = isSysInit == null ? null : isSysInit.trim();
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