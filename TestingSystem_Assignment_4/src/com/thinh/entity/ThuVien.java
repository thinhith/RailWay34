package com.thinh.entity;

public class ThuVien {
	public static int COUNT;
	private int id;
	private String maTaiLieu;
	private String nhaXuatBan;
	private int soBanPhatHanh;
	
	
	public int getId() {
		return id;
	}
	public String getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public ThuVien(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
		super();
		COUNT++;
		this.id = COUNT;
		this.maTaiLieu = maTaiLieu;
		this.nhaXuatBan = nhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	@Override
	public String toString() {
		return "ThuVien [id=" + id + ", maTaiLieu=" + maTaiLieu + ", nhaXuatBan=" + nhaXuatBan + ", soBanPhatHanh="
				+ soBanPhatHanh + "]";
	}

}
