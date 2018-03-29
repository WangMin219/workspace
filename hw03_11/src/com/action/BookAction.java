package com.action;

import java.util.List;

import com.dao.BookDao;
import com.dao.BookDaoImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.vo.Book;

public class BookAction extends ActionSupport implements ModelDriven<Book>{
	private Book b=new Book();
	BookDao bookDao=new BookDaoImp();
	List<Book> bList =bookDao.getBook();
	
	ValueStack vs=ActionContext.getContext().getValueStack();
	
	

	public BookAction() {
		super();
	}
	

	@Override
	public Book getModel() {
		// TODO Auto-generated method stub
		return b;
	}
	public String addBookMethod() {
		bookDao.addBook(b);
		return "addOK";
	}
	public String getBookMethod() {
		vs.set("books", bList);
		return "getOK";
	}
	
	
	
	public String findBookMethod() {
		Book findBook=bookDao.findBook(b);
		ActionContext.getContext().getSession().put("Book", findBook);
		return "findOK";
	}
	
	
	
	public String updateBookMethod() {
		Book findBook=bookDao.findBook(b);
		bookDao.updateBook(findBook, b);
		ActionContext.getContext().getSession().put("Book", bList);
		return "updateOK";
	}
	public String delectBookMethod() {
		 //找到书籍
        Book findBook=bookDao.findBook(b);
        bookDao.delectBook(findBook);
        //vs.set("Book","bList");  这样操作会显示删除所有，但实际只删除了一个
        ActionContext.getContext().getSession().put("Book", bList);
        return "deleteOK";
	}
	
	

}
