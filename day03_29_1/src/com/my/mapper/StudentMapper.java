package com.my.mapper;

import com.vo.Student;

public interface StudentMapper {
	

	public Student selectStuById(Integer stuNo);
	public void delectStuById(int id);

}
