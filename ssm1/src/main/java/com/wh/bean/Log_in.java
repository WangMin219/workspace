package com.wh.bean;

public class Log_in {
    private Integer userId;

    private Integer employeeId;

    private String emmPassword;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmmPassword() {
        return emmPassword;
    }

    public void setEmmPassword(String emmPassword) {
        this.emmPassword = emmPassword == null ? null : emmPassword.trim();
    }
}