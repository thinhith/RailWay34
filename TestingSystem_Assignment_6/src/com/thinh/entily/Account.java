package com.thinh.entily;

import java.time.LocalDate;
import java.util.Scanner;

import com.thinh.backend.ChuanHoaChuoi;
import com.thinh.backend.InvalidAgeInputingException;
import com.thinh.utils.ScannerUtils;

public class Account {
	public static int COUNT = 0;
	public int iD;
	public String email;
	public String userName;
	public String fullName;
	public Department depId;
	public Position posId;
	public LocalDate createDate;
	public Group[] groups;

	@Override
	public String toString() {
		return "Account [iD=" + iD + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName + "\n"
				+ ", depId=" + depId + ", posId=" + posId + ", createDate=" + createDate + "]";
	}

	public Account(String email, String userName, String fullName, Department depId, Position posId,
			LocalDate createDate) {
		super();
		COUNT++;
		this.iD = COUNT;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.depId = depId;
		this.posId = posId;
		this.createDate = createDate;
	}

	public Account() {
		super();
		COUNT++;
		this.iD = COUNT;
		System.out.println("Mời nhập Email");
		this.email = ScannerUtils.inputEmail();
		System.out.println("Mời nhập UserName");
		this.userName = ScannerUtils.inputString();
		System.out.println("Mời nhập FullName");
		this.fullName = ChuanHoaChuoi.nhapChuoi();
		fullName = ChuanHoaChuoi.chuanHoa();
		System.out.println("Mời nhập Phòng ban");
		this.depId = depId;
		System.out.println("Mời nhập Chức vụ");
		this.posId = posId;
		System.out.println("Mời nhập Ngày tháng");
		this.createDate = ScannerUtils.inputLocalDate();
	}

	public static int inputAge() throws InvalidAgeInputingException {
		int input;

		while (true) {
			try {
				input = ScannerUtils.inputInt();

				if (input <= 0) {
					throw new InvalidAgeInputingException("The age must be greater than 0, please input again");
				} else if (input < 18) {
					System.out.println("Your age must be greatern than 18, input again");
					continue;

				}
				return input;

			} catch (Exception e) {
				System.out.println("Tuổi bạn nhập không đúng ! mời nhập lại");
			}

		}

	}
}
