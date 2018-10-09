package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.CarInfoService;
import com.service.OrderInfoService;
import com.util.Result;

@Controller
@RequestMapping("/orderinfo")
public class OrderInfoController {
	@Resource
	private OrderInfoService os;
	
	@RequestMapping("/add.do")
	@ResponseBody
	public Result addOrderInfo(String user_id, String user_name, String plate, String trouble_code,String trouble_name, String contact,
			String contact_way, String remark) {
		System.out.println("����OrderInfoController/add.do");
		Result rs=os.addOrderInfo(user_id, user_name, plate, trouble_code,trouble_name, contact, contact_way, remark);
		System.out.println(rs);
		return rs;		
	}
	
	@RequestMapping("/showAll.do")
	@ResponseBody
	public Result findAllOrder() {
		System.out.println("����OrderInfoController/showAll.do");
		Result rs=os.findAllOrder();
		System.out.println(rs);
		return rs;	
	}
	
	@RequestMapping("/delete.do")
	@ResponseBody
	public Result delOrderInfo(String id) {
		System.out.println("����OrderInfoController/delete.do");
		Result rs=os.delOrderInfo(id);
		System.out.println(rs);
		return rs;
	}
	
	@RequestMapping("/change.do")
	@ResponseBody
	public Result changStatus(String id) {
		System.out.println("����OrderInfoController/change.do");
		Result rs=os.changStatus(id);
		System.out.println(rs);
		return rs;
	}
	
	@RequestMapping("/show.do")
	@ResponseBody
	public Result findOrder(String user_id) {
		System.out.println("����OrderInfoController/show.do");
		Result rs=os.findOrder(user_id);
		System.out.println(rs);
		return rs;
	}
	
	@RequestMapping("/sort.do")
	@ResponseBody
	public Result findBySort() {
		System.out.println("����OrderInfoController/sort.do");
		Result rs=os.findBySort();
		System.out.println(rs);
		return rs;
	}
	
	@RequestMapping("/deal.do")
	@ResponseBody
	public Result findDealOrder(){
		System.out.println("����OrderInfoController/deal.do");
		Result rs=os.findDealOrder();
		System.out.println(rs);
		return rs;
	}
	
	@RequestMapping("/undeal.do")
	@ResponseBody
	public Result findUndealOrder(){
		System.out.println("����OrderInfoController/undeal.do");
		Result rs=os.findUndealOrder();
		System.out.println(rs);
		return rs;
	}
	
	@RequestMapping("/searchorder.do")
	@ResponseBody
	public Result searchOrderInfo(String type, String keywords) {
		System.out.println("����OrderInfoController/search.do");
		Result rs=os.searchOrderInfo(type, keywords);
		System.out.println(rs);
		return rs;
	}
}
