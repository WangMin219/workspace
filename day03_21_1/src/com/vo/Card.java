package com.vo;

public class Card {
	private int id;
	private int code;
	public Card() {
		super();
	}
	public Card(int id, int code) {
		super();
		this.id = id;
		this.code = code;
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
	@Override
	public String toString() {
		return "Card [id=" + id + ", code=" + code + "]";
	}
	

}
