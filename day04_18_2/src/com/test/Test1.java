package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vo.ExampleBean;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext axt=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ExampleBean exb=axt.getBean("exampleBean",ExampleBean.class);
		System.out.println(exb.getId());
		System.out.println(exb.getName());
		System.out.println(exb.getSchool());
		System.out.println(exb.getStudents());
	}

}
