package com.vo;

public class Employee {
	private int id;
	private String loginname;
	private int password;
	private String name;
	private String sex;
	private int age;
	private int phone;
	private double sal;
	private String state;
	public Employee() {
		super();
	}
	public Employee(int id, String loginname, int password, String name, String sex, int age, int phone, double sal,
			String state) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.sal = sal;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", loginname=" + loginname + ", password=" + password + ", name=" + name
				+ ", sex=" + sex + ", age=" + age + ", phone=" + phone + ", sal=" + sal + ", state=" + state + "]";
	}
	

}
