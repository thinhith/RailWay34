package com.thinh.entily3;

import com.thinh.utils.ScannerUtils;

public class HinhChuNhat extends HinhHoc {

	public HinhChuNhat(Float a, Float b) throws Exception {
		super(a, b);
	}

	@Override
	public Float tinhChuVi(Float a, Float b) {
		return 2*(a+b);
	}

	@Override
	public Float tinhDienTich(Float a, Float b) {
		return (float) (a * b);
	}

	public static void inputChuViHc() throws Exception {
		System.out.println("Tạo hình chữ nhật");
		System.out.println("Nhập số lượng hình muốn tạo");
		HinhChuNhat[] hinhChuNhats = new HinhChuNhat[ScannerUtils.inputInt()];
		for (int i = 0; i < hinhChuNhats.length; i++) {
			System.out.println("Hình chữ nhật " + (i+1) + ":" + "\n" + "Cạnh a :");
			float a = ScannerUtils.inputFloat();
			System.out.println("Cạnh b :");
			float b = ScannerUtils.inputFloat();
			HinhChuNhat hinhChuNhat = new HinhChuNhat(a,b);
			hinhChuNhats[i]=hinhChuNhat;
			System.out.println("Chu vi hình chữ nhật " + (i+1) + " là : " +hinhChuNhat.tinhChuVi(a, b));
			
			
			
		}
	}
	public static void inputDienTichHcb() throws Exception {
		System.out.println("Tạo hình chữ nhật");
		System.out.println("Nhập số lượng hình muốn tạo");
		HinhChuNhat[] hinhChuNhats = new HinhChuNhat[ScannerUtils.inputInt()];
		for (int i = 0; i < hinhChuNhats.length; i++) {
			System.out.println("Hình chữ nhật " + (i+1) + ":" + "\n" + "Cạnh a :");
			float a = ScannerUtils.inputFloat();
			System.out.println("Cạnh b :");
			float b = ScannerUtils.inputFloat();
			HinhChuNhat hinhChuNhat = new HinhChuNhat(a,b);
			hinhChuNhats[i]=hinhChuNhat;
			System.out.println("Diện tích hình chữ nhật " + (i+1) + " là : " +hinhChuNhat.tinhDienTich(a, b));
			
			
			
		}
	}
}
