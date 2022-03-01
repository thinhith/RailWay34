package com.thinh.entily;

import java.util.Scanner;

import com.thinh.utils.ScannerUtils;

public class Department {
	public static byte COUNT;
	private byte id;
	private String name;

	public Department() {
		super();
		COUNT++;
		this.id = COUNT;
		System.out.println("Mời nhập tên phòng ban");
		this.name = ScannerUtils.inputString();
	}

	public Department(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
