package net.wanho.mapper;

import java.util.List;
import net.wanho.model.BusinessSource;
import net.wanho.model.BusinessSourceExample;
import org.apache.ibatis.annotations.Param;

public interface BusinessSourceMapper {
    int countByExample(BusinessSourceExample example);

    int deleteByExample(BusinessSourceExample example);

    int insert(BusinessSource record);

    int insertSelective(BusinessSource record);

    List<BusinessSource> selectByExample(BusinessSourceExample example);

    int updateByExampleSelective(@Param("record") BusinessSource record, @Param("example") BusinessSourceExample example);

    int updateByExample(@Param("record") BusinessSource record, @Param("example") BusinessSourceExample example);
}