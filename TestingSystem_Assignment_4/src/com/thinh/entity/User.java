package com.thinh.entity;

public abstract class User {
	private String name;
	double salaryRatio;

	
// Tạo phạm vi truy cập để ngăn chặn người dùng tìm kiếm, tránh mâu thuẫn nội bộ.
	protected void name() {
		
	}
	
	public User(String name, double salaryRatio) {
		super();
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	public abstract double calculatePay();
	
	public String displayInfor() {
		return "User [name=" + name + ", salaryRatio=" + salaryRatio + "]" + " Lương chi trả :" + calculatePay();
	}
	
	
}
