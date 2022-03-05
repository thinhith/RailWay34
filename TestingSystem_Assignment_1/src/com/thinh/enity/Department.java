package com.thinh.enity;

public class Department {
	public static byte COUNT = 0;
	public byte iD;
	String name;
	
	public Department() {
		
	}
	
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
