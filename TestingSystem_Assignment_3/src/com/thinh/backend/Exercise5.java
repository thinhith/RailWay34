package com.thinh.backend;

import java.util.Iterator;
import java.util.Scanner;

import com.thinh.enity.Account;
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

	public static void question7() {
		Department dep1 = new Department("Accounting");
		Department dep2 = new Department("Marketing");
		Department dep3 = new Department("Sale");
		Department dep4 = new Department("Boss of diretor");
		Department dep5 = new Department("Waiting Room");
		Department[] departments = { dep1, dep2, dep3, dep4, dep5 };
		// Đầu tiên phải kiểm tra chuỗi đó có bao nhiêu khoảng trắng
		// trường hợp Chuỗi không có khoảng trắng nào thì làm như thế nào.
		for (int i = 0; i < departments.length; i++) {
			// Đảo ngược tất cả các từ bằng hàm reverseWords của Java
			String daoNguocChuoi = daoNguocChuoi(departments[i].name);
			for (int j = 0; j < departments.length - 1; j++) {
				String daoNGuoc2 = daoNguocChuoi(departments[j].name);
				if (daoNguocChuoi.compareToIgnoreCase(daoNGuoc2) < 0) {

					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}

		}
		for (Department department : departments) {
			System.out.println(department);
		}
	}



	public static void question8() {
		Account acc1 = new Account("Trần Văn A");
		Account acc2 = new Account("Trần Hưng Fạo");
		Account acc3 = new Account("Trần Văn Bam");
		Account acc4 = new Account("Nguyễn Văn Woàn");
		Account[] accounts = { acc1, acc2, acc3, acc4 };
		
		for (int i = 0; i < accounts.length; i++) {
			// Đảo ngược tất cả các từ bằng hàm reverseWords của Java
			String daoNguocChuoi = daoNguocChuoi(accounts[i].fullName);
			for (int j = 0; j < accounts.length - 1; j++) {
				String daoNGuoc2 = daoNguocChuoi(accounts[j].fullName);
				if (daoNguocChuoi.compareToIgnoreCase(daoNGuoc2) < 0) {

					Account temp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = temp;
				}
			}

		}
		for (Account account : accounts) {
			System.out.println(account.fullName);
		}
	}


	private static String daoNguocChuoi(String name) {
		name = name.trim();
		name = name.replaceAll("\\s+", " ");
		String[] word = name.split(" ");
		name = "";
		for (int i = word.length - 1; i >= 0; i--) {
			name += word[i] + " ";

		}

		return name.substring(0, name.length() - 2);
	}


	public static Department[] inputDepartment() {

		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
		return departments;
	}
}
