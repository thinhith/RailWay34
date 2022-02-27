package com.thinh.enity;

import java.time.LocalDate;

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
		// TODO Auto-generated constructor stub
	}

}
