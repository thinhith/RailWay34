package com.thinh.entity;

public class NhanVien extends QLCB {
	private String congViec;
	public NhanVien(String hoTen, byte age, GioiTinh gioiTinh, String diaChi,String congViec) {
		super(hoTen, age, gioiTinh, diaChi);
		this.congViec = congViec;
	}
	public String getCongViec() {
		return congViec;
	}
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	@Override
	public String toString() {
		return "NhanVien [congViec=" + congViec + ", getHoTen()=" + getHoTen() + ", getAge()=" + getAge()
				+ ", getGioiTinh()=" + getGioiTinh() + ", getDiaChi()=" + getDiaChi() + "]";
	}

}
