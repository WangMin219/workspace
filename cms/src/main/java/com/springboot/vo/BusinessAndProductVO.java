package com.springboot.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/5 0005.
 */
@Data
public class BusinessAndProductVO {
    private Integer employee_id;
    private String type_name;
    private Date update_time;
    private String business_name;
    private String source_name;
    private String name;
}
