package com.wh.bean;

import java.util.Date;

public class Advanced_log {
    private Integer logId;

    private Integer businessId;

    private Integer creator;

    private String advanceContent;

    private Date createTime;

    private String advanceStatus;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getAdvanceContent() {
        return advanceContent;
    }

    public void setAdvanceContent(String advanceContent) {
        this.advanceContent = advanceContent == null ? null : advanceContent.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAdvanceStatus() {
        return advanceStatus;
    }

    public void setAdvanceStatus(String advanceStatus) {
        this.advanceStatus = advanceStatus == null ? null : advanceStatus.trim();
    }
}