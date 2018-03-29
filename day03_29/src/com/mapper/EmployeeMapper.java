package com.mapper;

import java.util.HashMap;
import java.util.List;

import com.vo.Employee;

public interface EmployeeMapper {
	//if查询
	public List<Employee> selectAllEmployeeIf(HashMap<String,Object> params);
	public List<Employee> selectAllEmployeeChoose(HashMap<String,Object> params);
	public void updateEmployeeBySet(Employee ee);
	//范围内的查询
	public List<Employee> selectForeach(List<Integer> ids);

}
