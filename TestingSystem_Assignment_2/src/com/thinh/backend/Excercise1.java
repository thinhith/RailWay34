package com.thinh.backend;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;

import com.thinh.entily.Account;
import com.thinh.entily.Department;
import com.thinh.entily.Group;
import com.thinh.entily.Position;
import com.thinh.entily.PositionName;

public class Excercise1 {

	public void question1() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//		System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//		System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//		System.out.println(account1);
		if (account2.depId == null) {
			System.out.println("Acc này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của Acc " + account2.iD + " là :" + account2.depId.name);
		}
	}

	public void question2() {
		System.out.println("QUESTION-2 : Kiểm tra account 2");
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//		System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//		System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//		System.out.println(account1);

		// Táº O GROUP
		Group group1 = new Group("GR1", account2, LocalDate.now());
		Group group2 = new Group("GR2", account3, LocalDate.now());
		Group group3 = new Group("GR3", account1, LocalDate.now());
//		System.out.println(group1);

		// Táº O GROUPACCOUNT
		Account[] accountOfGroup1 = { account2, account3 };
		Account[] accountOfGroup2 = { account1, account2, account3 };
		Account[] accountOfGroup3 = { account2, account3, account1 };

		group1.accounts = accountOfGroup1;
		group2.accounts = accountOfGroup2;
		group3.accounts = accountOfGroup3;
		Group[] groupOfAccount1 = { group2, group3 };
		Group[] groupOfAccount2 = { group1, group3 };
		Group[] groupOfAccount3 = { group2, group3 };
		account1.groups = groupOfAccount1;
		account2.groups = groupOfAccount2;
		account3.groups = groupOfAccount3;

		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có Group");
		} else if (account2.groups.length <= 2) {
			System.out.println("Group của nhân viên \r\n" + "này là Java Fresher, C# Fresher");
		} else if (account2.groups.length >= 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện");
		}
	}

	public void question3() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//	System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//	System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//	System.out.println(account1);
		System.out.println(account2.depId == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là " + account2.depId.name);
	}

	public void question4() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//		System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//		System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position1,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//		System.out.println(account1);
		System.out.println(account1.posId.name.equals(PositionName.DEV) ? "Người này là Developer"
				: "Người này không phải Developer");
	}

	public void question5() {
		System.out.println("QUESTION-5 : Kiểm tra group 1");
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//		System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//		System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//		System.out.println(account1);

		// Táº O GROUP
		Group group1 = new Group("GR1", account2, LocalDate.now());
		Group group2 = new Group("GR2", account3, LocalDate.now());
		Group group3 = new Group("GR3", account1, LocalDate.now());
//		System.out.println(group1);

		// Táº O GROUPACCOUNT
		Account[] accountOfGroup1 = { account2, account3 };
		Account[] accountOfGroup2 = { account1, account2, account3 };
		Account[] accountOfGroup3 = { account2, account3, account1 };

		group1.accounts = accountOfGroup1;
		group2.accounts = accountOfGroup2;
		group3.accounts = accountOfGroup3;
		Group[] groupOfAccount1 = { group2, group3 };
		Group[] groupOfAccount2 = { group1, group3 };
		Group[] groupOfAccount3 = { group2, group3 };
		account1.groups = groupOfAccount1;
		account2.groups = groupOfAccount2;
		account3.groups = groupOfAccount3;

		switch (group1.accounts.length) {
		case 1:
			System.out.println("Nhóm này có 1 thành viên");
			break;
		case 2:
			System.out.println("Nhón này có 2 thành viên");
			break;
		case 3:
			System.out.println("Nhóm này có 3 thành viên");
		default:
			System.out.println("Nhóm này có nhiều thành viên");
			break;
		}

	}

	public void question6() {
		System.out.println("SWITCH CASE CHO QUES-2");
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//			System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//			System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//			System.out.println(account1);

		// Táº O GROUP
		Group group1 = new Group("GR1", account2, LocalDate.now());
		Group group2 = new Group("GR2", account3, LocalDate.now());
		Group group3 = new Group("GR3", account1, LocalDate.now());
//			System.out.println(group1);

		// Táº O GROUPACCOUNT
		Account[] accountOfGroup1 = { account2, account3 };
		Account[] accountOfGroup2 = { account1, account2, account3 };
		Account[] accountOfGroup3 = { account2, account3, account1 };

		group1.accounts = accountOfGroup1;
		group2.accounts = accountOfGroup2;
		group3.accounts = accountOfGroup3;
		Group[] groupOfAccount1 = { group2, group3 };
		Group[] groupOfAccount2 = { group1, group3 };
		Group[] groupOfAccount3 = { group2, group3 };
		account1.groups = groupOfAccount1;
		account2.groups = groupOfAccount2;
		account3.groups = groupOfAccount3;
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có Group");
		} else {
			switch (account2.groups.length) {
			case 1:
				System.out.println("\"Group của nhân viên \r\n" + "này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("\"Group của nhân viên \r\n" + "này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			default:
				System.out.println("Nhân viên này là người nhiều chuyện, tham gia nhiều group");
				break;
			}
		}

	}

	public void question7() {
		System.out.println("Question 7 : Kiểm tra account 1");
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//				System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//				System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position1,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//				System.out.println(account1);
		switch (account1.posId.name) {
		case DEV:
			System.out.println("Đây là 1 Developer");
			break;
		default:
			System.out.println("Đây không phải là Developer");
			break;
		}
	}

	public void question8() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//					System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//					System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position1,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//					System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		for (Account account : accounts) {
			System.out.println(" Thông tin acc thứ " + account.iD + " là :" + "\n" + "Email :" + account.email + "\n"
					+ "Full name : " + account.fullName + "\n" + "Phòng ban :" + account.depId.name);

		}
	}

	public void question9() {
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
		for (Department department : departments) {
			System.out.println("Số thứ tự phòng ban :" + department.iD + "\n" + "Tên phòng ban : " + department.name);
		}
	}

	public void question10() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//		System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//		System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position1,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//		System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(" Thông tin acc thứ " + (i + 1) + " là :" + "\n" + "Email :" + accounts[i].email + "\n"
					+ "Full name : " + accounts[i].fullName + "\n" + "Phòng ban :" + accounts[i].depId.name);
		}
	}

	public void question11() {
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
		for (int i = 0; i < departments.length; i++) {
			System.out.println("Số thứ tự phòng ban :" + (i + 1) + "\n" + "Tên phòng ban : " + departments[i].name);
		}
	}

	public void question12() {
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
		for (int i = 0; i < 2; i++) {
			System.out.println("Số thứ tự phòng ban :" + (i + 1) + "\n" + "Tên phòng ban : " + departments[i].name);

		}
	}

	public void question13() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//				System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//				System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//				System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		for (int i = 0; i < accounts.length; i++) {
			if (i != 1) {
				System.out.println(" Thông tin acc thứ " + (i + 1) + " là :" + "\n" + "Email :" + accounts[i].email
						+ "\n" + "Full name : " + accounts[i].fullName + "\n" + "Phòng ban :" + accounts[i].depId.name);
			}

		}
	}

	public void question14() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//		System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//		System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//		System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		for (int i = 0; i < accounts.length; i++) {
			if (accounts.length < 4) {
				System.out.println(" Thông tin acc thứ " + (i + 1) + " là :" + "\n" + "Email :" + accounts[i].email
						+ "\n" + "Full name : " + accounts[i].fullName + "\n" + "Phòng ban :" + accounts[i].depId.name);
			}

		}
	}

	public void question15() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 1) {
				System.out.println(i);
			}
		}
	}

	public void question161() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//		System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//		System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position1,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//		System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		int i = 0;
		while (i < accounts.length) {
			System.out.println(" Thông tin acc thứ " + (i + 1) + " là :" + "\n" + "Email :" + accounts[i].email + "\n"
					+ "Full name : " + accounts[i].fullName + "\n" + "Phòng ban :" + accounts[i].depId.name);
			i++;

		}
	}

	public void question162() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
