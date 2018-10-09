package com.wh.dao;

import com.wh.bean.Individual_task;
import com.wh.bean.Individual_taskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Individual_taskMapper {
    long countByExample(Individual_taskExample example);

    int deleteByExample(Individual_taskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(Individual_task record);

    int insertSelective(Individual_task record);

    List<Individual_task> selectByExampleWithBLOBs(Individual_taskExample example);

    List<Individual_task> selectByExample(Individual_taskExample example);

    Individual_task selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") Individual_task record, @Param("example") Individual_taskExample example);

    int updateByExampleWithBLOBs(@Param("record") Individual_task record, @Param("example") Individual_taskExample example);

    int updateByExample(@Param("record") Individual_task record, @Param("example") Individual_taskExample example);

    int updateByPrimaryKeySelective(Individual_task record);

    int updateByPrimaryKeyWithBLOBs(Individual_task record);

    int updateByPrimaryKey(Individual_task record);
}