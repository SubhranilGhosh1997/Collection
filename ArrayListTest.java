package com.monocept.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.monocept.model.Student;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 1; i <= 10; i++)
			arrayList.add(i);
		System.out.println(arrayList);
		arrayList.add(55);
		arrayList.add(21);
		arrayList.add(2, 13);
		System.out.println("Size: "+arrayList.size());
		arrayList.remove(5);
		System.out.println(arrayList);
		System.out.println("Before Sort :"+arrayList);
		Collections.sort(arrayList);
		System.out.println("After Sort : "+arrayList);
		System.out.println(arrayList.contains(5));
		System.out.println(arrayList.contains(55));

		Collection list=new ArrayList();
		
		list.add(5);
		list.add(7);
		list.add("Subhranil");
		
		System.out.println(list);
		Student s1=new Student(1, "Ravi", 101);
		Student s2=new Student(2, "Suresh",102);
		Student s3=s1;
		Student s4=new Student(3, "kajal",103);
		Student s5=new Student(4,"Manoj",104);
		List<Student> list1=new ArrayList<>();
		
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		
		System.out.println(list1);
		
		Set<Student> set1=new HashSet<>();
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		set1.add(s5);
		
		System.out.println(set1);
		
		Set<Integer> set_2=new HashSet<>();
		set_2.add(20);
		set_2.add(10);
		set_2.add(30);
		set_2.add(12);
		Set<Integer> set_3=new HashSet<>();
		set_3.add(15);
		set_3.add(25);
		set_3.add(35);
		set_3.add(20);		
		set_3.add(12);
		Set<Integer> unionSet = new HashSet<>(set_2);
		unionSet.addAll(set_3);
		Set<Integer> intersectionSet = new HashSet<>(set_2);
		intersectionSet.retainAll(set_3);
		System.out.println("1st Set : "+set_2);
		System.out.println("2nd Set : "+set_3);
		System.out.println("Union Set :"+unionSet);
		System.out.println("Intersection : "+intersectionSet);
		
	}
}
