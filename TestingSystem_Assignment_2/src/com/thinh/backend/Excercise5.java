package com.thinh.backend;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

import com.thinh.entily.Account;
import com.thinh.entily.Department;
import com.thinh.entily.Group;
import com.thinh.entily.Position;
import com.thinh.entily.PositionName;

public class Excercise5 {
	public Scanner scanner;

	public Excercise5() {
		scanner = new Scanner(System.in);
	}

	public void question1() {
		System.out.println("Mời nhập vào số nguyên thứ 1");
		int i = scanner.nextInt();
		System.out.println("Mời nhập vào số nguyên thứ 2");
		int i2 = scanner.nextInt();
		System.out.println("Mời nhập vào số nguyên thứ 3");
		int i3 = scanner.nextInt();
		System.out.println("Các số nguyên đã nhập : " + i + " - " + i2 + " - " + i3);
	}

	public void question2() {
		System.out.println("Mời nhập số thực thứ 1");
		float i = scanner.nextFloat();
		System.out.println("Mời nhập số thực thứ 2");
		float i2 = scanner.nextFloat();
		System.out.println("Các số thực vừa nhập là : " + i + " - " + i2);
	}

	public void question3() {
		System.out.println("Mời nhập họ ");
		String i = scanner.nextLine();
		System.out.println("Mời nhập tên đệm");
		String i2 = scanner.nextLine();
		System.out.println("Mời nhập tên");
		String i3 = scanner.nextLine();
		System.out.println("Tên của bạn là :" + i + " " + i2 + " " + i3);
	}

	public void question4() {
		System.out.println("Mời nhập vào ngày sinh");
		int day = scanner.nextInt();
		System.out.println("Mời nhập vào tháng sinh");
		int month = scanner.nextInt();
		System.out.println("Mời nhập vào năm sinh");
		int year = scanner.nextInt();
		LocalDate birthday = LocalDate.of(year, month, day);
		System.out.println(birthday);
//		String birthday1 = Integer.toString();
//		String pattern = "dd-MM-yyyy";
//		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
//		Date date = (Date) dateFormat.parse(birthday);
	}

	public void question5() {

		System.out.println("Chương trình tạo Account được bắt đầu");
		Account newAccount = new Account();

		newAccount.iD = newAccount.COUNT++;
		System.out.println("Mời nhập Email");
		newAccount.email = scanner.nextLine();
		System.out.println("Mời nhập Usename");
		newAccount.userName = scanner.nextLine();
		System.out.println("Mời nhập vào FullName");
		newAccount.fullName = scanner.nextLine();
		String depName;
		boolean isDep = false;
		do {
			System.out.println("Mời nhập tên phòng ban");
			depName = scanner.nextLine();
			Department[] departments = inputDepartment();
			for (Department department : departments) {
				if (depName.equals(department.name)) {
					newAccount.depId = department;
					isDep = true;
					break;
				}
			}
			if (isDep == false) {
				System.out.println("Mời bạn nhập lại");
			}

		} while (isDep == false);
		String posName;
		boolean isPos = false;
		do {
			System.out.println("Mời bạn nhập chức vụ ");
			posName = scanner.nextLine();
			Position[] positions = inputPosition();
			for (Position position : positions) {
				if (posName.equals(position.name.toString())) {
					newAccount.posId = position;
					isPos = true;
					break;
				}
			}
			if (isPos == false) {
				System.out.println("Mời bạn nhập lại");
			}
		} while (isPos == false);
		newAccount.createDate = LocalDate.now();
		newAccount.groups = null;
		System.out.println(" Tạo thành công " + (newAccount.iD + 1) + " | " + newAccount.email + " | "
				+ newAccount.userName + " | " + newAccount.fullName + " | " + newAccount.depId.name + " | "
				+ newAccount.posId.name + " \n " + newAccount.createDate + " | " + newAccount.groups);
//		Position[] positions = inputPosition();
//		for (Position position : positions) {
//			while(true) {
//				System.out.println("Nhập vào tên chúc vụ");
//				String posName = scanner.nextLine();
//			if (posName.equals(position.name.toString())) {
//				posName = position.name.toString();
//				break;
//			}else {
//				System.out.println("Mời bạn nhập lại");
//			}
//			}
//			break;
//		}
	}

