package net.wanho.mapper;

import java.util.List;
import net.wanho.model.Source;
import net.wanho.model.SourceExample;
import org.apache.ibatis.annotations.Param;

public interface SourceMapper {
    int countByExample(SourceExample example);

    int deleteByExample(SourceExample example);

    int insert(Source record);

    int insertSelective(Source record);

    List<Source> selectByExample(SourceExample example);

    int updateByExampleSelective(@Param("record") Source record, @Param("example") SourceExample example);

    int updateByExample(@Param("record") Source record, @Param("example") SourceExample example);
}