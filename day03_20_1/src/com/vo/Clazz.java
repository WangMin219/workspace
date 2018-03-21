package com.vo;

public class Clazz {
	private int id;
	private int code;
	private String name;
	public Clazz() {
		super();
	}
	public Clazz(int id, int code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
	

}
