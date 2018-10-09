package net.wanho.mapper;

import java.util.List;
import net.wanho.model.InstationMail;
import net.wanho.model.InstationMailExample;
import org.apache.ibatis.annotations.Param;

public interface InstationMailMapper {
    int countByExample(InstationMailExample example);

    int deleteByExample(InstationMailExample example);

    int deleteByPrimaryKey(Integer mailId);

    int insert(InstationMail record);

    int insertSelective(InstationMail record);

    List<InstationMail> selectByExample(InstationMailExample example);

    InstationMail selectByPrimaryKey(Integer mailId);

    int updateByExampleSelective(@Param("record") InstationMail record, @Param("example") InstationMailExample example);

    int updateByExample(@Param("record") InstationMail record, @Param("example") InstationMailExample example);

    int updateByPrimaryKeySelective(InstationMail record);

    int updateByPrimaryKey(InstationMail record);
}