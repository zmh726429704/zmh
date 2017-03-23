package com.hn.dls.entity;

import java.util.Date;

public class Comment {
    private Integer id;

    private String fkArticleId;

    private String fkUserId;

    private String content;

    private Integer satisfaction;

    private Date addDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFkArticleId() {
        return fkArticleId;
    }

    public void setFkArticleId(String fkArticleId) {
        this.fkArticleId = fkArticleId == null ? null : fkArticleId.trim();
    }

    public String getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(String fkUserId) {
        this.fkUserId = fkUserId == null ? null : fkUserId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(Integer satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
}