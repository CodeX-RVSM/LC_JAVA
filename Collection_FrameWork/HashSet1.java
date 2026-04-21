package com.linkcode.collectionframework;

import java.util.HashSet;


public class HashSet1 {

	public static void main(String[] args) {
//		1.heterogenous
//		2.does not follws insertion order
//		3.it does not allows duplicate values
//		4.it does not index values
		
		HashSet set=new HashSet();
		set.add(10);
		set.add(true);
		set.add("Hello");
		set.add(10);
		System.out.println(set);
		System.out.println(set.isEmpty());
//		System.out.println(set.get(3));
		
		
	}
}
