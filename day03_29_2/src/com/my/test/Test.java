package com.my.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.my.mapper.StudentMapper;
import com.vo.Student;



public class Test {
	public static void main(String args[]) throws IOException
	{
		InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession=sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student stu=new Student();
		stu.setStuNo(123);
		stu.setStuName("Õı√Ù");
		stu.setAge(18);
		stu.setPhone(18888);
		stu.setSex("≈Æ");
		studentMapper.insertStudent(stu);
		
	
		sqlSession.commit();
		sqlSession.close();
	}
}
