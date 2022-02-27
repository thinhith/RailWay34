package com.thinh.backend;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.thinh.entity.ChuanHoaChuoi;
import com.thinh.entity.CongNhan;
import com.thinh.entity.GioiTinh;
import com.thinh.entity.KySu;
import com.thinh.entity.NhanVien;
import com.thinh.entity.QLCB;
import com.thinh.entity.ScanUtils;

public class QLCB_Manager {
	public Scanner scanner;
	public ChuanHoaChuoi chuanHoaChuoi;
	public ScanUtils scanUtils;
	private ArrayList<QLCB> qlcb;
	private boolean isXoaCb;
	private String nut;

	public QLCB_Manager() {
		qlcb = new ArrayList<QLCB>();
		scanUtils = new ScanUtils();
		scanner = new Scanner(System.in);
		chuanHoaChuoi = new ChuanHoaChuoi();
	}

	public void chuongTrinh() {
		System.out.println("-----------------CHUONG TRÌNH QUẢN LÝ CÁN BỘ-----------------");
		boolean isMenu = false;
		do {
			System.out.println("Mời chọn chức năng " + "\n" + "1 - Thêm mới cán bộ" + "\n" + "2 - Tìm kiếm cán bộ" + "\n"
					+ "3 - Hiển thị danh sách cán bộ" + "\n" + "4 - Xóa cán bộ" + "\n" + "5-Thoát chương trình");
			byte chucNang = scanner.nextByte();
			switch (chucNang) {
			case 1:
					themCb();
//					nut();
				break;
			case 2:
				timCanBo();
				break;
		case 3:
			hienThi();
			break;
		case 4:
			xoaCanBo();
			break;
		case 5:
			System.out.println("Hẹn gặp lại ");
			return;
			

			default:
				System.out.println("Mời chọn lại chức năng (1-5)");
				isMenu = false;
			}
		} while (isMenu== false);
		
	}

	public void themCb() {
		boolean isCheck = false;
		do {
			System.out.println("Mời chọn danh sách thêm [1 - Thêm Công nhân, 2- Thêm Kỹ Sư, 3- Thêm Nhân viên,4-Thoát]");
			byte themcb = scanner.nextByte();
			switch (themcb) {
			case 1:
				themCongNhan();
				return;
			case 2:
				themKysu();
				return;
			case 3:
				themNhanVien();
				return;
			case 4:
				System.out.println("Bạn đã thoát danh mục thêm cán bộ");
				return;
			default:
				System.out.println("Mời chọn lại (1-3)");
				isCheck = false;
			}
		} while (isCheck==false);
		
	}

	public void themCongNhan() {
		System.out.println("Nhập vào tên Công nhân");
		String name = chuanHoaChuoi.nhapChuoi();
		name = chuanHoaChuoi.chuanHoa();
		System.out.println("Mời nhập tuổi");
		byte tuoi = (byte) themTuoi();
		System.out.println("Mời bạn nhập vào giới tính");
		GioiTinh gioiTinh = chonGioiTinh();
		scanner.nextLine();
		System.out.println("Nhập vào địa chỉ");
//		String diaChi = scanUtils.inputString(); ===== Hỏi Thầy tại sao lại bị báo NullPointCheck
		String diaChi = inputString();
		System.out.println("Mời nhập bậc từ 1 - 10");
		byte bac = checkbac();
//		System.out.println("Bậc : " + bac);
		CongNhan congNhan = new CongNhan(name, tuoi, gioiTinh, diaChi, bac);
		qlcb.add(congNhan);
		System.out.println("Tạo thành công :" + congNhan.toString());
	}

	public void themKysu() {
		System.out.println("Nhập vào tên Kỹ Sư");
		String name = chuanHoaChuoi.nhapChuoi();
		name = chuanHoaChuoi.chuanHoa();
		System.out.println("Mời nhập tuổi");
		byte tuoi = (byte) themTuoi();
		System.out.println("Mời bạn nhập vào giới tính");
		GioiTinh gioiTinh = chonGioiTinh();
		scanner.nextLine();
		System.out.println("Nhập vào địa chỉ");
//		String diaChi = scanUtils.inputString(); ===== Hỏi Thầy tại sao lại bị báo NullPointCheck
		String diaChi = inputString();
		System.out.println("Mời nhập ngành đào tạo");
		String nganh = inputString();
		KySu kySu = new KySu(name, tuoi, gioiTinh, diaChi, nganh);
		qlcb.add(kySu);
		System.out.println("Tạo thành công :" + kySu.toString());
	}

