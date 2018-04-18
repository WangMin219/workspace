package com.dao;

import com.vo.Student;

public class StuDao implements IStuDao{


	public boolean checkStu(Student stu) {
	if(stu.getName().equals("www")&&stu.getSNo()==170) {
		return true;
	}
	else {
		return false;
	}

	
	}

	

	

}
