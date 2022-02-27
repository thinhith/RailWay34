package com.thinh.backend;

import java.util.Scanner;

import com.thinh.entily4.HinhVuong;

public class HinhHoc_Manager {
	private Scanner scanner;
	private HinhVuong hv;

	public HinhHoc_Manager() {
		scanner = new Scanner(System.in);
	}

	public void menu() {
		System.out.println("------Công Thức hình học------");
		System.out.println("Nhập vào chức năng muốn sử dụng");
		boolean isCheck = false;
		do {
			System.out.println("1-Tạo cạnh | 2-Tính chu vi | 3-Tính diện tích | 4-Thoát ");
			byte chucNang = scanner.nextByte();
			switch (chucNang) {
			case 1:
				System.out.println("Tạo cạnh hình");
				Float a = scanner.nextFloat();
				hv = new HinhVuong(a);
				System.out.println("Tạo thành công hình vuông có cạnh là  " + a);
				break;
			case 2:
				System.out.println("Chu vi hình vuông là :" + hv.tinhChuVi());
				
				break;
			case 3:
				System.out.println("Diện tích hình vuông là " + hv.tinhDienTich());
				break;
			case 4:
				return;

			default:
				System.out.println("Mời bạn chọn đúng chức năng cần sử dụng");
				isCheck = false;
			}
		
		} while (isCheck==false);
		
}
}
