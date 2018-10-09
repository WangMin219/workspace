package net.wanho.model;

import java.util.Date;

public class Business {
    private Integer businessId;

    private Integer customerId;

    private Integer linkMainId;

    private String businessName;

    private Integer businessTypeId;

    private String status;

    private Integer businessSourceId;

    private Long persalePrice;

    private Short probability;

    private Date visitTime;

    private String visitContent;

    private Date updateTime;

    private Integer employeeId;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getLinkMainId() {
        return linkMainId;
    }

    public void setLinkMainId(Integer linkMainId) {
        this.linkMainId = linkMainId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public Integer getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(Integer businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getBusinessSourceId() {
        return businessSourceId;
    }

    public void setBusinessSourceId(Integer businessSourceId) {
        this.businessSourceId = businessSourceId;
    }

    public Long getPersalePrice() {
        return persalePrice;
    }

    public void setPersalePrice(Long persalePrice) {
        this.persalePrice = persalePrice;
    }

    public Short getProbability() {
        return probability;
    }

    public void setProbability(Short probability) {
        this.probability = probability;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitContent() {
        return visitContent;
    }

    public void setVisitContent(String visitContent) {
        this.visitContent = visitContent == null ? null : visitContent.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}