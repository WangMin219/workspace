package com.wh.dao;

import com.wh.bean.Emm_position;
import com.wh.bean.Emm_positionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Emm_positionMapper {
    long countByExample(Emm_positionExample example);

    int deleteByExample(Emm_positionExample example);

    int deleteByPrimaryKey(Integer positionId);

    int insert(Emm_position record);

    int insertSelective(Emm_position record);

    List<Emm_position> selectByExample(Emm_positionExample example);

    Emm_position selectByPrimaryKey(Integer positionId);

    int updateByExampleSelective(@Param("record") Emm_position record, @Param("example") Emm_positionExample example);

    int updateByExample(@Param("record") Emm_position record, @Param("example") Emm_positionExample example);

    int updateByPrimaryKeySelective(Emm_position record);

    int updateByPrimaryKey(Emm_position record);

	List<Emm_position> getAllPosition();
}