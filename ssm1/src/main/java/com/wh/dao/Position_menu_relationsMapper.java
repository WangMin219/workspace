package com.wh.dao;

import com.wh.bean.Position_menu_relations;
import com.wh.bean.Position_menu_relationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Position_menu_relationsMapper {
    long countByExample(Position_menu_relationsExample example);

    int deleteByExample(Position_menu_relationsExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(Position_menu_relations record);

    int insertSelective(Position_menu_relations record);

    List<Position_menu_relations> selectByExample(Position_menu_relationsExample example);

    Position_menu_relations selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") Position_menu_relations record, @Param("example") Position_menu_relationsExample example);

    int updateByExample(@Param("record") Position_menu_relations record, @Param("example") Position_menu_relationsExample example);

    int updateByPrimaryKeySelective(Position_menu_relations record);

    int updateByPrimaryKey(Position_menu_relations record);
}