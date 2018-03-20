package com.my.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory;
	static{		
	//	InputStream 
		try {
			Reader reader=Resources.getResourceAsReader("mybatis.cfg.xml");
			SqlSessionFactoryBuilder bulider=new SqlSessionFactoryBuilder();
			sqlSessionFactory=bulider.build(reader);			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
		
	public static SqlSession openSession(){		
		return sqlSessionFactory.openSession();
	}
	

}
