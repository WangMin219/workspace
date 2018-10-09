package com.springboot.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2018/9/28 0028.
 */

@Getter
public enum  ResultEnum {
    LOGOUT_SUCESS(1,"登出成功"),
    SEARCH_EMPLOEE_ERR(2,"查询员工异常"),
    UPDATE_EMPLOYEE_ERR(3,"修改员工账号状态异常"),
    BAN_EMPLOYEE_fail(4,"禁用员工状态失败"),
    CREATE_EMOLOYEE_FAIL(5,"创建员工失败"),
    ;


    private Integer code;
    private String  message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
