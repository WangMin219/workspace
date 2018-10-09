package com.wh.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.bean.Employee;
import com.wh.dao.EmployeeMapper;
import com.wh.service.EmployeeService;
import com.wh.vo.Employee_department;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee_department> getAllEmployee() {
		List<Employee_department> list = employeeMapper.getAllEmployee();
		return list;
	}

	@Override
	public List<Employee_department> getAllEmployeeByName_Phone(Integer emmployeeId, String emmployeename) {
		Employee_department emp_dep = new Employee_department();
		emp_dep.setEmployeeId(emmployeeId);
		emp_dep.setEmployeeName(emmployeename);
		List<Employee_department> list = employeeMapper.getAllEmployeeByName_Phone(emp_dep);
		return list;
	}

	@Override
	public Employee_department getEmpById(int employeeId) {
		return employeeMapper.getEmpById(employeeId);
	}

	@Override
	public void updateEmployeeStatus(int employeeId, int status) {
		employeeMapper.updateEmployeeStatus(employeeId, status);
		
	}

	// 修改Emp
	@Override
	public void updataEmp(Employee employee) {
		employeeMapper.updateEmp(employee);
		
	}

	// 添加Emp
	@Override
	public void addEmp(Employee employee) {
//		employeeMapper.addEmp(employee);
		employeeMapper.insert(employee);
	}

}
 