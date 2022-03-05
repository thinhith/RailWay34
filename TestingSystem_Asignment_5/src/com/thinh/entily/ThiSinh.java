package com.thinh.entily;

public class ThiSinh {
	public static int COUNT;
	private int id;
	private String sbd;
	private String name;
	private String diaChi;
	private byte mucUuTien;
	private KhoiThi khoiThi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSbd() {
		return sbd;
	}

	public void setSbd(String sbd) {
		this.sbd = sbd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public byte getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(byte mucUuTien) {
		this.mucUuTien = mucUuTien;
	}

	public ThiSinh(String sbd, String name, String diaChi, byte mucUuTien, KhoiThi khoiThi) {
		super();
		COUNT++;
		this.id = COUNT;
		this.sbd = sbd;
		this.name = name;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoiThi = khoiThi;
	}

	@Override
	public String toString() {
		return "ThiSinh [id=" + id + ", sbd=" + sbd + ", name=" + name + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + ", khoiThi=" + khoiThi.getBoMon() + "]";
	}

}
