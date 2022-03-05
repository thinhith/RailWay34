package com.thinh.entily;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
	private Scanner scanner;
	private ChuanHoaChuoi chuanHoaChuoi;
	private ArrayList<ThiSinh> list;

	public TuyenSinh() {
		scanner = new Scanner(System.in);
		chuanHoaChuoi = new ChuanHoaChuoi();
		list = new ArrayList<ThiSinh>();
	}

	public void menu() {
		System.out.println("-------------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN-------------");
		System.out.println("Mời chọn chức năng");
		byte chucNang;
		boolean isCheck = false;
		do {

			System.out.println(" 1 - Thêm thí sinh \n 2 - hiển thị danh sách \n 3 - Tìm kiếm thí sinh \n 4 - Thoát");
			chucNang = scanner.nextByte();
			scanner.nextLine();
			switch (chucNang) {
			case 1:
				themThiSinh();
				break;
			case 2:
				hienThi();
				break;
			case 3:
				timKiem();
				break;
			case 4:
				return;
			default:
				System.out.println("Mời nhập đúng (1-4)!!!");
				isCheck = false;
			}
		} while (isCheck == false);

	}

	@Override
	public void themThiSinh() {
		System.out.println("Mời nhập Số báo danh của thí sinh");
		String sbd = scanner.nextLine();
		System.out.println("Nhập tên của thí sinh");
		String name = chuanHoaChuoi.nhapChuoi();
		name = chuanHoaChuoi.chuanHoa();
		System.out.println("Mời nhập vào địa chỉ");
		String diaChi = scanner.nextLine();
		System.out.println("Mời nhập vào mức ưu tiên");
		byte mucUuTien = scanner.nextByte();
		System.out.println("Nhập vào khối thi (A-B-C)");
		String khoiThi = scanner.next().toUpperCase();
		ThiSinh thiSinh = new ThiSinh(sbd, name, diaChi, mucUuTien, new KhoiThi(khoiThi));
		list.add(thiSinh);
		System.out.println("Thêm thành công");
	}

	@Override
	public void hienThi() {
		for (ThiSinh thiSinh : list) {
			System.out.println("Thí sinh :" + thiSinh.toString());
		}
	}

	@Override
	public void timKiem() {
		ThiSinh timKiemsbd;
		ArrayList<ThiSinh> thiSinh;
		System.out.println("Nhập vào số báo danh cần tìm kiếm");
		String sbd = scanner.nextLine();
		thiSinh = timKiemThiSinh(sbd);
		if (thiSinh.size() == 0) {
			System.out.println("Danh mục trống");
		} else {
			for (ThiSinh thiSinh2 : thiSinh) {
				System.out.println(thiSinh2.toString());
			}
		}

	}

	private ArrayList<ThiSinh> timKiemThiSinh(String Sbd) {
		ArrayList<ThiSinh> timKiemThiSinh = new ArrayList<ThiSinh>();
		Sbd = Sbd.trim();
		for (ThiSinh thiSinh : list) {
			if (thiSinh.getSbd().trim().contains(Sbd)) {
				timKiemThiSinh.add(thiSinh);
			}
		}
		return timKiemThiSinh;
	}

}
