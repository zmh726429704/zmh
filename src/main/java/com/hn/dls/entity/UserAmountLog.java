package com.hn.dls.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserAmountLog {
    private Integer id;

    private String fkUserId;

    private String userName;

    private Integer fkPaymentId;

    private BigDecimal value;

    private String remark;

    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(String fkUserId) {
        this.fkUserId = fkUserId == null ? null : fkUserId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getFkPaymentId() {
        return fkPaymentId;
    }

    public void setFkPaymentId(Integer fkPaymentId) {
        this.fkPaymentId = fkPaymentId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}