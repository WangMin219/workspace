package com.springboot.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/3 0003.
 */

@Data
public class RelationMenuVO {

    //菜单id
    private Integer menu_id;
    //菜单名称
    private String menu_name;
    //图标名称
    private String pictures;
    //菜单链接地址
    private String menu_url;
    //菜单状态
    private String status;
    //创建时间
    private Date create_time;
    //修改时间
    private Date update_time;
    //菜单上级名称
    private String parent_name;
}
