package com.springboot.dataobject;

import lombok.Data;

import java.util.Date;

/**
 * 职位实体类
 * Created by Administrator on 2018/9/30 0030.
 */
@Data
public class Position {
    //职位id
    private Integer position_id;
    //职位名称
    private String position_name;
    //职位等级
    private String position_level;
    //创建时间
    private Date create_time;
    //更新时间
    private Date update_time;
}
