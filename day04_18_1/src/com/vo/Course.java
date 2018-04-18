package com.vo;

public class Course {
	private int id;
	private String Cname;
	private int Chour;
	private String teacher;
	public Course() {
		super();
	}
	
	public Course(int id, String cname, int chour, String teacher) {
		super();
		this.id = id;
		Cname = cname;
		Chour = chour;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getChour() {
		return Chour;
	}
	public void setChour(int chour) {
		Chour = chour;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", Cname=" + Cname + ", Chour=" + Chour + ", teacher=" + teacher + "]";
	}
	
	
	

}
