package net.wanho.mapper;

import java.util.List;
import net.wanho.model.TaskUserRelations;
import net.wanho.model.TaskUserRelationsExample;
import org.apache.ibatis.annotations.Param;

public interface TaskUserRelationsMapper {
    int countByExample(TaskUserRelationsExample example);

    int deleteByExample(TaskUserRelationsExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(TaskUserRelations record);

    int insertSelective(TaskUserRelations record);

    List<TaskUserRelations> selectByExample(TaskUserRelationsExample example);

    TaskUserRelations selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") TaskUserRelations record, @Param("example") TaskUserRelationsExample example);

    int updateByExample(@Param("record") TaskUserRelations record, @Param("example") TaskUserRelationsExample example);

    int updateByPrimaryKeySelective(TaskUserRelations record);

    int updateByPrimaryKey(TaskUserRelations record);
}