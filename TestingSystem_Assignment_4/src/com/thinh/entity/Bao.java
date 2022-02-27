package com.thinh.entity;

import java.time.LocalDate;

public class Bao extends ThuVien {
private LocalDate ngayPhatHanh;

	public LocalDate getNgayPhatHanh() {
	return ngayPhatHanh;
}

public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
	this.ngayPhatHanh = ngayPhatHanh;
}

	public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh,LocalDate ngayPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return "Bao [getId()=" + getId() + ", getMaTaiLieu()=" + getMaTaiLieu() + ", getNhaXuatBan()=" + getNhaXuatBan()
				+ ", getSoBanPhatHanh()=" + getSoBanPhatHanh() + ", ngayPhatHanh=" + ngayPhatHanh + "]";
	}

}
