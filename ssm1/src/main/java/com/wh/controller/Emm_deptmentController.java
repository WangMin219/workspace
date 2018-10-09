package com.wh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wh.bean.Department;
import com.wh.service.Emm_deptmentService;
import com.wh.until.Msg;

@RequestMapping("emm_deptment")
@Controller
public class Emm_deptmentController {

	@Autowired
	private Emm_deptmentService emm_deptmentService;
	
	@RequestMapping("/getAllDept")
	@ResponseBody
	public Msg getAllDept() {
		List<Department> list_dept = emm_deptmentService.getAllDept();
		
		return Msg.success().add("list_dept", list_dept);
	}
	
}
