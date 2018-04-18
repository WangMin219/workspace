package com.vo;

import java.util.List;
import java.util.Map;

public class ExampleBean {
	private int id;
	private String name;
	private List<String> school;
	private Map<String,String> students;
	public ExampleBean() {
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
	public List<String> getSchool() {
		return school;
	}
	public void setSchool(List<String> school) {
		this.school = school;
	}
	public Map<String, String> getStudents() {
		return students;
	}
	public void setStudents(Map<String, String> students) {
		this.students = students;
	}
	

}
