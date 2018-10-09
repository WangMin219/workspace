package com.wh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wh.bean.Employee;
import com.wh.service.EmployeeService;
import com.wh.until.Msg;
import com.wh.vo.Employee_department;

@RequestMapping("employee")
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("getEmployee")
	@ResponseBody
	public Msg getAllEmployee(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Integer employeeId,String employeeName) {
		System.out.println("获取所有员工信息");
		
		PageHelper.startPage(pn, 5);
		
		List<Employee_department> listEmp = new ArrayList<Employee_department>();
		
//		System.out.println("..................."+employeeId);
//		System.out.println(employeeName);
		
		if(employeeId == null && employeeName == null) {
			System.out.println("全查");
			listEmp = employeeService.getAllEmployee();
		} else {
			System.out.println("组合查");
			listEmp = employeeService.getAllEmployeeByName_Phone(employeeId, employeeName);
		}
		
		System.out.println("用户一共有:"+listEmp.size());
		PageInfo page = new PageInfo(listEmp, 3);
		
		return Msg.success().add("listEmp", page);
	}
	
	// 根据ID获取到Emp信息
	@RequestMapping("/getEmpById")
	@ResponseBody
	public Msg getEmpById(int employeeId) {
//		System.out.println(employeeId);
		Employee_department emp_dept = employeeService.getEmpById(employeeId);
//		System.out.println("================================================="+employeeId);
		return Msg.success().add("emp_dept", emp_dept);
	}
	
	@RequestMapping("/updateEmployeeStatus")
	@ResponseBody
	public Msg updateEmployeeStatus(int employeeId,int status) {
		
		employeeService.updateEmployeeStatus(employeeId,status);
		
		return Msg.success();
	}
	
	@RequestMapping("/updataEmp")
	@ResponseBody
	public Msg updataEmp(Employee employee) {
		employeeService.updataEmp(employee);
		System.out.println("================"+employee.getEmployeeId());
		return Msg.success();
	}
	
	@RequestMapping("/addEmp")
	@ResponseBody
	public Msg addEmp(Employee employee) {
		employeeService.addEmp(employee);
		return Msg.success();
	}

}
