package com.wh.bean;

import java.util.Date;

public class Employee {
    private Integer employeeId;

    private String employeeName;

    private Integer departmentId;

    private Integer positonId;

    private String phone;

    private String email;

    private String status;

    private Integer parentEmployeeId;

    private Date createTime;

    private Date updateTime;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getPositonId() {
        return positonId;
    }

    public void setPositonId(Integer positonId) {
        this.positonId = positonId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getParentEmployeeId() {
        return parentEmployeeId;
    }

    public void setParentEmployeeId(Integer parentEmployeeId) {
        this.parentEmployeeId = parentEmployeeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}