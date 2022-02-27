package com.thinh.entily;

public class Department {
	public static byte COUNT = 0;
	public byte iD;
	public String name;
	public Department(String name) {
		super();
		COUNT++;
		this.iD = COUNT;
		this.name = name;
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [iD=" + iD + ", name=" + name + "]";
	}
	
}
