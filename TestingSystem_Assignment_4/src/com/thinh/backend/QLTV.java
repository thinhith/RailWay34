package com.thinh.backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.thinh.entity.Bao;
import com.thinh.entity.ChuanHoaChuoi;
import com.thinh.entity.Sach;
import com.thinh.entity.TapChi;
import com.thinh.entity.ThuVien;

public class QLTV {
	public Scanner scanner;
	public ChuanHoaChuoi chuanHoaChuoi;
	public ArrayList<ThuVien> thuVien;

	public QLTV() {
		scanner = new Scanner(System.in);
		chuanHoaChuoi = new ChuanHoaChuoi();
		thuVien = new ArrayList<ThuVien>();
	}

	public void chuongTrinh() {
		System.out.println("-----------------CHUONG TRÌNH QUẢN LÝ THƯ VIỆN-----------------");
		boolean isMenu = false;
		do {
			System.out.println("Mời chọn chức năng " + "\n" + "1 - Thêm mới tài liệu" + "\n" + "2 - Xóa tài liệu" + "\n"
					+ "3 - Hiển thị danh sách tài liệu" + "\n" + "4 - Tìm kiếm tài liệu" + "\n"
					+ "5-Thoát chương trình");
			byte chucNang = scanner.nextByte();
			scanner.nextLine();
			switch (chucNang) {
			case 1:
				themTaiLieu();
				break;
			case 2:
				xoaTaiLieu();
				break;
			case 3:
				hienThiTaiLieu();
				break;
			case 4:
				timTaiLieu();
				break;
			case 5:
				System.out.println("Hẹn gặp lại ");
				return;

			default:
				System.out.println("Mời chọn lại chức năng (1-5)");
				isMenu = false;
			}
		} while (isMenu == false);

	}

	public void themTaiLieu() {
		boolean isCheck = false;
		do {
			System.out.println("Mời chọn danh sách thêm [1 - Thêm Sách, 2- Thêm Tạp Chí, 3- Thêm Báo ,4-Thoát]");
			byte themTl = scanner.nextByte();
			scanner.nextLine();
			switch (themTl) {
			case 1:
				themSach();
				return;
			case 2:
				themTapChi();
				return;
			case 3:
				themBao();
				return;
			case 4:
				System.out.println("Bạn đã thoát danh mục thêm tài liệu");
				return;
			default:
				System.out.println("Mời chọn lại (1-4)");
				isCheck = false;
			}
		} while (isCheck == false);

	}

	public void themSach() {
//		boolean isCheck = false;
		String maTL = null;
		boolean isCheck = false;
		do {
			
			System.out.println("Mời nhập mã tài liệu");
			 maTL = scanner.nextLine();
			for (ThuVien vien : thuVien) {
				if (vien.getMaTaiLieu().contains(maTL)) {
					System.out.println("Mã tài liệu đã tồn tại !!! Vui lòng nhập lại");
					isCheck = true;
				
				}else {
					isCheck = false ;
					continue;
				}
			}

		} while (isCheck);

//		System.out.println("Mời nhập Mã tài liệu");
//		String maTL = kiemtra();
		System.out.println("Mời nhập nhà xuất bản");
		String nxb = scanner.nextLine();
		System.out.println("Mời nhập Số bản phát hành");
		int sbph = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Mời nhập tên tác giả");
		String tacGia = scanner.nextLine();
		System.out.println("Nhập số trang của Sách")	;
		int soTrang = scanner.nextInt();
		Sach sach = new Sach(maTL, nxb, sbph, tacGia, soTrang);
		thuVien.add(sach);
		System.out.println("Thêm thành công Sách" + sach.toString());
	}

	public void themTapChi() {
		String maTL = null;
		boolean isCheck = false;
		do {
			
			System.out.println("Mời nhập mã tài liệu");
			 maTL = scanner.nextLine();
			for (ThuVien vien : thuVien) {
				if (vien.getMaTaiLieu().contains(maTL)) {
					System.out.println("Mã tài liệu đã tồn tại !!! Vui lòng nhập lại");
					isCheck = true;
				
				}else {
					isCheck = false ;
					continue;
				}
			}

		} while (isCheck);
//		System.out.println("Mời nhập Mã tài liệu");
//		String maTL = kiemtra();
		System.out.println("Mời nhập nhà xuất bản");
		String nxb = scanner.nextLine();
		System.out.println("Mời nhập Số bản phát hành");
		int sbph = scanner.nextInt();
		System.out.println("Mời nhập số phát hành");
		int sph = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhập tháng phát hành");
		byte tph = scanner.nextByte();
		System.out.println("Nhập năm phát hành");
		int nph = scanner.nextInt();
		System.out.println("Nhập ngày phát hành");
		byte dph = scanner.nextByte();
		LocalDate datecover = LocalDate.of(nph, tph, dph);

		TapChi tapChi = new TapChi(maTL, nxb, sph, sph, datecover);
		thuVien.add(tapChi);
		System.out.println("Thêm thành công Tạp chí : \n" + tapChi.toString());
	}

