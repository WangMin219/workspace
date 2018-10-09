package com.wh.dao;

import com.wh.bean.Link_man;
import com.wh.bean.Link_manExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Link_manMapper {
    long countByExample(Link_manExample example);

    int deleteByExample(Link_manExample example);

    int deleteByPrimaryKey(Integer linkMainId);

    int insert(Link_man record);

    int insertSelective(Link_man record);

    List<Link_man> selectByExample(Link_manExample example);

    Link_man selectByPrimaryKey(Integer linkMainId);

    int updateByExampleSelective(@Param("record") Link_man record, @Param("example") Link_manExample example);

    int updateByExample(@Param("record") Link_man record, @Param("example") Link_manExample example);

    int updateByPrimaryKeySelective(Link_man record);

    int updateByPrimaryKey(Link_man record);
}