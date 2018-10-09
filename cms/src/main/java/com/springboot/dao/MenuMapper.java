package com.springboot.dao;

import com.springboot.dataobject.Menu;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/3 0003.
 */
public interface MenuMapper {

    @Select("SELECT menu_id,menu_name,menu_url,pictures,create_time,update_time,parent_menu_id FROM menu WHERE 1=1")
    List<Menu> getMenuList();

    @Select("SELECT menu_name FROM menu WHERE menu_id=#{menu_id}")
    @Results(id = "menuMap", value = {
            @Result(column = "menu_id", property = "menu_id", javaType = Integer.class),
            @Result(column = "menu_name", property = "menu_name", javaType = String.class),
            @Result(column = "menu_url", property = "menu_url", javaType = String.class),
            @Result(column = "pictures", property = "pictures", javaType = String.class),
            @Result(column = "status", property = "status", javaType = String.class),
            @Result(column = "create_time", property = "create_time", javaType = Date.class),
            @Result(column = "update_time", property = "update_time", javaType = Date.class),
            @Result(column = "parent_menu_id", property = "parent_menu_id", javaType = Integer.class),
    })
    Menu selectParentMenuName(Integer parent_menu_id);

    @Delete("DELETE FROM position_menu_relations WHERE position_id=#{position_id}")
    Integer deleteOldRelation(Integer position_id);

    @Insert({"<script>", "INSERT INTO position_menu_relations(position_id, menu_id) VALUES ", "<foreach collection='menu_idList' item='item' index='index' separator=','>", "(#{position_id}, #{item})", "</foreach>", "</script>"})
    Integer insertRelation(@Param("position_id") Integer position_id, @Param("menu_idList") List<Integer> menu_idList);

    @Select("SELECT * FROM menu WHERE menu_name=#{menu_name}")
    @ResultMap("menuMap")
    Menu selectMenuByName(String menu_name);

    @Select("SELECT * FROM menu WHERE menu_id=#{menu_id}")
    @ResultMap("menuMap")
    Menu selectMenuById(Integer menu_id);

    @Insert("INSERT INTO menu(menu_name,menu_url,pictures,parent_menu_id) VALUES(#{menu_name},#{menu_url},#{pictures},#{parent_menu_id})")
    Integer insertMenu(Menu menu);

    @Delete("DELETE FROM menu WHERE menu_id=#{menu_id}")
    Integer deleteMenu(Integer menu_id);

    @Update("UPDATE menu SET menu_name=#{menu_name},menu_url=#{menu_url},pictures=#{pictures},parent_menu_id=#{parent_menu_id} WHERE menu_id=#{menu_id}")
    Integer updateMenu(Menu menu);
}
