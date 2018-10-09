package com.wh.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.bean.Menu;
import com.wh.dao.EmployeeMapper;
import com.wh.service.JurisdictionService;

@Service
public class JurisdictionServiceImp implements JurisdictionService {
	
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<Menu> getJurisdiction_Pare(int id) {
		List<Menu> list = employeeMapper.getJurisdiction_Pare(id);
		
		System.out.println("获取到得父级菜单:"+list.size());
		
		return list;
	}

	@Override
	public List<Menu> getJurisdiction_Son(int id) {
		List<Menu> list = employeeMapper.getJurisdiction_Son(id);
		
		System.out.println("获取到得子级菜单:"+list.size());
		
		return list;
	}


}
