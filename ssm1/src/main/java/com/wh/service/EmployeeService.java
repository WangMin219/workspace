package com.wh.service;

import java.util.List;

import com.wh.bean.Employee;
import com.wh.vo.Employee_department;

public interface EmployeeService {

	List<Employee_department> getAllEmployee();

	List<Employee_department> getAllEmployeeByName_Phone(Integer emmployeeId, String emmployeename);

	Employee_department getEmpById(int employeeId);

	void updateEmployeeStatus(int employeeId, int status);

	void updataEmp(Employee employee);

	void addEmp(Employee employee);

}
