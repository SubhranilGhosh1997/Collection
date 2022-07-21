package com.momocept.model;

public class Employee {
	private String eid;
	private String name;
	private double salary;
	private static int Id=100;
	public Employee(String name, double salary) {
		this.eid=genarateId();
		this.name=name;
		this.salary=salary;
	}
	private String genarateId()
	{
		Id++;
		return String.valueOf(Id);
		
	}
	public String getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public static int getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "Name=" + name + "\tSalary=" + salary;
	}

}
