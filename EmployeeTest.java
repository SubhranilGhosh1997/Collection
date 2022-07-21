package com.monocept.test;

import java.util.HashMap;
import java.util.Map;

import com.momocept.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1=new Employee("Modi", 10000.00);
		Employee emp2=new Employee("Ravi",20000.00);
		Employee emp3=new Employee("Kamla",30000.00);
		Employee emp4=new Employee("Joe",40000.00);
		Employee emp5=new Employee("Putin",50000.00);
		Employee emp6=new Employee("Xi Zingping",15000.00);
		Map <String,Employee> employees=new HashMap<>();
		employees.put(emp1.getEid(),emp1);
		employees.put(emp2.getEid(),emp2);
		employees.put(emp3.getEid(),emp3);
		employees.put(emp4.getEid(),emp4);
		employees.put(emp5.getEid(),emp5);
		employees.put(emp6.getEid(),emp6);
		for (Map.Entry<String, Employee> e:employees.entrySet())
		{
			System.out.println("ID(key) : "+e.getKey()+"\n\nDetails(Value) : "+e.getValue());
			System.out.println("________________________________________________________________\n");
		}
		

	}

}
