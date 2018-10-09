package com.wh.dao;

import com.wh.bean.Working_field;
import com.wh.bean.Working_fieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Working_fieldMapper {
    long countByExample(Working_fieldExample example);

    int deleteByExample(Working_fieldExample example);

    int deleteByPrimaryKey(Integer fieldId);

    int insert(Working_field record);

    int insertSelective(Working_field record);

    List<Working_field> selectByExample(Working_fieldExample example);

    Working_field selectByPrimaryKey(Integer fieldId);

    int updateByExampleSelective(@Param("record") Working_field record, @Param("example") Working_fieldExample example);

    int updateByExample(@Param("record") Working_field record, @Param("example") Working_fieldExample example);

    int updateByPrimaryKeySelective(Working_field record);

    int updateByPrimaryKey(Working_field record);
}