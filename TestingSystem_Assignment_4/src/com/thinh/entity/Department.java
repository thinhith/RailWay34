package com.thinh.entity;

public class Department {
	public static byte COUNT = 0;
	byte iD;
	String name;
	public Department(String name) {
		super();
		COUNT++;
		this.iD = COUNT;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [iD=" + iD + ", name=" + name + "]";
	}
	
}
