package com.my.mapper;

import com.vo.Student;

public interface StudentMapper {
	

	public void insertStudent(Student stu);
	//@Insert("insert into student(stuNo,stuName,sex,age,phone)  values(#{stuNo},#{stuName},#{sex},#{age},#{phone})")

}
