package com.thinh.entily4;

public class HinhChuNhat {
	float a;
	float b;

	public HinhChuNhat(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}

	public float tinhChuVi() {
		return (a+b)*2;
	}
	public float tinhDienTich() {
		return a*b;
	}
}
