package com.dao;

import java.util.List;

import com.vo.Book;

public interface BookDao {
	//����鼮������
	public void addBook(Book book);

	//��ȡ�鼮����
	public List<Book> getBook();
	//�޸��鼮�ķ���
	public void updateBook(Book book1,Book book2);
	//��ѯ�鼮����
	public Book findBook(Book book);
	//ɾ���鼮����
	public void delectBook(Book book);

}
