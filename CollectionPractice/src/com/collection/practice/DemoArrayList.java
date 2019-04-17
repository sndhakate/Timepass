package com.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class DemoArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add("C#");
		al.add("C++");
		al.add("JAVA");
		al.add("PHP");
		al.add("PYTHON");
		al.add("RUBI");
		al.add("PERL");
		
		System.out.println(al.size());
		System.out.println(al);
		
		
		
		
		al.remove(1); //remove by indexing
		System.out.println(al);
		
		System.out.println(al.indexOf("JAVA"));
		
//		al.clone();
//		System.out.println(al);
		
		
//		System.out.println("--------iterate using for loop------");
//		
//		for (Object object : al) {
//			System.out.println(object);			
//		}
//		
//		System.out.println("---------iterate using iterator---------");
//		
//		Iterator<Object> itr = al.iterator();
//		while(itr.hasNext()) {
//			Object o = itr.next();
//			String s = (String) o;
//			System.out.println(s);
//		}
//		
		System.out.println("--------------iterate using ListIterator");
		
		ListIterator<Object> it = al.listIterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Object o =  obj;
			System.out.println(o);
			}		
//		
//		System.out.println("Element at index 1 :" +al.get(1));
//		System.out.println("Does list contains RUBI :" + al.contains("RUBI"));
//		System.out.println("Is arraylist is empty:" + al.isEmpty());
//		System.out.println("index of PYTHON is :"+ al.indexOf("PYTHON"));
//		System.out.println("----------------------------------------------------");
//		
//		List<Object> list = new ArrayList<>();
//		list.add("SQL");
//		list.add("SELENIUM");
		
//		al.addAll(list);
		
		System.out.println(al);
		
//		al.clear();
//		System.out.println(al);
		
//		String[] ar = new String[al.size()];
//		al.toArray(ar);
//		
//		System.out.println("Created Array contains :");
//		for (String string : ar) {
//			System.out.println(string);
//		}
//		
//		System.out.println(ar.length);
		
		
		
		System.out.println("-------------------------------------------------------");
		
		List<Object>li = al.subList(2, 4);
		System.out.println(li);
		
		System.out.println(al);
		
//		System.out.println(al.get(6));
		
		System.out.println("-------using listIterator hasPrevious-------");		
		
		while (it.hasPrevious()) {
			Object object = (Object) it.previous();
			String st = (String) object;
			System.out.println(st);
			
			
		}		
		
		
	}		
		
}


