package net.wanho.mapper;

import java.util.List;
import net.wanho.model.AdvancedLog;
import net.wanho.model.AdvancedLogExample;
import org.apache.ibatis.annotations.Param;

public interface AdvancedLogMapper {
    int countByExample(AdvancedLogExample example);

    int deleteByExample(AdvancedLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(AdvancedLog record);

    int insertSelective(AdvancedLog record);

    List<AdvancedLog> selectByExample(AdvancedLogExample example);

    AdvancedLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") AdvancedLog record, @Param("example") AdvancedLogExample example);

    int updateByExample(@Param("record") AdvancedLog record, @Param("example") AdvancedLogExample example);

    int updateByPrimaryKeySelective(AdvancedLog record);

    int updateByPrimaryKey(AdvancedLog record);
}