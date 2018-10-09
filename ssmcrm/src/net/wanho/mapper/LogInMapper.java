package net.wanho.mapper;

import java.util.List;
import net.wanho.model.LogIn;
import net.wanho.model.LogInExample;
import org.apache.ibatis.annotations.Param;

public interface LogInMapper {
    int countByExample(LogInExample example);

    int deleteByExample(LogInExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(LogIn record);

    int insertSelective(LogIn record);

    List<LogIn> selectByExample(LogInExample example);

    LogIn selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") LogIn record, @Param("example") LogInExample example);

    int updateByExample(@Param("record") LogIn record, @Param("example") LogInExample example);

    int updateByPrimaryKeySelective(LogIn record);

    int updateByPrimaryKey(LogIn record);
}