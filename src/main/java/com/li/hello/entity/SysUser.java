package com.li.hello.entity;

/**
 * 后台用户表
 */
public class SysUser {
    private String userId;//用户主键

    private String userAccount;//用户账号

    private String userPwd;//用户密码

    private String userName;//用户姓名

    private String sex;//性别

    private String roleId;//角色主键

    private SysRole sysRole;//角色

    private String userMobile;//移动电话

    private String userTel;//用户联系电话

    private String userEmail;//邮箱

    private String lastLoginTime;//最后登录时间

    private String createUserId;//创建人

    private String createTime;//创建时间

    private String updateTime;//修改时间

    private String state;//状态

    public SysUser(String userId, String userAccount, String userPwd, String userName, String sex, String roleId, SysRole sysRole, String userMobile, String userTel, String userEmail, String lastLoginTime, String createUserId, String createTime, String updateTime, String state) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPwd = userPwd;
        this.userName = userName;
        this.sex = sex;
        this.roleId = roleId;
        this.sysRole = sysRole;
        this.userMobile = userMobile;
        this.userTel = userTel;
        this.userEmail = userEmail;
        this.lastLoginTime = lastLoginTime;
        this.createUserId = createUserId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
    }

    public SysUser() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public SysRole getSysRole() {
        return sysRole;
    }

    public void setSysRole(SysRole sysRole) {
        this.sysRole = sysRole;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}