	public void themBao() {
		String maTL = null;
		boolean isCheck = false;
		do {
			
			System.out.println("Mời nhập mã tài liệu");
			 maTL = scanner.nextLine();
			for (ThuVien vien : thuVien) {
				if (vien.getMaTaiLieu().contains(maTL)) {
					System.out.println("Mã tài liệu đã tồn tại !!! Vui lòng nhập lại");
					isCheck = true;
				
				}else {
					isCheck = false ;
					continue;
				}
			}

		} while (isCheck);
//		System.out.println("Mời nhập Mã tài liệu");
//		String maTL = kiemtra();
		System.out.println("Mời nhập nhà xuất bản");
		String nxb = scanner.nextLine();
		System.out.println("Mời nhập Số bản phát hành");
		int sbph = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhập tháng phát hành");
		byte tph = scanner.nextByte();
		System.out.println("Nhập năm phát hành");
		int nph = scanner.nextInt();
		System.out.println("Nhập ngày phát hành");
		byte dph = scanner.nextByte();
		LocalDate datecover = LocalDate.of(nph, tph, dph);
		Bao bao = new Bao(maTL, nxb, nph, datecover);
		thuVien.add(bao);
		System.out.println("Tạo thành công :" + bao.toString());
	}

	public void xoaTaiLieu() {
		boolean ischeck = false;
		do {
			System.out.println("Nhập vào mã tài liệu cần xóa");
			String maTL = scanner.nextLine();
			for (ThuVien timMa : thuVien) {
				if (timMa.getMaTaiLieu().equals(maTL)) {
					thuVien.remove(timMa);
					System.out.println("Xóa thành công : " + timMa.toString());
					return;
				} else {
					System.err.println("Không tìm thấy tài liệu phù hợp !! Mời nhập lại");
					ischeck = false;
				}
			}
		} while (ischeck == false);

	}

	public void hienThiTaiLieu() {
		for (ThuVien hienThi : thuVien) {
			System.out.println(hienThi.toString());
		}
	}

	public void timTaiLieu() {
		boolean checkTL = false;
		do {
			System.out.println("Mời chọn loại tài liệu muốn tìm kiếm : \n"
					+ " 1-Sách \n 2-Tạp chí \n 3-Báo \n 4-Thoát tìm tài liệu");
			byte timKiem = scanner.nextByte();
			scanner.nextLine();
			switch (timKiem) {
			case 1:
				timSach();
				return;
			case 2:
				timTapChi();
				return;
			case 3:
				timBao();
				return;
			case 4:
				System.out.println("Bạn đã thoát chương trình tìm kiếm tài liệu");
				return;

			default:
				System.out.println("Mời nhập lại !!! (1-4)");
				checkTL = false;
			}
		} while (checkTL == false);

	}

	public void timBao() {
		/*
		 * Ở đây mình mặc định là mỗi loại tài liệu đều có 1 mã riêng, VD như tài liệu
		 * báo thì sẽ là chuỗi (B....(ở đây B là viết tắt của từ báo)) Do đó đỗi với mỗi
		 * loại tìm được chia nhỏ ra với dạng tìm kiếm theo SWITCH CASE
		 */
		boolean check1 = false;
		do {
			System.out.println("Mời nhập vào Mã tài liệu Báo muốn tìm kiếm");
			String timBao = scanner.nextLine();
			for (ThuVien timBao2 : thuVien) {
				if (timBao2.getMaTaiLieu().contains(timBao)) {
					System.out.println("Tài liệu : \n " + timBao2.toString());
					return;

				} else {
					System.err.println("Không tìm thấy mã tài liệu !!! Mời nhập lại");
					check1 = false;
					break;
				}

			}
		} while (check1 == false);

	}

	public void timTapChi() {
		boolean check2 = false;
		do {
			System.out.println("Mời nhập vào Mã tài liệu tạp chí muốn tìm kiếm");
			String timTL = scanner.nextLine();
			for (ThuVien timTL2 : thuVien) {
				if (timTL2.getMaTaiLieu().contains(timTL)) {
					System.out.println("Tài liệu : \n " + timTL2.toString());
					return;
				} else {
					System.err.println("Không tìm thấy mã tài liệu !!! Mời nhập lại");
					check2 = false;
					break;
				}

			}
		} while (check2 == false);

	}

	public void timSach() {
		boolean check3 = false;
		do {
			System.out.println("Mời nhập vào Mã tài liệu Sách muốn tìm kiếm");
			String timSach = scanner.nextLine();
			for (ThuVien timSach2 : thuVien) {
				if (timSach2.getMaTaiLieu().contains(timSach)) {
					System.out.println("Tài liệu : \n " + timSach2.toString());
					return;
				} else {
					System.err.println("Không tìm thấy mã tài liệu !!! Mời nhập lại");
					check3 = false;
					break;
				}

			}
		} while (check3 == false);
	}

//	public String kiemtra() {
//		boolean isCheck = false;
//		do {
//			System.out.println("Mời nhập mã tài liệu");
//			String maTaiLieu = scanner.nextLine();
//			for (ThuVien vien : thuVien) {
//				if (vien.getMaTaiLieu().equals(maTaiLieu)) {
//					System.out.println("Mã tài liệu đã tồn tại !!! Vui lòng nhập lại");
//					isCheck = false;
//				} else {
//					return maTaiLieu;
//				}
//			}
//			return maTaiLieu;
//		} while (isCheck == false);
//
//	}
}
