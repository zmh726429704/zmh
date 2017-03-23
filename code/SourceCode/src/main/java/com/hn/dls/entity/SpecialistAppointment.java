package com.hn.dls.entity;

import java.util.Date;

public class SpecialistAppointment {
    private Integer id;

    private Integer fkSpId;

    private String fkUserId;

    private Integer status;

    private Date cancelTime;

    private Date meetTime;

    private Integer publisher;

    private Date addTime;

    private Date updateTime;

    private String ipAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkSpId() {
        return fkSpId;
    }

    public void setFkSpId(Integer fkSpId) {
        this.fkSpId = fkSpId;
    }

    public String getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(String fkUserId) {
        this.fkUserId = fkUserId == null ? null : fkUserId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Date getMeetTime() {
        return meetTime;
    }

    public void setMeetTime(Date meetTime) {
        this.meetTime = meetTime;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }
}