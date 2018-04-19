//package com.vo;
//
//import java.util.Scanner;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.action.StuAction;
//
//public class Test {
//	public static void main(String[] args) {
////		ApplicationContext axt=new ClassPathXmlApplicationContext("ApplicationContext.xml");
////		Hello hello=(Hello) axt.getBean("hello");
////		System.out.println(hello.getMsg());
//		
//		ApplicationContext axt=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		Student stu=new Student();
//	    Scanner sc=new Scanner(System.in);
//	    String name=sc.nextLine();
//	    int no=sc.nextInt();
//		stu.setName(name);
//		stu.setSNo(no);
//		StuAction stuAction1=(StuAction) axt.getBean("stuAction");
//		boolean result3=stuAction1.isExsit(stu);
//		System.out.println(result3);
//		if(result3) {
//			System.out.println("学生存在");	
//		}
//		else {
//			System.out.println("学生不存在");
//		}
//	}
//
//}
////                                                                                                                                                                                 