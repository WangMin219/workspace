package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.my.mapper.BookMapper;
import com.my.mapper.UserMapper;
import com.vo.Book;
import com.vo.User;

public class Test {
	public static void main(String args[]) throws IOException
	{
		InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper bookMapper = sqlSession.getMapper(UserMapper.class);
		List<User> bookList=bookMapper.selectAllUser1();
	
		for(User book:bookList) {
			System.out.println("ren√˚£∫"+book.getName()+"  "+"ƒÍ¡‰£∫"+book.getAge());
		}

		
		sqlSession.commit();
		sqlSession.close();
	}

}
