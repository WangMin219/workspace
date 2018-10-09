package com.wh.dao;

import com.wh.bean.Employee;
import com.wh.bean.EmployeeExample;
import com.wh.bean.Menu;
import com.wh.vo.Employee_department;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer employeeId);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer employeeId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

	List<Menu> getJurisdiction_Pare(int id);

	List<Menu> getJurisdiction_Son(int id);

	List<Employee_department> getAllEmployee();
	
	List<Employee_department> getAllEmployeeByName_Phone(Employee_department emp_dep);

	Employee_department getEmpById(int employeeId);

	void updateEmployeeStatus(int employeeId, int status);

	void updateEmp(Employee employee);

//	void addEmp(Employee employee);
}