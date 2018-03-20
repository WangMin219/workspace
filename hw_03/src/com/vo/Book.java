package com.vo;

public class Book {
	private int id;
	private int isbn;
	private String bookName;
	private String writer;
	private int price;
	private int bookNum;
	public Book() {
		super();
	}
	public Book(int id, int isbn, String bookName, String writer, int price, int bookNum) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.bookName = bookName;
		this.writer = writer;
		this.price = price;
		this.bookNum = bookNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", bookName=" + bookName + ", writer=" + writer + ", price="
				+ price + ", bookNum=" + bookNum + "]";
	}
	

	
}
