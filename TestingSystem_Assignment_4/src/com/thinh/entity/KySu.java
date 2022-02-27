package com.thinh.entity;

public class KySu extends QLCB {
	private String nganhDaoTao;
	public KySu(String hoTen, byte age, GioiTinh gioiTinh, String diaChi,String nganhDaoTao) {
		super(hoTen, age, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
		this.nganhDaoTao = nganhDaoTao;
	}
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	@Override
	public String toString() {
		return "KySu [nganhDaoTao=" + nganhDaoTao + ", getHoTen()=" + getHoTen() + ", getAge()=" + getAge()
				+ ", getGioiTinh()=" + getGioiTinh() + ", getDiaChi()=" + getDiaChi() + "]";
	}

	
}
