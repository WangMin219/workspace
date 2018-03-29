package com.user;

public class User {
	private int ID;
	private int name;
	private int jobNumber;
	private String department;
	public User() {
		super();
	}
	public User(int iD, int name, int jobNumber, String department) {
		super();
		ID = iD;
		this.name = name;
		this.jobNumber = jobNumber;
		this.department = department;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(int jobNumber) {
		this.jobNumber = jobNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
