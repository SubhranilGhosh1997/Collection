package com.monocept.test;

import java.util.*;

public class Deque {
	public static void main(String[] args) {
		ArrayDeque<String> dq = new ArrayDeque<String>();  
		   dq.add("Ravi");    
		   dq.add("Sraj");     
		   dq.add("Avi");    
		   dq.addFirst("Subhranil");    
		   dq.addLast("Kajol");   
		   System.out.println("All elements");
		   for (String str : dq) 
			   System.out.println(str);  
		   System.out.println("First Element :"+dq.getFirst());
		   System.out.println("Last Element :"+dq.getLast());
		   System.out.println(dq.poll());
		   System.out.println("After poll :"+dq);
		   dq.push("Ramesh");
		   System.out.println("After push"+dq);
		   dq.remove("Kajol");
		   System.out.println(dq);
		   System.out.println("Length :"+dq.size());
		   System.out.println(dq.pop());
		   System.out.println(dq);
	}
}
