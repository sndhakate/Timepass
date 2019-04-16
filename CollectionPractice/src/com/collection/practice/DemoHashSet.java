package com.collection.practice;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {
	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<>();
		hs.add("120");
		hs.add("CPP");
		hs.add("PHP");
		hs.add("Rahul");
		hs.add("CPP");
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		System.out.println("----------Iterate using itarator----------");
		
		Iterator<Object> itr = hs.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			String str = (String)  o;
			System.out.println(str);
		}
		
		System.out.println("----------Using for loop----------");
		
		for (Object object : hs) {
			System.out.println(object);
		}
		
	}

}
