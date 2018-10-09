package net.wanho.model;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private Integer recordId;

    private Integer commentEmployee;

    private String detail;

    private Date createTime;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getCommentEmployee() {
        return commentEmployee;
    }

    public void setCommentEmployee(Integer commentEmployee) {
        this.commentEmployee = commentEmployee;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}