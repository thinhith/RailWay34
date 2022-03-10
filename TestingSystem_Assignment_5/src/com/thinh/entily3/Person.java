package com.thinh.entily3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String name;
	private GioiTinh gioiTinh;
	private LocalDate ngaySinh;
	private String diaChi;
	private Scanner scanner;
	private ChuanHoaChuoi chuanHoaChuoi;

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}



	public void setGioiTinh(GioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}



	public LocalDate getNgaySinh() {
		return ngaySinh;
	}



	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}



	public String getDiaChi() {
		return diaChi;
	}



	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}



	public Person() {
		scanner = new Scanner(System.in);
		chuanHoaChuoi = new ChuanHoaChuoi();
	}



	public void themNg() {
		System.out.println("Mời nhập tên");
		String name = scanner.nextLine();
		System.out.println("Mời chọn giới tính 1-Nam, 2-Nữ, 3-Khác");
		GioiTinh gioiTinh = checkGioiTinh();
		System.out.println("Mời nhập ngày sinh");
		byte day = scanner.nextByte();
		System.out.println("Mời nhập tháng ");
		byte month = scanner.nextByte();
		System.out.println("Mời nhập năm sinh");
		int year = scanner.nextInt();
		LocalDate cover = LocalDate.of(year, month, day);
		scanner.nextLine();
		System.out.println("Mời nhập địa chỉ");
		String diaChi = scanner.nextLine();
		
	}
	

	
	
	public String xemThongTin() {
		return "Person [name=" + name + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi
				+ "]";
	}

	public GioiTinh checkGioiTinh() {
		
		byte gioiTinh;
		boolean isCheck = false;
		do {
			
			gioiTinh = scanner.nextByte();
			switch (gioiTinh) {
			case 1:
				return GioiTinh.NAM;
				
			case 2:
				return GioiTinh.NỮ;
				
			case 3:
				return GioiTinh.KHÁC;

			default:
				System.out.println("Mời nhập lại !!");
				isCheck = false;
			}
		} while (isCheck = false);
		
		return null;
	}
}
