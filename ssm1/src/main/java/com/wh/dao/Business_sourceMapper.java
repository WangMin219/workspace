package com.wh.dao;

import com.wh.bean.Business_source;
import com.wh.bean.Business_sourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Business_sourceMapper {
    long countByExample(Business_sourceExample example);

    int deleteByExample(Business_sourceExample example);

    int deleteByPrimaryKey(Integer sourceId);

    int insert(Business_source record);

    int insertSelective(Business_source record);

    List<Business_source> selectByExample(Business_sourceExample example);

    Business_source selectByPrimaryKey(Integer sourceId);

    int updateByExampleSelective(@Param("record") Business_source record, @Param("example") Business_sourceExample example);

    int updateByExample(@Param("record") Business_source record, @Param("example") Business_sourceExample example);

    int updateByPrimaryKeySelective(Business_source record);

    int updateByPrimaryKey(Business_source record);
}