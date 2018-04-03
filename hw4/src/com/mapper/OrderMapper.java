package com.mapper;

import com.vo.Order;

public interface OrderMapper {
	public Order selectOrderById(int id);
	
	//插入Order
	public void insertOrder(Order order);

}
