package com.springboot.dataobject;

import lombok.Data;

/**
 * 部门实体类
 * Created by Administrator on 2018/9/30 0030.
 */
@Data
public class Department {
    //部门id
    private Integer department_id;
    //部门名称
    private String department_name;
}
