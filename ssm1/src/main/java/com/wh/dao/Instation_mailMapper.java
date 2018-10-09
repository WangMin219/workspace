package com.wh.dao;

import com.wh.bean.Instation_mail;
import com.wh.bean.Instation_mailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Instation_mailMapper {
    long countByExample(Instation_mailExample example);

    int deleteByExample(Instation_mailExample example);

    int deleteByPrimaryKey(Integer mailId);

    int insert(Instation_mail record);

    int insertSelective(Instation_mail record);

    List<Instation_mail> selectByExample(Instation_mailExample example);

    Instation_mail selectByPrimaryKey(Integer mailId);

    int updateByExampleSelective(@Param("record") Instation_mail record, @Param("example") Instation_mailExample example);

    int updateByExample(@Param("record") Instation_mail record, @Param("example") Instation_mailExample example);

    int updateByPrimaryKeySelective(Instation_mail record);

    int updateByPrimaryKey(Instation_mail record);
}