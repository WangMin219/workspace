package com.my.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.my.mapper.UserMapper;
import com.my.util.MyBatisUtil;
import com.my.vo.User;

public class Test {
	

	public static void main(String[] args) throws IOException {
	
		User user=new User();
		user.setName("ÍõÐ¡Áù");
		user.setSex("ÄÐ");
		user.setAge(8);
		
		
		SqlSession session=MyBatisUtil.openSession();
		
	//	session.insert("com.my.mapper.UserMapper.save", user);
		
		//User user1=session.selectOne("com.my.mapper.UserMapper.selectUserById",new Integer(2));
		UserMapper um=session.getMapper(UserMapper.class);
		um.saveUser(user);
		
	/*	
		
		
		User user1=um.selectUserById(new Integer(2));
		
		
	
		System.out.println(user1.getId()+","+user1.getName()+","+user1.getSex()+","+user1.getAge());
*/		
		session.commit();
		
		session.close();
		
		
		
		
	}

}
