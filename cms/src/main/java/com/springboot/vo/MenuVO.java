package com.springboot.vo;

import lombok.Data;

import java.util.List;

/**
 * 菜单返回数据
 * Created by Administrator on 2018/9/28 0028.
 */

@Data
public class MenuVO {

    //菜单id
    private Integer menu_id;
    //菜单名称
    private String menu_name;
    //菜单链接地址
    private String menu_url;
    //菜单图片名称
    private String pictures;
    //子菜单对应父菜单的id
    private Integer parent_menu_id;
    //子菜单
    private List<Object> sonList;
}
