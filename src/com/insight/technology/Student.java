package com.insight.technology;

public class Student {

	private int id;
	private String name;
	private int totalMarks;

	
	
	public Student(int id, String name, int totalMarks) {
		super();
		this.id = id;
		this.name = name;
		this.totalMarks = totalMarks;
	}
	
	public void setInt(int id) {

		this.id=id;

	}
	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;

	}
	public String getName() {
		return name;
	}

	public void setTotalMarks(int totalMarks) {

		this.totalMarks=totalMarks;
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", totalMarks=" + totalMarks + "]";
	}
	
	
}
