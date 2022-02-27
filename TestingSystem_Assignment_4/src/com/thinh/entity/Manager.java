package com.thinh.entity;

public class Manager extends User {

	public Manager(String name, double salaryRatio) {
		super(name, salaryRatio);
		// TODO Auto-generated constructor stub
	}
	// Ở ĐÂY KẾ THỪA TẤT CẢ CÁC PHƯƠNG THỨC CỦA CLASS USER
	@Override
	public double calculatePay() {
		return salaryRatio * 520;
	}

}
