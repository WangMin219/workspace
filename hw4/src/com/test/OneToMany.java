package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.CardMapper;
import com.mapper.OrderMapper;
import com.mapper.ProductMapper;
import com.mapper.StudentMapper;
import com.vo.Card;
import com.vo.Order;
import com.vo.Product;
import com.vo.Student;

public class OneToMany {
	public static void main(String[] args) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();
		  
//		    //根据商商品查询所有
//			ProductMapper pm=session.getMapper(ProductMapper.class);
//			Product pro1=pm.selectProductByOrderId(1);
//			System.out.println(pro1);
//			//根据订单查询所有信息
//			OrderMapper om=session.getMapper(OrderMapper.class);
//			Order order=om.selectOrderById(1);
//			System.out.println(order);
			
			
			OrderMapper om=session.getMapper(OrderMapper.class);
			ProductMapper pm=session.getMapper(ProductMapper.class);
			Order o1=new Order();
			
			
			
			// 提交会话
			session.commit();
			// 关闭会话
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
