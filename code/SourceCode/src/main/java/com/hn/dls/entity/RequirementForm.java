package com.hn.dls.entity;

import java.util.Date;

public class RequirementForm {
    private Integer formId;

    private String name;

    private Double budget;

    private String isFieldService;

    private String cycle;

    private Date deadDate;

    private String city;

    private Integer publisher;

    private Date creatTime;

    private Date modifyTime;

    private String description;

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getIsFieldService() {
        return isFieldService;
    }

    public void setIsFieldService(String isFieldService) {
        this.isFieldService = isFieldService == null ? null : isFieldService.trim();
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public Date getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(Date deadDate) {
        this.deadDate = deadDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}