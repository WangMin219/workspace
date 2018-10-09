package com.wh.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.bean.Department;
import com.wh.dao.DepartmentMapper;
import com.wh.service.Emm_deptmentService;

@Service
public class Emm_deptmentServiceImp implements Emm_deptmentService {

	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public List<Department> getAllDept() {
		return departmentMapper.getAllDept();
	}
	
	
	
}
