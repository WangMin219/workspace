package com.my.mapper;

import java.util.List;

import com.vo.Book;

public interface BookMapper {
	//1)查询所有book信息，返回的是集合对象Book
	public List<Book> selectAllBook();
	//2)查询指定isbn的书的信息，返回的是集合对象Book因为有可能isbn是重复的，他不是主键
	public List<Book> selectByIsbn(int isbn);
	// 3)根据图书名查询图书
	public List<Book> selectByBookName(String bookName);
    //4)根据价格查询图书
	public List<Book> selectByPrice(int price);
    //5)根据作者、图书名查询图书
   // public Book selectWriterBookhao(String writer,int shuhao);
    // 6)添加图书
    public void insertBook(Book book) ;
    //7)修改图书（根据ID）返回book
    public  void updateBook(Book book) ;
    // 8)删除图书（根据ID）
    public  void deleteBook(int id) ;
	
    


}
