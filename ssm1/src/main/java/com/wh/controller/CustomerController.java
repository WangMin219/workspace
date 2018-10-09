package com.wh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wh.bean.Customer;
import com.wh.service.CustomerService;
import com.wh.until.Msg;

@RequestMapping("customer")
@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="seven_new_customers", method=RequestMethod.GET)
	@ResponseBody
	public Msg seven_new_customers() {
		List<Customer> list = customerService.getseven_new_customers(7);
		
		return Msg.success().add("seven_new_customers", list.size());
	}
	
	@RequestMapping(value="moth_new_customers", method=RequestMethod.GET)
	@ResponseBody
	public Msg moth_new_customers() {
		List<Customer> list = customerService.getseven_new_customers(7);
		
		return Msg.success().add("moth_new_customers", list.size());
	}
}
