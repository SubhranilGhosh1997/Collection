package com.monocept.test;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList();
		list.add(5);
		list.add(10);
		list.add(4);
		list.add(2, 7);
		list.addLast(19);
		list.addFirst(101);
//		System.out.println(list);
//		list.remove(4);
//		System.out.println(list);
//		System.out.println(list.getLast());
//		System.out.println(list.getFirst());
//		list.removeFirst();
//		System.out.println(list);
//		list.removeLast();
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
		LinkedList<Integer> newlist=new LinkedList();
		newlist.add(12);
		newlist.add(13);
		newlist.addAll(list);
		System.out.println("New List :"+newlist);
		System.out.println(newlist.size());
		System.out.println(newlist.indexOf(10));

	}

}
