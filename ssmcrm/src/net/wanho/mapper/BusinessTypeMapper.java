package net.wanho.mapper;

import java.util.List;
import net.wanho.model.BusinessType;
import net.wanho.model.BusinessTypeExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessTypeMapper {
    int countByExample(BusinessTypeExample example);

    int deleteByExample(BusinessTypeExample example);

    int insert(BusinessType record);

    int insertSelective(BusinessType record);

    List<BusinessType> selectByExample(BusinessTypeExample example);

    int updateByExampleSelective(@Param("record") BusinessType record, @Param("example") BusinessTypeExample example);

    int updateByExample(@Param("record") BusinessType record, @Param("example") BusinessTypeExample example);
}