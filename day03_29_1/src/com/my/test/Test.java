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
		SqlSession session=sqlSessionFactory.openSession();
		StudentMapper sm =session.getMapper(StudentMapper.class);
		//≤‚ ‘“ªº∂ª∫¥Ê
		Student stu = sm.selectStuById(34);
		System.out.println(stu);
		
		//≤‚ ‘∂˛º∂ª∫¥Ê
	//	session.close();
      //   session=sqlSessionFactory.openSession();
    //	Student stu1 = sm.selectStuById(34);
	//	System.out.println(stu1);
//		sqlSession.close();
//		InputStream inputStream1=Resources.getResourceAsStream("mybatis.cfg.xml");
//		SqlSessionFactory sqlSessionFactory1=new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession sqlSession1=sqlSessionFactory.openSession();
//		StudentMapper studentMapper1 = sqlSession.getMapper(StudentMapper.class);
//		Student stu2=studentMapper1.selectStuById(34);
//		System.out.println(stu2);
//		sm.delectStuById(1);
//		session.commit();
//		Student stu = sm.selectStuById(34);
//	    System.out.println(stu);
		
		session.close();
	}
}
