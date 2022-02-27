package com.thinh.entity;

import java.time.LocalDate;

public class TapChi extends ThuVien {
	private int soPhatHanh;
	private LocalDate thangPhatHanh;
	
	
	public int getSoPhatHanh() {
		return soPhatHanh;
	}


	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}


	public LocalDate getThangPhatHanh() {
		return thangPhatHanh;
	}


	public void setThangPhatHanh(LocalDate thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}


	public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh,int soPhatHanh,LocalDate thangPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}


	@Override
	public String toString() {
		return "TapChi [getId()=" + getId() + ", getMaTaiLieu()=" + getMaTaiLieu() + ", getNhaXuatBan()="
				+ getNhaXuatBan() + ", getSoBanPhatHanh()=" + getSoBanPhatHanh() + ", soPhatHanh=" + soPhatHanh
				+ ", thangPhatHanh=" + thangPhatHanh + "]";
	}

}
