package com.monocept.model;

public class Student {
	private int sid;
	private String name;
	private int rollNo;
	public Student(int sid, String name, int rollNo) {
		super();
		this.sid = sid;
		this.name = name;
		this.rollNo = rollNo;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", rollNo=" + rollNo + "]";
	}
	
}
