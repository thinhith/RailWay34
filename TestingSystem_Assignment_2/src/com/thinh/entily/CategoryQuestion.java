package com.thinh.entily;

public class CategoryQuestion {
public static byte COUNT = 0;
byte id;
ECategoryQuestion categoryName;
public CategoryQuestion(ECategoryQuestion categoryName) {
	super();
	COUNT++;
	this.id = COUNT;
	this.categoryName = categoryName;
}
@Override
public String toString() {
	return "CategoryQuestion [id=" + id + ", categoryName=" + categoryName + "]";
}



}
