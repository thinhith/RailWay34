package com.thinh.entity;

public class Waiter extends User {

	public Waiter(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return salaryRatio * 220;
	}
	// Ở ĐÂY KẾ THỪA TẤT CẢ CÁC PHƯƠNG THỨC CỦA CLASS USER
@Override
public String displayInfor() {
	return super.displayInfor();
}
}
