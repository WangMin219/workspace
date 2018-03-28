package com.vo;

public class Card {
	private int id;
	private int cardNo;
	private String departName;
	private String birthplace;
	public Card() {
		super();
	}
	public Card(int id, int cardNo, String departName, String birthplace) {
		super();
		this.id = id;
		this.cardNo = cardNo;
		this.departName = departName;
		this.birthplace = birthplace;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", cardNo=" + cardNo + ", departName=" + departName + ", birthplace=" + birthplace
				+ "]";
	}
	

}
