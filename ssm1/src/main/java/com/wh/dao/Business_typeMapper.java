package com.wh.dao;

import com.wh.bean.Business_type;
import com.wh.bean.Business_typeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Business_typeMapper {
    long countByExample(Business_typeExample example);

    int deleteByExample(Business_typeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Business_type record);

    int insertSelective(Business_type record);

    List<Business_type> selectByExample(Business_typeExample example);

    Business_type selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Business_type record, @Param("example") Business_typeExample example);

    int updateByExample(@Param("record") Business_type record, @Param("example") Business_typeExample example);

    int updateByPrimaryKeySelective(Business_type record);

    int updateByPrimaryKey(Business_type record);
}