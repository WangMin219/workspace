package com.wh.dao;

import com.wh.bean.Advanced_log;
import com.wh.bean.Advanced_logExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Advanced_logMapper {
    long countByExample(Advanced_logExample example);

    int deleteByExample(Advanced_logExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(Advanced_log record);

    int insertSelective(Advanced_log record);

    List<Advanced_log> selectByExample(Advanced_logExample example);

    Advanced_log selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") Advanced_log record, @Param("example") Advanced_logExample example);

    int updateByExample(@Param("record") Advanced_log record, @Param("example") Advanced_logExample example);

    int updateByPrimaryKeySelective(Advanced_log record);

    int updateByPrimaryKey(Advanced_log record);
}