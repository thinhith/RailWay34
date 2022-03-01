package com.thinh.entily3;

public abstract class HinhHoc {
	private float a;
	private float b;
	public static int COUNT = 0;

	// Khởi tạo abstract method
	public abstract Float tinhChuVi(Float a, Float b);

	public abstract Float tinhDienTich(Float a, Float b);

	// Tạo exception cho hinh hoc

	public HinhHoc(Float a, Float b) throws Exception {
		super();
		COUNT++;
		if (COUNT <= Configs.SO_LUONG_HINH_TOI_DA) {
			this.a = a;
			this.b = b;
		} else {
			throw new HHException();
		}
	}

}
