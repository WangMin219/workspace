package com.wh.dao;

import com.wh.bean.Orders_detail;
import com.wh.bean.Orders_detailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Orders_detailMapper {
    long countByExample(Orders_detailExample example);

    int deleteByExample(Orders_detailExample example);

    int deleteByPrimaryKey(Integer detailId);

    int insert(Orders_detail record);

    int insertSelective(Orders_detail record);

    List<Orders_detail> selectByExample(Orders_detailExample example);

    Orders_detail selectByPrimaryKey(Integer detailId);

    int updateByExampleSelective(@Param("record") Orders_detail record, @Param("example") Orders_detailExample example);

    int updateByExample(@Param("record") Orders_detail record, @Param("example") Orders_detailExample example);

    int updateByPrimaryKeySelective(Orders_detail record);

    int updateByPrimaryKey(Orders_detail record);
}