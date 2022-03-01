package com.thinh.entily3;

import com.thinh.utils.ScannerUtils;

public class HinhTron extends HinhHoc {

	public HinhTron(Float a, Float b) throws Exception {
		super(a, b);
	}

	@Override
	public Float tinhChuVi(Float a, Float b) {

		return 2 * (a * Configs.PI);
	}

	@Override
	public Float tinhDienTich(Float a, Float b) {
		return (float) (Configs.PI * (Math.pow(a, 2)));
	}

	public static void inputChuViHc() throws Exception {
		System.out.println("Tạo hình tròn");
		System.out.println("Nhập số lượng hình muốn tạo");
		HinhChuNhat[] hinhChuNhats = new HinhChuNhat[ScannerUtils.inputInt()];
		for (int i = 0; i < hinhChuNhats.length; i++) {
			System.out.println("Hình tròn " + (i + 1) + ":" + "\n" + "Cạnh a :");
			float a = ScannerUtils.inputFloat();
			HinhTron hinhTron = new HinhTron(a, a);
			System.out.println("Chu vi hình tròn " + (i + 1) + " là : " + hinhTron.tinhChuVi(a, a));
		}
	}

	public static void inputDienTichHc() throws Exception {
		System.out.println("Tạo hình tròn");
		System.out.println("Nhập số lượng hình muốn tạo");
		HinhChuNhat[] hinhChuNhats = new HinhChuNhat[ScannerUtils.inputInt()];
		for (int i = 0; i < hinhChuNhats.length; i++) {
			System.out.println("Hình tròn " + (i + 1) + ":" + "\n" + "Cạnh a :");
			float a = ScannerUtils.inputFloat();
			HinhTron hinhTron = new HinhTron(a, a);
			System.out.println("Diện tích hình tròn " + (i + 1) + " là : " + hinhTron.tinhDienTich(a, a));
		}
	}
}
