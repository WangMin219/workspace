package com.my.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.my.mapper.StudentMapper;
import com.my.mapper.UserMapper;
import com.my.util.MyBatisUtil;
import com.my.vo.Student;
import com.my.vo.User;

public class StudentTest {
	

	public static void main(String[] args) throws IOException {
	
		SqlSession session=MyBatisUtil.openSession();
		StudentMapper stm=session.getMapper(StudentMapper.class);
		
	//	Student student=stm.selectStudentById0();
		
	//	Student student=session.selectOne("com.my.mapper.StudentMapper.selectStudentById0");
	/*	
		List<Student> stuList=stm.selectAllStudent();
		for(Student stu:stuList){
			  System.out.println("id="+stu.getId()+",stuName="+stu.getStuName()+",stuNo="+stu.getStuNo());
			
		}
		
     */
		
	  HashMap<String,Object> map=stm.selectAllStudent2();
	   System.out.println(map);
	 
		session.commit();
		
		session.close();
		
		
		
		
	}

}
