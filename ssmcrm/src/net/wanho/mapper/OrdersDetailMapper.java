package net.wanho.mapper;

import java.util.List;
import net.wanho.model.OrdersDetail;
import net.wanho.model.OrdersDetailExample;
import org.apache.ibatis.annotations.Param;

public interface OrdersDetailMapper {
    int countByExample(OrdersDetailExample example);

    int deleteByExample(OrdersDetailExample example);

    int deleteByPrimaryKey(Integer detailId);

    int insert(OrdersDetail record);

    int insertSelective(OrdersDetail record);

    List<OrdersDetail> selectByExample(OrdersDetailExample example);

    OrdersDetail selectByPrimaryKey(Integer detailId);

    int updateByExampleSelective(@Param("record") OrdersDetail record, @Param("example") OrdersDetailExample example);

    int updateByExample(@Param("record") OrdersDetail record, @Param("example") OrdersDetailExample example);

    int updateByPrimaryKeySelective(OrdersDetail record);

    int updateByPrimaryKey(OrdersDetail record);
}