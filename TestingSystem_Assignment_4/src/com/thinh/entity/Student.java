package com.thinh.entity;

import java.util.Scanner;

public class Student {
	public static int COUNT = 0;
	private int id;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String hometown;
	private double point;
	public Scanner scanner = new Scanner(System.in);

	public Student(String name, String hometown) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.hometown = hometown;
		this.point = 0;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void setPoint(double point) {
	
		this.point = point;
	}
	
	public double getPoint() {
		return point;
	}

	public double addPoint(double point2) {
		
		point += point2;
		return  point;
	}

public String toString() {
//	this.name = name;
//	this.point = point;
	String diem = null;
	if(point <4.0) {
		 diem = "Yếu";
	}else if (point < 6.0) {
		 diem = "TB";
	}else if(point<8.0) {
		 diem = "khá";
	}else {
		 diem = "giỏi";
	}
	System.out.println();
return "ID :" + COUNT +  "Tên SV :" + name +" Điểm :"+point+  " Xếp loại : " + diem;
}


	
	
}
