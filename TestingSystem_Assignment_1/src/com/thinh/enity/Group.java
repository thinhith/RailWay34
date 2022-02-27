package com.thinh.enity;

import java.time.LocalDate;

public class Group {
	public static int COUNT = 0;
	public int id;
	public String name;
	public Account creatorId;
	public LocalDate joinDate;
	public Account[] accounts;

	public Group(String name, Account creatorId, LocalDate joinDate) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.creatorId = creatorId;
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creatorId=" + creatorId + ", joinDate=" + joinDate + "]";
	}

}
