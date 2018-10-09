package net.wanho.mapper;

import java.util.List;
import net.wanho.model.IndividualTask;
import net.wanho.model.IndividualTaskExample;
import org.apache.ibatis.annotations.Param;

public interface IndividualTaskMapper {
    int countByExample(IndividualTaskExample example);

    int deleteByExample(IndividualTaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(IndividualTask record);

    int insertSelective(IndividualTask record);

    List<IndividualTask> selectByExampleWithBLOBs(IndividualTaskExample example);

    List<IndividualTask> selectByExample(IndividualTaskExample example);

    IndividualTask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") IndividualTask record, @Param("example") IndividualTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") IndividualTask record, @Param("example") IndividualTaskExample example);

    int updateByExample(@Param("record") IndividualTask record, @Param("example") IndividualTaskExample example);

    int updateByPrimaryKeySelective(IndividualTask record);

    int updateByPrimaryKeyWithBLOBs(IndividualTask record);

    int updateByPrimaryKey(IndividualTask record);
}