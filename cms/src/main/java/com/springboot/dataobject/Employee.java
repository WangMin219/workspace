package com.springboot.dataobject;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2018/9/29 0029.
 */

@Data
public class Employee {
    //员工工号
    private Integer employee_id;
    //姓名
    private String employee_name;
    //部门名称
    private String department_name;
    //职位
    private String position_name;
    //手机
    private String phone;
    //电子邮箱
    private String email;
    //状态
    private Integer status;
    //上级员工工号
    private Integer parent_employee_id;
    // 创建时间
    private Date create_time;
    //更新时间
    private Date update_time;

    public Employee() {
    }
    public Employee(Integer employee_id, String employee_name, String department_name, String position_name, String phone, String email, Integer parent_employee_id) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.department_name = department_name;
        this.position_name = position_name;
        this.phone = phone;
        this.email = email;
        this.parent_employee_id = parent_employee_id;
    }
}
