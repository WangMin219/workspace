package com.my.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.my.mapper.BookMapper;
import com.vo.Book;



public class Test {
	public static void main(String args[]) throws IOException
	{
		InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	
		SqlSession sqlSession=sqlSessionFactory.openSession();
		BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
		//创建bookMapper调用selectAllBook方法
		List<Book> bookList=bookMapper.selectAllBook();
	    //遍历book
		for(Book book:bookList) {
			System.out.println("书名："+book.getBookName()+"  "+"书号："+book.getIsbn()+"  "+"作者:"+book.getWriter()+"  "+"价格:"+book.getPrice());
		}
		//调用selectByIsbn方法
		List<Book> bookisbn=bookMapper.selectByIsbn(112);
		for(Book book1:bookisbn) {
			System.out.println("书名："+book1.getBookName()+"  "+"书号："+book1.getIsbn()+"  "+"作者:"+book1.getWriter()+"  "+"价格:"+book1.getPrice());
		}
		//调用selectByBookName方法
		List<Book> bookName=bookMapper.selectByBookName("数据结构");
		for(Book book2:bookName) {
			System.out.println("书名："+book2.getBookName()+"  "+"书号："+book2.getIsbn()+"  "+"作者:"+book2.getWriter()+"  "+"价格:"+book2.getPrice());
		}
		
		//调用selectByPrice方法
		List<Book> price=bookMapper.selectByPrice(23);
		for(Book book3:price) {
			System.out.println("书名："+book3.getBookName()+"  "+"书号："+book3.getIsbn()+"  "+"作者:"+book3.getWriter()+"  "+"价格:"+book3.getPrice());
		}
		
		
		
//	Book bookWriterSHUHao = bookMapper.selectWriterBookhao("hf", 2332);
//	System.out.println(bookWriterSHUHao+"");
//   
	   //创建书对象，加入数据
	   Book book5=new Book();
	   book5.setBookName("javaee");
	   book5.setIsbn(222);
	   book5.setWriter("敏宝宝");
	   book5.setPrice(34);
	   //调用insertBook方法，运行查看数据是否插入
	   bookMapper.insertBook(book5);
	   //创建对象
	   Book book6=new Book();
	   book6.setId(3); 
	   
	   book6.setPrice(34);
	   //调用updateBook方法
	   bookMapper.updateBook(book6);
	  //Book的头String 方法写过了，不需要在再写了，直接用创建的对象名就可以了
	  System.out.println(book6);
	  
	  
	   //调用deleteBook方法
	    bookMapper.deleteBook(6);
		

		sqlSession.commit();
		sqlSession.close();
	}
}
