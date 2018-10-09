package net.wanho.mapper;

import java.util.List;
import net.wanho.model.DailyRecord;
import net.wanho.model.DailyRecordExample;
import org.apache.ibatis.annotations.Param;

public interface DailyRecordMapper {
    int countByExample(DailyRecordExample example);

    int deleteByExample(DailyRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(DailyRecord record);

    int insertSelective(DailyRecord record);

    List<DailyRecord> selectByExample(DailyRecordExample example);

    DailyRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") DailyRecord record, @Param("example") DailyRecordExample example);

    int updateByExample(@Param("record") DailyRecord record, @Param("example") DailyRecordExample example);

    int updateByPrimaryKeySelective(DailyRecord record);

    int updateByPrimaryKey(DailyRecord record);
}