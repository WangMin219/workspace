package com.wh.dao;

import com.wh.bean.Product_type;
import com.wh.bean.Product_typeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Product_typeMapper {
    long countByExample(Product_typeExample example);

    int deleteByExample(Product_typeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Product_type record);

    int insertSelective(Product_type record);

    List<Product_type> selectByExample(Product_typeExample example);

    Product_type selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Product_type record, @Param("example") Product_typeExample example);

    int updateByExample(@Param("record") Product_type record, @Param("example") Product_typeExample example);

    int updateByPrimaryKeySelective(Product_type record);

    int updateByPrimaryKey(Product_type record);
}