package com.wh.dao;

import com.wh.bean.Product_inventory;
import com.wh.bean.Product_inventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Product_inventoryMapper {
    long countByExample(Product_inventoryExample example);

    int deleteByExample(Product_inventoryExample example);

    int deleteByPrimaryKey(Integer inventoryId);

    int insert(Product_inventory record);

    int insertSelective(Product_inventory record);

    List<Product_inventory> selectByExample(Product_inventoryExample example);

    Product_inventory selectByPrimaryKey(Integer inventoryId);

    int updateByExampleSelective(@Param("record") Product_inventory record, @Param("example") Product_inventoryExample example);

    int updateByExample(@Param("record") Product_inventory record, @Param("example") Product_inventoryExample example);

    int updateByPrimaryKeySelective(Product_inventory record);

    int updateByPrimaryKey(Product_inventory record);
}