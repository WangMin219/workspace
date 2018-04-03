package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
			
			
//			OrderMapper om=session.getMapper(OrderMapper.class);
//			ProductMapper pm=session.getMapper(ProductMapper.class);
//			Order o1=new Order();
//			o1.setOrderNo("123442");
//			o1.setOrderTime("746");
//			o1.setOrderPerson("skjfj");
//			om.insertOrder(o1);
//			
//			Product pro1=new Product();
//			pro1.setProNo("14");
//			pro1.setProName("uidfh");
//			pro1.setPrice(1234);
//			pro1.setProNum(672347);
//			pro1.setOrder_id(o1.getId());
//			pm.insertProduct(pro1);
			
			OrderMapper om=session.getMapper(OrderMapper.class);
			ProductMapper pm=session.getMapper(ProductMapper.class);
			List<Product> list=(List<Product>) pm.selectProductByOrderId(1);
			
			if(list.size()>0) {
				System.out.println("有商品不能删");
			}else {
				pm.deleteProductById(2);
			}
			
			
			
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