	public void question6() {
		Department newDepartment = new Department();
		newDepartment.iD = Department.COUNT++;
		System.out.println("Mời bạn nhập vào tên phòng ban cần tạo");
		newDepartment.name = scanner.nextLine();
		System.out.println("Phòng ban bạn vừa tạo là :" + newDepartment.COUNT++ + " | " + newDepartment.name);
	}

	public void question7() {
		int i;
		while (true) {
			System.out.println("Mời bạn nhập vào số bất kỳ");
			 i = scanner.nextInt();
			if (i % 2 == 0) {
				System.out.println("Số bạn vừa nhập là :" + i);
				return;
			} else {
				System.out.println("Cần nhập sô chẵn");
			}
		}
	}

	public void question8() {
		byte i;
		while (true) {

			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
			 i = scanner.nextByte();
			scanner.nextLine();
			switch (i) {
			case 1:
				question5();
				break;
			case 2:
				question6();
				break;
			default:
				System.out.println("Mời bạn nhập lại");
				break;
			}
		}

	}
	public void question9() {
		// Tạo Account
		Account account1 = new Account("thinh@gmail.com", "thinhithp", "Nguyễn Quang Thịnh", null, null, LocalDate.now());
		Account account2 = new Account("thinh2@gmail.com", "thinhithp2", "Nguyễn Quang Thịnh 2", null, null, LocalDate.now());
		Account account3 = new Account("thinh@gmail.com", "thinhithp3", "Nguyễn Quang Thịnh3", null, null, LocalDate.now());
		// Tạo Group
		Group group1 = new Group("Group1", account3, null);
		Group group2 = new Group("Group2", account3, null);
		Group group3 = new Group("Group3", account3, null);
		// Tạo mảng Account và Group
		Account[] accounts = {account1,account2,account3};
		Group[] groups = {group1,group2,group3};
		// Nhập vào Group cần thêm vào
		String groupName = scanner.nextLine();
		// Nhập Account cần thêm
		String useName = scanner.nextLine();
		// Tạo 1 biến với index của Group
		int indexG = -1;
		// Khi duyệt mảng với tên truyền vào bên trên, nếu so sánh đúng thì gán
		for (int i = 0; i < groups.length; i++) {
			if(groups[i].name.equals(groupName)) {
				// Chỗ nào là sau khi so sánh giống tên nhập vào thì sẽ gán biến bằng với nó
				indexG = i;
			}
		// Tạo Index cho Account
			int indexAcc =  -1;
			for (int j = 0; j < accounts.length; j++) {
				if(accounts[j].userName.equals(useName)) {
					indexAcc = j;
				}
				
			}
			if(indexAcc<0 || indexG<0) {
				System.out.println("Kiểm tra lại dữ liệu");
			}else {
				for (int j = 0; j < accounts.length; j++) {
					if(accounts[j].userName.equals(useName)) {
						Group[] groupAdd = {groups[indexG]};
						accounts[j].groups = groupAdd;
						System.out.println("Add thành công group" + accounts[indexAcc].groups[0].name + "Cho Account" + accounts[indexAcc].userName);
					}
					
				}
			}
			
		}
		
	}

	public static Department[] inputDepartment() {

		Department department1 = new Department("PB1");
		Department department2 = new Department("PB2");
		Department department3 = new Department("PB3");
		Department[] departments = { department1, department2, department3 };
		return departments;
	}

	public static Position[] inputPosition() {
		Position position1 = new Position(PositionName.DEV);
		Position position2 = new Position(PositionName.PM);
		Position position3 = new Position(PositionName.SCRUM_MASTER);
		Position[] positions = { position1, position2, position3 };
		return positions;
	}
}
