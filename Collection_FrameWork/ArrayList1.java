package com.linkcode.collectionframework;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		
//		1.heterogenous
//		2.allows duplicate
//		3.follows insertion order
//		4.it consist index values
//		homoe -generics<Integer>
		
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
//		obj.add("Hello");
//		obj.add(true);
		obj.add(20);
//		obj.add(false);
		obj.add(1,90);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.get(1));
		System.out.println(obj.contains(10));
		ArrayList obj1=new ArrayList();
		obj1.add(20);
		obj1.addAll(obj1);
			
		obj1.add(obj);
		System.out.println(obj1);
		System.out.println(obj1.getFirst());
		System.out.println(obj1.getLast());
		System.out.println(obj1.equals(obj1));
		System.out.println(obj1.indexOf("hello"));
		obj1.remove(2);
		obj1.remove("hello");
		System.out.println(obj1);
		System.out.println(obj1.get(1));
		obj1.removeAll(obj);
		obj1.retainAll(obj);
		System.out.println(obj1);
		System.out.println(obj);
		
		
		
//		iterating methods 
//		1. normal for loop
		System.out.println("1. normal for loop");
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		
//		2.Advance For Loop
		System.out.println("2.Advance For Loop");
		for(Integer a:obj) {
			System.out.println(a);
		}
		
//		3.for each Looop
//		functinal programming 
		System.out.println("3.for each Looop");
		obj.forEach(val->System.out.println(val));
		
//		4.Advanced Way (print)
		System.out.println("4.Advanced Way ");
		obj.forEach(System.out::println);
		
	}

}
