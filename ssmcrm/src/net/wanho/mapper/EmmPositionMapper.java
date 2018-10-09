package net.wanho.mapper;

import java.util.List;
import net.wanho.model.EmmPosition;
import net.wanho.model.EmmPositionExample;
import org.apache.ibatis.annotations.Param;

public interface EmmPositionMapper {
    int countByExample(EmmPositionExample example);

    int deleteByExample(EmmPositionExample example);

    int deleteByPrimaryKey(Integer positionId);

    int insert(EmmPosition record);

    int insertSelective(EmmPosition record);

    List<EmmPosition> selectByExample(EmmPositionExample example);

    EmmPosition selectByPrimaryKey(Integer positionId);

    int updateByExampleSelective(@Param("record") EmmPosition record, @Param("example") EmmPositionExample example);

    int updateByExample(@Param("record") EmmPosition record, @Param("example") EmmPositionExample example);

    int updateByPrimaryKeySelective(EmmPosition record);

    int updateByPrimaryKey(EmmPosition record);
}