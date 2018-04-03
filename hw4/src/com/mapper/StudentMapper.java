package com.mapper;

import com.vo.Student;

public interface StudentMapper {
	//查询学生信息通过id
	public Student selectStudentById(int id);
	//插入
	public void insertStudent(Student student);
	//	//修改掉副表的id  主表的stuid 外键也要变
	public void updateStudentById(Student student);

}
