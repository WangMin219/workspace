package com.wh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wh.bean.Orders;
import com.wh.service.OrderService;
import com.wh.until.Msg;

@RequestMapping("orders")
@Controller
public class OrdersController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/new_sales_orders_seven", method = RequestMethod.GET)
	@ResponseBody
	public Msg new_sales_orders_seven() {

		List<Orders> list = orderService.getnew_sales_orders_seven();

		return Msg.success().add("new_sales_orders_seven", list.size());
	}
}
