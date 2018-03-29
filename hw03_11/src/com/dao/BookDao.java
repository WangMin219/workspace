package com.dao;

import java.util.List;

import com.vo.Book;

public interface BookDao {
	//添加书籍方法；
	public void addBook(Book book);

	//获取书籍方法
	public List<Book> getBook();
	//修改书籍的方法
	public void updateBook(Book book1,Book book2);
	//查询书籍方法
	public Book findBook(Book book);
	//删除书籍方法
	public void delectBook(Book book);

}
