package com.thinh.entity;

public class Contacts {
private String number;
private String name;

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Contacts(String number, String name) {
	super();
	this.number = number;
	this.name = name;
}
@Override
public String toString() {
	return "Contacts [number=" + number + ", name=" + name + "]";
}
public Contacts() {
	
}

}
