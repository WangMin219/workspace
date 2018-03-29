package com.dao;

import java.util.List;

import com.db.BookDB;
import com.vo.Book;

public class BookDaoImp implements BookDao{
	List<Book> list =BookDB.bookList;

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		list.add(book);
		
		
	}



	@Override
	public List<Book> getBook() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Book findBook(Book book) {
		// TODO Auto-generated method stub
		for(Book bookOne:list) {
			if(bookOne.getBookName().equals(book.getBookName())) {
				return bookOne;
			}
		}
		return null;
	}

	@Override
	public void updateBook(Book book1, Book book2) {
		// TODO Auto-generated method stub
		book1.setBookAuthor(book2.getBookAuthor());
		book1.setBookPrice(book2.getBookPrice());
		
	}


	@Override
	public void delectBook(Book book) {
		// TODO Auto-generated method stub
		list.remove(book);
		
	}

}
