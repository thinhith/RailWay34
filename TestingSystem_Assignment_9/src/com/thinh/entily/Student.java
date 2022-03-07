package com.thinh.entily;

import java.io.ByteArrayOutputStream;

public class Student {
	private static int COUNT = 0;
	private int id;
	private String name;
	/**
	 *@deprecated replaced by {@link #getIdV2(id)}}
	 */
	@Deprecated
	// @Deprecated là khai báo phiên bản này đã cũ
	public int getId() {
		return id;
	}
	public String getIdV2() {
		return "MSV : " + id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Student( String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
