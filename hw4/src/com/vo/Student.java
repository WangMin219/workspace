package com.vo;

public class Student {
	private int id;
	private int stuNo;
	private String stuName;
	private String className;
	private int stuId;
	public Student() {
		super();
	}
	public Student(int id, int stuNo, String stuName, String className, int stuId) {
		super();
		this.id = id;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.className = className;
		this.stuId = stuId;
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
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuNo=" + stuNo + ", stuName=" + stuName + ", className=" + className
				+ ", stuId=" + stuId + "]";
	}
	

}
