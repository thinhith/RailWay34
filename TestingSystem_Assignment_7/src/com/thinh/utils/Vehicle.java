package com.thinh.utils;

import java.io.Serializable;

public class Vehicle implements Serializable {







	private static final long serialVersionUID = 4272288230705097751L;
private final String name;
 private String color;
 private final String brand;
 
 public Vehicle(String name, String color, String brand) {
	super();
	this.name = name;
	this.color = color;
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getName() {
	return name;
}
public String getBrand() {
	return brand;
}
@Override
public String toString() {
	return "Vehicle [name=" + name + ", color=" + color + ", brand=" + brand + "]";
}

}
