package com.springboot.dao;

import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2018/10/5 0005.
 */
public interface ProductMapper {

    @Select("select count(*) from product where DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(CREATE_TIME);")
    Integer selectRecentWeekProduct();
}
