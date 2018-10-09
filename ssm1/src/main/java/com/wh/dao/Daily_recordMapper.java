package com.wh.dao;

import com.wh.bean.Daily_record;
import com.wh.bean.Daily_recordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Daily_recordMapper {
    long countByExample(Daily_recordExample example);

    int deleteByExample(Daily_recordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(Daily_record record);

    int insertSelective(Daily_record record);

    List<Daily_record> selectByExample(Daily_recordExample example);

    Daily_record selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") Daily_record record, @Param("example") Daily_recordExample example);

    int updateByExample(@Param("record") Daily_record record, @Param("example") Daily_recordExample example);

    int updateByPrimaryKeySelective(Daily_record record);

    int updateByPrimaryKey(Daily_record record);
}