package com.hn.dls.entity;

import java.util.Date;

public class Wish {
    private Integer id;

    private Integer fkSpId;

    private String fkUserId;

    private Date addTime;

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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}