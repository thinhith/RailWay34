package com.thinh.entity;

import java.time.LocalDate;

public class Group {
public static int COUNT = 0;
public int id;
public String name;
public Account creatorId;
public LocalDate joinDate;
public Account[] accounts;
public String[] userName;
public Group() {
}
public Group( String name, Account creatorId,String[] userName, LocalDate joinDate) {
	super();
	COUNT++;
	 this.id = COUNT;
	this.name = name;
	this.creatorId = creatorId;
	
	Account[] accounts = new Account[userName.length];
	for (int i = 0; i < accounts.length; i++) {
		accounts[i] = new Account(userName[i]);
		
	}
	this.joinDate = joinDate;
}

public Group(String name, Account creatorId, LocalDate joinDate, Account[] accounts) {
	super();
	this.name = name;
	this.creatorId = creatorId;
	this.joinDate = joinDate;
	this.accounts = accounts;
}

public Group(int id, String name, Account creatorId, LocalDate joinDate, Account[] accounts) {
	super();
	this.name = name;
	this.creatorId = creatorId;
	this.joinDate = joinDate;
	this.accounts = accounts;
}
@Override
public String toString() {
	return "Group [id=" + id + ", name=" + name + ", creatorId=" + creatorId + ", joinDate=" + joinDate + "]";
}



}
