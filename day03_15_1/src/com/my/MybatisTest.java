package com.my;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.vo.User;

public class MybatisTest {
	public static void main(String[] args) {
	try {
		InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession=sqlSessionFactory.openSession();
		User user=new User(1,"ass.","ÄÐ",23);
		sqlSession.insert("com.my.mapper.UserMapper.save", user);
		sqlSession.commit();
		sqlSession.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}


}