//			System.out.println(department1);
		int i = 0;
		while (i < departments.length) {
			System.out.println("Số thứ tự phòng ban :" + (i + 1) + "\n" + "Tên phòng ban : " + departments[i].name);
			i++;
		}
	}

	public void question163() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
//					System.out.println(department1);
		int i = 0;
		while (i < 2) {
			System.out.println("Số thứ tự phòng ban :" + (i + 1) + "\n" + "Tên phòng ban : " + departments[i].name);
			i++;
		}
	}

	public void question164() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//						System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//						System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//						System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		int i = 0;
		while (i < accounts.length) {
			if (i != 1) {
				System.out.println(" Thông tin acc thứ " + (i + 1) + " là :" + "\n" + "Email :" + accounts[i].email
						+ "\n" + "Full name : " + accounts[i].fullName + "\n" + "Phòng ban :" + accounts[i].depId.name);
			}
			i++;
		}

	}

	public void question165() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//							System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//							System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//							System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		int i = 0;
		while (i < accounts.length) {
			if (i < 4) {
				System.out.println(" Thông tin acc thứ " + (i + 1) + " là :" + "\n" + "Email :" + accounts[i].email
						+ "\n" + "Full name : " + accounts[i].fullName + "\n" + "Phòng ban :" + accounts[i].depId.name);
			}
			i++;
		}

	}

	public void question166() {
		int i = 0;
		while (i <= 20) {
			if (i % 2 != 1) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void question171() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//		System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//		System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position1,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//		System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		int i = 0;
		do {
			System.out.println(" Thông tin acc thứ " + (i + 1) + " là :" + "\n" + "Email :" + accounts[i].email + "\n"
					+ "Full name : " + accounts[i].fullName + "\n" + "Phòng ban :" + accounts[i].depId.name);
			i++;
		} while (i < accounts.length);
	}

	public void question172() {
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
		int i = 0;
		do {
			System.out.println("Số thứ tự phòng ban :" + (i + 1) + "\n" + "Tên phòng ban : " + departments[i].name);
			i++;
		} while (i < departments.length);
	}

	public void question173() {
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
		int i = 0;
		do {
			System.out.println("Số thứ tự phòng ban :" + (i + 1) + "\n" + "Tên phòng ban : " + departments[i].name);
			i++;
		} while (i <= 1);
	}

	public void question174() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//					System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//					System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//					System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		int i = 0;
		do {
			if (i != 1) {
				System.out.println(" Thông tin acc thứ " + (i + 1) + " là :" + "\n" + "Email :" + accounts[i].email
						+ "\n" + "Full name : " + accounts[i].fullName + "\n" + "Phòng ban :" + accounts[i].depId.name);
			}
			i++;
		} while (i < accounts.length);
	}

	public void question175() {
		// Táº O DEPARTMENT
		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
//								System.out.println(department1);

		// Táº O POSITION
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
//								System.out.println(position3);

		// Táº O ACCOUNT
		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
				LocalDate.now());
		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
				LocalDate.now());
		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
				LocalDate.now());
