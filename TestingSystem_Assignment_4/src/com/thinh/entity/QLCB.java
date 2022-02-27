package com.thinh.entity;

public class QLCB {
	public static int COUNT;
	private int id;
	private String hoTen;
	private byte age;
	private GioiTinh gioiTinh;
	private String diaChi;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(GioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public QLCB(String hoTen, byte age, GioiTinh gioiTinh, String diaChi) {
		super();
		COUNT++;
		this.id = COUNT;
		this.hoTen = hoTen;
		this.age = age;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "QLCB [id=" + id + ", hoTen=" + hoTen + ", age=" + age + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi
				+ "]";
	}

}
