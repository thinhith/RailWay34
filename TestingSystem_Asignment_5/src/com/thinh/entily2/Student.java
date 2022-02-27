package com.thinh.entily2;

import java.util.ArrayList;

public class Student implements IStudent{
	public static int COUNT;
	private int id;
	private String name;
	private int group;
	
	public Student(String name, int group) {
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.group = group;
		
	}
	public void name() {
		
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
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	@Override
	public void diemDanh() {
		System.out.println(name + " điểm danh ");
	}
	@Override
	public void hocBai() {
		System.out.println(name + " học bài ");
	}
	@Override
	public void diDonVeSinh() {
		System.out.println(name + " đi dọn vệ sinh ");
	}
}
