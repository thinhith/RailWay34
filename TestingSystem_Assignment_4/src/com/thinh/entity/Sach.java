package com.thinh.entity;

public class Sach extends ThuVien {
	private String tenTacgia;
	private int soTrang;
	
	
	public String getTenTacgia() {
		return tenTacgia;
	}


	public void setTenTacgia(String tenTacgia) {
		this.tenTacgia = tenTacgia;
	}


	public int getSoTrang() {
		return soTrang;
	}


	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}


	public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh,String tenTacgia,int soTrang) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.soTrang = soTrang;
		this.tenTacgia = tenTacgia;
	}


	@Override
	public String toString() {
		return "Sach [getId()=" + getId() + ", getMaTaiLieu()=" + getMaTaiLieu() + ", getNhaXuatBan()="
				+ getNhaXuatBan() + ", getSoBanPhatHanh()=" + getSoBanPhatHanh() + ", tenTacgia=" + tenTacgia
				+ ", soTrang=" + soTrang + "]";
	}

}
