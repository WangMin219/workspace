package com.wh.dao;

import com.wh.bean.Process;
import com.wh.bean.ProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessMapper {
    long countByExample(ProcessExample example);

    int deleteByExample(ProcessExample example);

    int deleteByPrimaryKey(Integer processId);

    int insert(Process record);

    int insertSelective(Process record);

    List<Process> selectByExample(ProcessExample example);

    Process selectByPrimaryKey(Integer processId);

    int updateByExampleSelective(@Param("record") Process record, @Param("example") ProcessExample example);

    int updateByExample(@Param("record") Process record, @Param("example") ProcessExample example);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);
}