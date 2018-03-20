package com.my.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.my.vo.Student;

public interface StudentMapper {
    public Student selectStudentById0();
    
    public List<Student> selectAllStudent();
    
    public List<Student> selectAllStudent1(Integer id);
    
    public HashMap<String,Object> selectAllStudent2();
}
