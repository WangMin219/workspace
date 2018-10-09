package com.wh.dao;

import com.wh.bean.Log_in;
import com.wh.bean.Log_inExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Log_inMapper {
    long countByExample(Log_inExample example);

    int deleteByExample(Log_inExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Log_in record);

    int insertSelective(Log_in record);

    List<Log_in> selectByExample(Log_inExample example);

    Log_in selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Log_in record, @Param("example") Log_inExample example);

    int updateByExample(@Param("record") Log_in record, @Param("example") Log_inExample example);

    int updateByPrimaryKeySelective(Log_in record);

    int updateByPrimaryKey(Log_in record);
    
    Log_in selectLogin(Log_in log_in);

	void updatePassord(Log_in logIn);
}