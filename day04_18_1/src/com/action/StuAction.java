package com.action;

import com.service.IStuService;
import com.vo.Student;

public class StuAction {
	private IStuService stuService;

	public StuAction() {
		super();
	}

	public IStuService getStuService() {
		return stuService;
	}

	public void setStuService(IStuService stuService) {
		this.stuService = stuService;
	}
	public boolean isExsit(Student stu) {
		boolean result1=stuService.checkStu(stu);
		if(result1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
