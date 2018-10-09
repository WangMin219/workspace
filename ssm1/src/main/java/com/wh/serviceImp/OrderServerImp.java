package com.wh.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.bean.Orders;
import com.wh.dao.OrdersMapper;
import com.wh.service.OrderService;
import com.wh.until.TimeSeven;

@Service
public class OrderServerImp implements OrderService {

	@Autowired
	private OrdersMapper orderMapper;

	@Override
	public List<Orders> getnew_sales_orders_seven() {
		// 获取当前系统时间
		List<Object> list = TimeSeven.time(7);

		String stateTime = (String) list.get(0);
		String endTime = (String) list.get(1);
		
		System.out.println("============="+stateTime);

		List<Orders> orderlist = orderMapper.getnew_sales_orders_seven(endTime, stateTime);

		return orderlist;
	}

}