	public void themNhanVien() {
		System.out.println("Nhập vào tên Nhân viên");
		String name = chuanHoaChuoi.nhapChuoi();
		name = chuanHoaChuoi.chuanHoa();
		System.out.println("Mời nhập tuổi");
		byte tuoi = (byte) themTuoi();
		System.out.println("Mời bạn nhập vào giới tính");
		GioiTinh gioiTinh = chonGioiTinh();
		scanner.nextLine();
		System.out.println("Nhập vào địa chỉ");
//	String diaChi = scanUtils.inputString(); ===== Hỏi Thầy tại sao lại bị báo NullPointCheck
		String diaChi = inputString();
		System.out.println("Nhập vào công việc");
		String cviec = inputString();
		NhanVien nhanVien = new NhanVien(name, tuoi, gioiTinh, diaChi, cviec);
		qlcb.add(nhanVien);
		System.out.println("Tạo thành công : " + nhanVien.toString());
	}

	public GioiTinh chonGioiTinh() {
		boolean checkGt = false;
		do {
			System.out.println("Mời chọn STT [1-Nam, 2-Nữ, 3-Khác]");
			byte i = scanner.nextByte();
			switch (i) {
			case 1:
				return GioiTinh.NAM;

			case 2:
				return GioiTinh.NỮ;

			case 3:

				return GioiTinh.KHÁC;
			default:
				System.out.println("Mời chọn lại từ 1 đến 3");
				checkGt = false;
			}
		} while (checkGt == false);

		return null;
	}

	public void timCanBo() {
		boolean i = false;
		do {
			System.out.println("Mời nhập tên cán bộ muốn tìm kiếm");
			String timKiemCb = chuanHoaChuoi.nhapChuoi();
			for (QLCB timKiem : qlcb) {
			
				timKiemCb = chuanHoaChuoi.chuanHoa();
				if (timKiem.getHoTen().contains(timKiemCb)) {
					System.out.println(timKiem.toString());
					return;
				} else {
					System.out.println("Không có cán bộ phù hợp !!! Mời nhập lại");
					i = false;
					break;
				}
			}
		} while (i == false);

	}

	public void hienThi() {
		for (QLCB hienThi : qlcb) {
			System.out.println(hienThi.toString());
		}
	}

	public void xoaCanBo() {
		boolean i = false;
		do {
			System.out.println("Nhập tên cán bộ cần xóa");
			String xoaCB = chuanHoaChuoi.nhapChuoi();
			xoaCB = chuanHoaChuoi.chuanHoa();
//			String xoaCB = scanner.nextLine();
//			 qlcb.removeIf(thinh -> thinh.getHoTen().contains(xoaCB));
//			 System.out.println("Xóa thành công");
//			 for (QLCB qlcb2 : qlcb) {
//				System.out.println(qlcb2);
//			}
//			for(int i2 = 0; i2 <qlcb.size();i2++) {
//				if(qlcb.get(i2).getHoTen().contains(xoaCB)) {
//					System.out.println("Xóa thành công " );
//					i = true ;
//					return;
//				}else {
//					System.out.println("Không tìm thấy cán bộ !! Mời nhập lại");
//					i = false;
//					break;
//				}
//			}
			for (QLCB timCB : qlcb) {
				if (timCB.getHoTen().contains(xoaCB)) {
					qlcb.remove(timCB);
					System.out.println("Xóa thành công" + timCB.toString());
					return;
				} else {
					System.out.println("Không tìm thấy tên cán bộ cần xóa, mời nhập lại");
					i = false;
					break;
				}
			}
		} while (i == false);
////
	}
//	public void nut() {
//		System.out.println("Bạn có muốn tiếp tục chương trình ? [ Điền (y) để tiếp tục, phím bất kỳ để thoát]");
//		scanner.nextLine();
//		String nut = scanner.nextLine();
//	switch (nut) {
//	case "y":
//		
//
//	default:
//		System.out.println("Bạn đã thoát khỏi chương trình thêm cán bộ");
//		return;
//	}
//	}

	public byte themTuoi() {
		boolean checkT = false;
		do {
			byte tuoi = scanner.nextByte();
			if (tuoi <= 10 || tuoi >= 100) {
				System.out.println("Có vẻ đây không phải là tuổi thật của bạn ! Hãy nhập đúng tuổi :");
				checkT = false;
			} else {
				return tuoi;
			}
		} while (checkT == false);

		return (byte) 0;

	}

	public String inputString() {

		String inputString = scanner.nextLine();
		inputString = inputString.trim();
		inputString = inputString.replaceAll("\\s+", " ");

		return inputString;

	}

	public byte checkbac() {
		boolean isBac = false;
		do {
			byte checkbac = scanner.nextByte();
			if (checkbac < 1 || checkbac > 10) {
				System.out.println("Số bạn nhập không phù hợp !!! Mời nhập lại");
				isBac = false;
			} else {
				return checkbac;
			}
		} while (isBac == false);
		return 0;
	}
}
