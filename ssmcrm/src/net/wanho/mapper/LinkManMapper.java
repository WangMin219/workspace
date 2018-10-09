package net.wanho.mapper;

import java.util.List;
import net.wanho.model.LinkMan;
import net.wanho.model.LinkManExample;
import org.apache.ibatis.annotations.Param;

public interface LinkManMapper {
    int countByExample(LinkManExample example);

    int deleteByExample(LinkManExample example);

    int deleteByPrimaryKey(Integer linkMainId);

    int insert(LinkMan record);

    int insertSelective(LinkMan record);

    List<LinkMan> selectByExample(LinkManExample example);

    LinkMan selectByPrimaryKey(Integer linkMainId);

    int updateByExampleSelective(@Param("record") LinkMan record, @Param("example") LinkManExample example);

    int updateByExample(@Param("record") LinkMan record, @Param("example") LinkManExample example);

    int updateByPrimaryKeySelective(LinkMan record);

    int updateByPrimaryKey(LinkMan record);
}