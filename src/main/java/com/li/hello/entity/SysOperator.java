package com.li.hello.entity;

public class SysOperator {
    private String optId;

    private String resId;

    private String optName;

    private String operValue;

    private String remak;

    private String createTime;

    private String modifyTime;

    private String state;

    private String opClass;

    private String opEvent;

    private String opType;

    private String controlType;

    private Integer orderBy;

    private String controlPlace;

    private String createUserId;

    private String createUserOrgan;

    public SysOperator(String optId, String resId, String optName, String operValue, String remak, String createTime, String modifyTime, String state, String opClass, String opEvent, String opType, String controlType, Integer orderBy, String controlPlace, String createUserId, String createUserOrgan) {
        this.optId = optId;
        this.resId = resId;
        this.optName = optName;
        this.operValue = operValue;
        this.remak = remak;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.state = state;
        this.opClass = opClass;
        this.opEvent = opEvent;
        this.opType = opType;
        this.controlType = controlType;
        this.orderBy = orderBy;
        this.controlPlace = controlPlace;
        this.createUserId = createUserId;
        this.createUserOrgan = createUserOrgan;
    }

    public SysOperator() {
        super();
    }

    public String getOptId() {
        return optId;
    }

    public void setOptId(String optId) {
        this.optId = optId == null ? null : optId.trim();
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName == null ? null : optName.trim();
    }

    public String getOperValue() {
        return operValue;
    }

    public void setOperValue(String operValue) {
        this.operValue = operValue == null ? null : operValue.trim();
    }

    public String getRemak() {
        return remak;
    }

    public void setRemak(String remak) {
        this.remak = remak == null ? null : remak.trim();
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

    public String getOpClass() {
        return opClass;
    }

    public void setOpClass(String opClass) {
        this.opClass = opClass == null ? null : opClass.trim();
    }

    public String getOpEvent() {
        return opEvent;
    }

    public void setOpEvent(String opEvent) {
        this.opEvent = opEvent == null ? null : opEvent.trim();
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType == null ? null : controlType.trim();
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public String getControlPlace() {
        return controlPlace;
    }

    public void setControlPlace(String controlPlace) {
        this.controlPlace = controlPlace == null ? null : controlPlace.trim();
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