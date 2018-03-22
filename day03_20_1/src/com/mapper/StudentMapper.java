package com.mapper;

import java.util.List;

import com.vo.Student;

public interface StudentMapper {
public Student selectStudentById(Integer id);
	
	public List<Student> selectStudentByClazzId(Integer id);
	public void insertStudent(Student student);
}
