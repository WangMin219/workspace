package com.vo;

public class Student {
	private int id;
	private String name;
	private String sex;
	private int age;
	private int clazz_id;
	public Student() {
		super();
	}
	public Student(int id, String name, String sex, int age, int clazz_id) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.clazz_id = clazz_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(int clazz_id) {
		this.clazz_id = clazz_id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", clazz_id=" + clazz_id
				+ "]";
	}
	
	

}
