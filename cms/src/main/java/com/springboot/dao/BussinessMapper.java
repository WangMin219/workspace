package com.springboot.dao;

import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2018/10/5 0005.
 */
public interface BussinessMapper {

    @Select("select count(*) from business where DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(UPDATE_TIME);")
    Integer selectWeekBusiness();
}
