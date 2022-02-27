package com.thinh.entity;

public class CongNhan extends QLCB {
	private byte bac;
	public CongNhan(String hoTen, byte age, GioiTinh gioiTinh, String diaChi,byte bac) {
		super(hoTen, age, gioiTinh, diaChi);
		this.bac = bac;
	}
	public byte getBac() {
		return bac;
	}
	public void setBac(byte bac) {
		this.bac = bac;
	}
	@Override
	public String toString() {
		return "CongNhan [bac=" + bac + ", getHoTen()=" + getHoTen() + ", getAge()=" + getAge() + ", getGioiTinh()="
				+ getGioiTinh() + ", getDiaChi()=" + getDiaChi() + "]";
	}
	
}
