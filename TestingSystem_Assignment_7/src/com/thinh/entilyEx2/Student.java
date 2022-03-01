package com.thinh.entilyEx2;

import com.thinh.utils.ScannerUtils;

public class Student {
	public static int COUNT;
	private final int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
		System.out.println("Nhập ID");
		this.id = ScannerUtils.inputInt();
		System.out.println("Nhập Tên");
		this.name = ScannerUtils.inputString();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// Phương thức khởi tạo Student

	public static void addStudent() {
		System.out.println("Tạo Student");
		System.out.println("Nhập vào ID");
		int id = ScannerUtils.inputInt();
		System.out.println("Nhập vào tên");
		String name = ScannerUtils.inputString();
		Student student = new Student(id, name);
		System.out.println("Thông tin sinh viên vừa tạo");
		System.out.println(student);
	}

	public static String study() {

		return "Đang học bài";
	}
}
