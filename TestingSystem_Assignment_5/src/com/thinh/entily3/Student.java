package com.thinh.entily3;

import java.util.Scanner;

public class Student extends Person {
	private String MaSinhVien;
	private float diemTB;
	private String email;
	private Scanner scanner;

	public Student() {
		scanner = new Scanner(System.in);
	}

	public String getMaSinhVien() {
		return MaSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		MaSinhVien = maSinhVien;
	}

	public double getDiemTB() {
		return diemTB;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void themNg() {
		super.themNg();
		System.out.println("Mã sinh viên");
		this.MaSinhVien = scanner.nextLine();
		System.out.println("Mời nhập điểm");
		this.diemTB = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Mời nhập email");
		String email = scanner.nextLine();
	}
	@Override
	public String xemThongTin() {
		return super.xemThongTin() + "Mã sinh viên :" + MaSinhVien 
				+ " Điểm Trung bình :" + diemTB  + "Email :" + email;
	}
	public boolean checkDiemTB() {

		return diemTB > 8.0 ? true : false;
	}
	public void kiemtraThongTin() {
		Student student = new Student();
		student.themNg();
		System.out.println("Thông tin người vừa nhập");
		System.out.println(student.xemThongTin());
		if(student.checkDiemTB()) {
			System.out.println("Người này đạt được học bổng");
		}else {
			System.out.println("Người này không nhận được học bổng");
		}
		
	}
}
