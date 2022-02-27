package com.thinh.fronend;

import com.thinh.entity.Employee;

public class DemoUser {

	public static void main(String[] args) {
Employee employee = new Employee("Thịnh", 15.3);
employee.calculatePay();
System.out.println(employee.displayInfor());
	}

}
