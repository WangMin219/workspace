package com.vo;

public class Person {
	private int id;
	private String name;
	private String sex;
	private int age;
	private Card card;
	private int card_id;
	public Person() {
		super();
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
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	
	public int getCard_id() {
		return card_id;
	}


	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", 姓名=" + name + ", 性别=" + sex + ", 年龄=" + age + ", 卡号=" + card + "]";
	}
	
	

}
