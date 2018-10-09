package com.springboot.dto;

import lombok.Data;

/**
 * Created by Administrator on 2018/9/30 0030.
 */

@Data
public class EmployeeDTO {
    //员工工号
    private Integer employee_id;
    //姓名
    private String employee_name;
    //部门id
    private Integer department_id;
    //职位id
    private Integer positon_id;
    //手机
    private String phone;
    //电子邮箱
    private String email;
    //上级员工工号
    private Integer parent_employee_id;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Integer employee_id, String employee_name, Integer department_id, Integer positon_id, String phone, String email, Integer parent_employee_id) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.department_id = department_id;
        this.positon_id = positon_id;
        this.phone = phone;
        this.email = email;
        this.parent_employee_id = parent_employee_id;
    }

    public EmployeeDTO( String employee_name, Integer department_id, Integer positon_id, String phone, String email, Integer parent_employee_id) {
        this.employee_name = employee_name;
        this.department_id = department_id;
        this.positon_id = positon_id;
        this.phone = phone;
        this.email = email;
        this.parent_employee_id = parent_employee_id;
    }
}
