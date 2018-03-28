package com.mapper;

import com.vo.Student;

public interface StudentMapper {
	//查询学生信息附带查询card信息？？？
	public Student selectStudentById(int id);

}
