package com.collection.practice;

public class ComparableDemo implements Comparable {
	int rollno;
	String name;
	int age;
	public ComparableDemo(int rollno, String name, int age) {
		
		// TODO Auto-generated constructor stub
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		ComparableDemo cd = (ComparableDemo) obj;
		if (age==cd.age) 
			return 0;
		else if (age>cd.age) 
			return 1;
		else 
			return-1;
		}
			
	}

