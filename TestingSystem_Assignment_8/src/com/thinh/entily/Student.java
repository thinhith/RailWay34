package com.thinh.entily;

public class Student implements Comparable<Student> {
	public static int COUNT = 0;
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public Student(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName());
		// TODO Auto-generated method stub

	}
	
	
}
