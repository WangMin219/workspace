package com.springboot.dao;

import com.springboot.dataobject.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by Administrator on 2018/9/27 0027.
 */

public interface UserMapper {
    @Select("SELECT user_id,employee_id,emm_password FROM log_in WHERE employee_id=#{employee_id} and emm_password=#{emm_password}")
    User selectUser(@Param("employee_id") Integer employee_id, @Param("emm_password") String emm_password);

    @Update("UPDATE log_in SET emm_password=#{emm_password} WHERE employee_id=#{employee_id}")
    Integer updateUserPs(User user);


}


