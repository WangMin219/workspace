package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.StudentMapper;
import com.vo.Student;



public class OneToOne {
	public static void main(String[] args) {
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session=sqlSessionFactory.openSession();
			StudentMapper sm=session.getMapper(StudentMapper.class);
			Student st= sm.selectStudentById(1);
			System.out.println(st);
			
		    
		    
		    session.commit();
		    session.close();
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
