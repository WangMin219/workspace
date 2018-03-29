package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.StudentMapper;
import com.vo.Student;

public class StudentTest {
	public static void main(String args[]) throws IOException
	{
		InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession=sqlSessionFactory.openSession();
		StudentMapper sm=sqlSession.getMapper(StudentMapper.class);
		Student ww=sm.selectStuById(34);
		System.out.println(ww);
		
		
		
	}
}
