package com.wh.dao;

import com.wh.bean.Task_user_relations;
import com.wh.bean.Task_user_relationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Task_user_relationsMapper {
    long countByExample(Task_user_relationsExample example);

    int deleteByExample(Task_user_relationsExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(Task_user_relations record);

    int insertSelective(Task_user_relations record);

    List<Task_user_relations> selectByExample(Task_user_relationsExample example);

    Task_user_relations selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") Task_user_relations record, @Param("example") Task_user_relationsExample example);

    int updateByExample(@Param("record") Task_user_relations record, @Param("example") Task_user_relationsExample example);

    int updateByPrimaryKeySelective(Task_user_relations record);

    int updateByPrimaryKey(Task_user_relations record);
}