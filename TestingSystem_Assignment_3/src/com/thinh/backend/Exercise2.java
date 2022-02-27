package com.thinh.backend;

import java.time.LocalDate;

import com.thinh.enity.Account;

public class Exercise2 {
public void question1() {
	Account[] accounts = new Account[5];
	for (int i = 0; i < accounts.length; i++) {
		Account account = accounts[i];
		accounts[i] = new Account();
		accounts[i].email = "Email " + (i +1);
		accounts[i].fullName = "Fullname " + (i +1);
		accounts[i].userName = "Username " + (i +1);
		accounts[i].createDate = LocalDate.now();
	}
	for (Account account : accounts) {
		System.out.println((account.COUNT++ +1) + " | " + account.fullName+ " \n " + account.userName + " | " + account.createDate );
	}
}
}
