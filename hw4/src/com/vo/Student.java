package com.vo;

public class Student {
	private int id;
	private int stuNo;
	private String stuName;
	private String className;
	private Card card;
	private int stuId;
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuNo=" + stuNo + ", stuName=" + stuName + ", className=" + className
				+ ", card=" + card + ", stuId=" + stuId + "]";
	}
	
	

}
