package com.wh.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.bean.Customer;
import com.wh.dao.CustomerMapper;
import com.wh.service.CustomerService;
import com.wh.until.TimeSeven;

@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<Customer> getseven_new_customers(int t) {
		// 获取当前系统时间
		List<Object> list = TimeSeven.time(t);

		String stateTime = (String) list.get(0);
		String endTime = (String) list.get(1);

		List<Customer> listCustomer = customerMapper.selectByTime(endTime, stateTime);
		
		System.out.println("一共有:"+listCustomer.size());

		return listCustomer;
	}
}
