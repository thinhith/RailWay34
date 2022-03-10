package com.thinh.entily5;

public abstract class DienThoaiDiDong implements ITanCong {
	
	public void nghe() {
		System.out.println("nghe");
	}
	public void goi() {
		System.out.println("Gọi");
	}
	public void guiTinNhan() {
		System.out.println("Gửi tin nhắn");
	}
	public void nhanTinNhan() {
		System.out.println("Nhận tin nhắn");
	}
}
