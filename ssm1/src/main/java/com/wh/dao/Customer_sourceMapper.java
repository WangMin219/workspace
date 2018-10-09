package com.wh.dao;

import com.wh.bean.Customer_source;
import com.wh.bean.Customer_sourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Customer_sourceMapper {
    long countByExample(Customer_sourceExample example);

    int deleteByExample(Customer_sourceExample example);

    int deleteByPrimaryKey(Integer sourceId);

    int insert(Customer_source record);

    int insertSelective(Customer_source record);

    List<Customer_source> selectByExample(Customer_sourceExample example);

    Customer_source selectByPrimaryKey(Integer sourceId);

    int updateByExampleSelective(@Param("record") Customer_source record, @Param("example") Customer_sourceExample example);

    int updateByExample(@Param("record") Customer_source record, @Param("example") Customer_sourceExample example);

    int updateByPrimaryKeySelective(Customer_source record);

    int updateByPrimaryKey(Customer_source record);
}