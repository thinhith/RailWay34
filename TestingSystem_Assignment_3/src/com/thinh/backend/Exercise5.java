package com.thinh.backend;

import java.util.Iterator;
import java.util.Scanner;

import com.thinh.enity.Department;

public class Exercise5 {
	static Scanner scanner = new Scanner(System.in);

	public static void question1() {
		Department[] departments = inputDepartment();
		System.out.println("Nhập vào số bạn muốn lấy thông tin");
		int i = scanner.nextInt();
		for (Department department : departments) {
			// Ở đây là duyệt mảng và departments[0] là vị trí từ 0 được đếm trong mảng
			System.out.println(departments[i].toString());
			return;
		}
	}

	public static void question2() {
		Department[] departments = inputDepartment();
		for (Department department : departments) {
			// Ở đây là duyệt mảng và departments[0] là vị trí từ 0 được đếm trong mảng
			System.out.println(department.toString());
		}
	}

	public static void question3() {
		Department[] departments = inputDepartment();
		for (Department department : departments) {
			// Ở đây là duyệt mảng và departments[0] là vị trí từ 0 được đếm trong mảng
			System.out.println(departments[0].hashCode());
			return;
		}
	}

	public static void question4() {
		Department[] departments = inputDepartment();
		for (Department department : departments) {
			// Ở đây là duyệt mảng và departments[0] là vị trí từ 0 được đếm trong mảng
			if (departments[0].name.equals("Phòng A")) {
				System.out.println("YES");
			} else {
				System.out.println("No");
			}
			return;
		}
	}

	public static void question5() {
		Department[] departments = inputDepartment();
		for (Department department : departments) {
			if (departments[0].name.equals(departments[1].name)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			return;
		}
	}

	public static void question6() {
		String[] department = { "Accounting", "Marketing", "Sale", "Boss of diretor", "Waiting Room" };
		for (int i = 0; i < 3; ++i) {
			for (int j = i + 1; j < 4; ++j) {
				if (department[i].compareTo(department[j]) > 0) {
					String temp = department[i];
					department[i] = department[j];
					department[j] = temp;
				}

			}
		}
		System.out.println("Sau khi được sắp xếp");
		for (int i = 0; i < 4; i++) {
			System.out.println(department[i]);
		}
	}

	public static Department[] inputDepartment() {

		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
		return departments;
	}
}
