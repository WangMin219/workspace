package com.vo;

public class Student {
	private int id;
	private int stuNo;
	private String stuName;
	private String sex;
	private int age;
	private int phone;
	public Student() {
		super();
	}
	public Student(int id, int stuNo, String stuName, String sex, int age, int phone) {
		super();
		this.id = id;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuNo=" + stuNo + ", stuName=" + stuName + ", sex=" + sex + ", age=" + age
				+ ", phone=" + phone + "]";
	}
	
	

}
