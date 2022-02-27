package com.thinh.entity;

public abstract class Iphone extends Smartphone{

	// TẠO PHƯƠNG THỨC RIÊNG CỦA IPHONE
	// Phương thức riêng này là của riêng class Iphone;
	public void upDatatoICloud() {
		System.out.println("Up to Icloud");
	}
	// NẾU TẠO 1 PHƯƠNG THỨC ABSTRUCT THÌ PHƯƠNG THỨC ĐÓ SẼ BỊ RỖNG
	// Tạo 1 abstruct method sẽ không có {} ở sau và kết thúc bằng dấu ;
	// Mọi hành động bên trong được triển khai ở class kế thừa
	public abstract void unlock();
}
