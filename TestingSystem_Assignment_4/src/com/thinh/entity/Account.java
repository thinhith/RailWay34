package com.thinh.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Account {
	public static int COUNT = 0;
	public int iD;
	public String email;
	public String userName;
	public String fullName;
	public Department depId;
	public PositionName posId;
	public LocalDate createDate;
	public Group[] groups;
	public Scanner scanner = new Scanner(System.in);
	
	
	// Constructor không tham số
	public Account() {
	}

	public Account(String email, String userName, String firstName, String lastName) {
		super();
		COUNT++;
		this.iD = COUNT;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;

	}

	public Account(String userName) {
		super();
		this.userName = userName;

	}

	public Account(String email, String userName, String fullName, Department depId, LocalDate createDate) {
		super();
		COUNT++;
		this.iD = COUNT;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.depId = depId;
		this.posId = inputPos(); // Cái này phải hỏi thầy

		this.createDate = createDate;
	}

	public PositionName inputPos() {

		int i2 = 0;
		do {

			System.out.println("Mời nhập vào số 1-4 (1-DEV,2-PM,3-Scum Master, 4-Test)");
			byte i = scanner.nextByte();
			switch (i) {
			case 0:
				return null;
			case 1:
				return PositionName.DEV;
			case 2:
				return PositionName.PM;
			case 3:
				return PositionName.SCRUM_MASTER;
			case 4:
				return PositionName.TEST;
			default:
				System.out.println("Mời bạn nhập lại");
			}
		} while (i2 < 4);

		return null;

	}

	@Override
	public String toString() {
		return "Account [iD=" + iD + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName + "\n"
				+ ", depId=" + depId + ", posId=" + posId + ", createDate=" + createDate + "]";
	}

}
