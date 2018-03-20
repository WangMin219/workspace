package com.my.mapper;

import java.util.List;

import com.vo.User;

public interface UserMapper {
	//1)��ѯ����book��Ϣ
	public List<User> selectAllBook();
	//2)��ѯָ��isbn�������Ϣ
	public List<User> selectByIsbn(int isbn);
	// 3)����ͼ������ѯͼ��
	public List<User> selectByBookName(String bookName);
    //4)���ݼ۸��ѯͼ��
	public List<User> selectByPrice(int price);
    //5)�������ߡ�ͼ������ѯͼ��
   // public	List<Book> selectWriterBookhao(String writer,int shuhao);
    // 6)���ͼ��
    public Boolean addBook(User book) ;
    //7)�޸�ͼ�飨����ID��
    // 8)ɾ��ͼ�飨����ID��


}
