package com.thinh.entity;

public abstract class Person {
	public static int COUNT;
	private int id;
	private String name;
	public Person(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