//								System.out.println(account1);
		Account[] accounts = { account1, account2, account3 };
		int i = 0;
		do {
			if (i < 4) {
				System.out.println(" Thông tin acc thứ " + (i + 1) + " là :" + "\n" + "Email :" + accounts[i].email
						+ "\n" + "Full name : " + accounts[i].fullName + "\n" + "Phòng ban :" + accounts[i].depId.name);
			}
			i++;
		} while (i < accounts.length);
	}

	public void question176() {
		int i = 0;
		do {
			if (i % 2 != 1) {
				System.out.println(i);
			}
			i++;
		} while (i <= 20);
	}
// public static Account inputAcc() {
////  Táº O DEPARTMENT
//		Department department1 = new Department("PB1");
//		Department department2 = new Department("PB2");
//		Department department3 = new Department("PB3");
//
//// Táº O POSITION
//		Position position1 = new Position(PositionName.DEV);
//		Position position2 = new Position(PositionName.PM);
//		Position position3 = new Position(PositionName.SCRUM_MASTER);
//
//// Táº O ACCOUNT
//		Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2,
//				LocalDate.now());
//		Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1,
//				LocalDate.now());
//		Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3,
//				LocalDate.now());
//		System.out.println("Nhập vào số 1,2,3 ");
//		Scanner scanner = new Scanner(System.in);
//		int i = scanner.nextInt();
//		Account acin = null;
//		Account[] accounts = { account1, account2, account3 };
//		switch (i) {
//		case 1:
//			acin = account1;
//			break;
//		case 2:
//			acin = account2;
//			break;
//		case 3:
//			acin = account3;
//			break;
//		}
//		return acin;
//
//	}
//public static void inputgr() {
////  Táº O DEPARTMENT
//	Department department1 = new Department("PB1");
//	Department department2 = new Department("PB2");
//	Department department3 = new Department("PB3");
////	System.out.println(department1);
//	
//// Táº O POSITION
//	Position position1 = new Position(PositionName.DEV);
//	Position position2 = new Position(PositionName.PM);
//	Position position3 = new Position(PositionName.SCRUM_MASTER);
////	System.out.println(position3);
//	
//// Táº O ACCOUNT
//	Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2, LocalDate.now());
//	Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1, LocalDate.now());
//	Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3, LocalDate.now());
////	System.out.println(account1);
//	
//// Táº O GROUP
//	Group group1 = new Group("GR1", account2, LocalDate.now());
//	Group group2 = new Group("GR2", account3, LocalDate.now());
//	Group group3 = new Group("GR3", account1, LocalDate.now());
////	System.out.println(group1);
//	
//// Táº O GROUPACCOUNT
//	Account[] accountOfGroup1 = {account2,account3};
//	Account[] accountOfGroup2 = {account1,account2,account3};
//	Account[] accountOfGroup3 = {account2,account3,account1};
//	group1.accounts = accountOfGroup1;
//	group2.accounts = accountOfGroup2;
//	group3.accounts = accountOfGroup3;
//	Group[] groupOfAccount1 = {group2,group3};
//	Group[] groupOfAccount2 = {group1,group3};
//	Group[] groupOfAccount3 = {group2,group3};
//	account1.groups = groupOfAccount1 ;
//	account2.groups = groupOfAccount2 ;
//	account3.groups = groupOfAccount3 ;
//}
}
