package com.thinh.entily;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.thinh.utils.ScannerUtils;

public class Student  {
	public static int COUNT;
	private int id;
	private String name;
	public static String college;
	public static int moneyGroup ;
//	public static ArrayList<moneyGroup> moneyGroups = new ArrayList<moneyGroup>();
	public static ArrayList<Student> studentsarray = new ArrayList<Student>();
	public static Scanner scanner = new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public Student() {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
//		this.college = inputCollege();
		this.college = college;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name =" + name + "  Collage : " + college +"]";
	}
	public Student(int moneyGroup) {
		super();
	
		this.moneyGroup = moneyGroup;
		
	}

	
		
	public static String inputCollege() {
	 return college = ScannerUtils.inputString();
	}
	
//	public String printnopTien() {
//		return "Student [id=" + id + ", name =" + name + "  Tiền : " + moneyGroup +"]";
//	}
	
	


}
