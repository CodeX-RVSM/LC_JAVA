package com.linkcode.collectionframework;

import java.util.HashMap;


public class HashMap1 {
	
	public static void main(String[] arr) {
//		key value
//		student name marks 
//		1.hetergenous - generics
//		2.key cannot be duplicate values can be duplicate
//		3.does not follows insertion order
//		4.does not consist index values
//		5.key and values can be null
		
		HashMap<String,Double> map=new HashMap<String,Double>();
		System.out.println(map);
		map.put("rahul",89.99);
		map.put("mahesh",82.99);
//		map.put(37,87);
		map.put("rushi",84.99);
		map.put("Raj",89.99);
		map.put(null, null);
		
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.containsValue("Raj"));
		System.out.println(map.get("rushi"));
		System.out.println(map.containsValue(89.99));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		
//		iterating hashmap
//		2.enhance for loop
		for(String key:map.keySet()) {//[rahul,mahesh,rushi,raj
			System.out.println(key+ " :"+map.get(key));
		}
		
//		3.for each loop
		map.forEach((key,val) -> System.out.println(key+ " :"+val));
		
//		4.iterable - entrySet
		
		
	}

}
