package net.wanho.mapper;

import java.util.List;
import net.wanho.model.ProductInventory;
import net.wanho.model.ProductInventoryExample;
import org.apache.ibatis.annotations.Param;

public interface ProductInventoryMapper {
    int countByExample(ProductInventoryExample example);

    int deleteByExample(ProductInventoryExample example);

    int deleteByPrimaryKey(Integer inventoryId);

    int insert(ProductInventory record);

    int insertSelective(ProductInventory record);

    List<ProductInventory> selectByExample(ProductInventoryExample example);

    ProductInventory selectByPrimaryKey(Integer inventoryId);

    int updateByExampleSelective(@Param("record") ProductInventory record, @Param("example") ProductInventoryExample example);

    int updateByExample(@Param("record") ProductInventory record, @Param("example") ProductInventoryExample example);

    int updateByPrimaryKeySelective(ProductInventory record);

    int updateByPrimaryKey(ProductInventory record);
}