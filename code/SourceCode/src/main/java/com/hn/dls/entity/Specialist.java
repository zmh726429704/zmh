package com.hn.dls.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Specialist {
    private Integer id;

    private String specialistName;

    private String specialCode;

    private BigDecimal price;

    private Integer industry;

    private Integer specialty;

    private String jobDes;

    private String headPic;

    private String pic;

    private Integer province;

    private String respondTime;

    private Integer meetNumber;

    private Integer likeNumber;

    private Integer appointment;

    private String status;

    private Integer nation;

    private String dangdi;

    private Integer serviceId;

    private Integer roleId;

    private String jobAttach;

    private String attach;

    private Integer hireSyle;

    private Integer cantactWay;

    private Date addTime;

    private Date updateTime;

    private String ipAddress;

    private Integer publisher;

    private String specialistDes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialistName() {
        return specialistName;
    }

    public void setSpecialistName(String specialistName) {
        this.specialistName = specialistName == null ? null : specialistName.trim();
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode == null ? null : specialCode.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public Integer getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Integer specialty) {
        this.specialty = specialty;
    }

    public String getJobDes() {
        return jobDes;
    }

    public void setJobDes(String jobDes) {
        this.jobDes = jobDes == null ? null : jobDes.trim();
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public String getRespondTime() {
        return respondTime;
    }

    public void setRespondTime(String respondTime) {
        this.respondTime = respondTime == null ? null : respondTime.trim();
    }

    public Integer getMeetNumber() {
        return meetNumber;
    }

    public void setMeetNumber(Integer meetNumber) {
        this.meetNumber = meetNumber;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public Integer getAppointment() {
        return appointment;
    }

    public void setAppointment(Integer appointment) {
        this.appointment = appointment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public String getDangdi() {
        return dangdi;
    }

    public void setDangdi(String dangdi) {
        this.dangdi = dangdi == null ? null : dangdi.trim();
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getJobAttach() {
        return jobAttach;
    }

    public void setJobAttach(String jobAttach) {
        this.jobAttach = jobAttach == null ? null : jobAttach.trim();
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    public Integer getHireSyle() {
        return hireSyle;
    }

    public void setHireSyle(Integer hireSyle) {
        this.hireSyle = hireSyle;
    }

    public Integer getCantactWay() {
        return cantactWay;
    }

    public void setCantactWay(Integer cantactWay) {
        this.cantactWay = cantactWay;
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

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public String getSpecialistDes() {
        return specialistDes;
    }

    public void setSpecialistDes(String specialistDes) {
        this.specialistDes = specialistDes == null ? null : specialistDes.trim();
    }
}