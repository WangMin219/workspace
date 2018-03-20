package com.my.mapper;

import java.util.List;

import com.vo.User;

public interface UserMapper {
	//1)查询所有book信息
	public List<User> selectAllBook();
	//2)查询指定isbn的书的信息
	public List<User> selectByIsbn(int isbn);
	// 3)根据图书名查询图书
	public List<User> selectByBookName(String bookName);
    //4)根据价格查询图书
	public List<User> selectByPrice(int price);
    //5)根据作者、图书名查询图书
   // public	List<Book> selectWriterBookhao(String writer,int shuhao);
    // 6)添加图书
    public Boolean addBook(User book) ;
    //7)修改图书（根据ID）
    // 8)删除图书（根据ID）


}
