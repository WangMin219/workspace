package com.my.mapper;

import java.util.List;

import com.vo.Book;

public interface BookMapper {
	//1)��ѯ����book��Ϣ�����ص��Ǽ��϶���Book
	public List<Book> selectAllBook();
	//2)��ѯָ��isbn�������Ϣ�����ص��Ǽ��϶���Book��Ϊ�п���isbn���ظ��ģ�����������
	public List<Book> selectByIsbn(int isbn);
	// 3)����ͼ������ѯͼ��
	public List<Book> selectByBookName(String bookName);
    //4)���ݼ۸��ѯͼ��
	public List<Book> selectByPrice(int price);
    //5)�������ߡ�ͼ������ѯͼ��
   // public Book selectWriterBookhao(String writer,int shuhao);
    // 6)���ͼ��
    public void insertBook(Book book) ;
    //7)�޸�ͼ�飨����ID������book
    public  void updateBook(Book book) ;
    // 8)ɾ��ͼ�飨����ID��
    public  void deleteBook(int id) ;
	
    


}
