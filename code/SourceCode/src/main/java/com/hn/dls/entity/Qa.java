package com.hn.dls.entity;

import java.util.Date;

public class Qa {
    private Integer id;

    private Integer fkArticleId;

    private String question;

    private Integer sortId;

    private Integer click;

    private Date addTime;

    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkArticleId() {
        return fkArticleId;
    }

    public void setFkArticleId(Integer fkArticleId) {
        this.fkArticleId = fkArticleId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}