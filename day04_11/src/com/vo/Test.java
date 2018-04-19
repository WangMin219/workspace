package com.vo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext axt=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		Hello hello=(Hello) axt.getBean("hello");
//		System.out.println(hello.getMsg());
	
		
		ApplicationContext axt=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Course course=(Course) axt.getBean("course");
		System.out.println(course);
		ApplicationContext axt1=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Course course1=(Course) axt.getBean("course1");
		System.out.println(course1);
	}

}
                                                                                                                                                                                 