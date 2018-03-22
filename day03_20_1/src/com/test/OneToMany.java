package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.CardMapper;
import com.mapper.ClazzMapper;
import com.mapper.PersonMapper;
import com.mapper.StudentMapper;
import com.vo.Card;
import com.vo.Clazz;
import com.vo.Person;
import com.vo.Student;

public class OneToMany {
	public static void main(String[] args) {
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session=sqlSessionFactory.openSession();
			
			ClazzMapper cm=session.getMapper(ClazzMapper.class);
			Clazz c1=new Clazz();
			c1.setCode(214);
			c1.setName("√Ù±¶±¶");
			cm.insertClazz(c1);
			
			StudentMapper sm=session.getMapper(StudentMapper.class);
			Student s1=new Student();
			s1.setName("ajk");
			s1.setAge(12);
			s1.setSex("≈Æ");
			s1.setClazz_id(1);
		
		    session.commit();
		    session.close();
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
