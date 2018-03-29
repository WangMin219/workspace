package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.EmployeeMapper;
import com.vo.Employee;


public class Test {
	public static void main(String[] args) {
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session=sqlSessionFactory.openSession();
			EmployeeMapper em=session.getMapper(EmployeeMapper.class);
			//choose µƒ≤È—Ø
			HashMap<String,Object> params=new HashMap<String,Object>();
			params.put("id", 1);
			List<Employee> list=em.selectAllEmployeeChoose(params);
			for(Employee ee:list) {
				System.out.println(ee);
			}
			//update≤‚ ‘
			Employee ee=new Employee();
			ee.setAge(100);
			ee.setId(1);
			em.updateEmployeeBySet(ee);
			//≤È—Ø∑∂Œßµƒ≤‚ ‘
			
			List<Integer> ids=new ArrayList<Integer>();
			ids.add(1);
			ids.add(4);
			List<Employee> list1=em.selectForeach(ids);
			
			for(Employee emp:list1){
				System.out.println(emp);
			}

			
			                         
			
			
			
		    session.commit();
		    session.close();
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
