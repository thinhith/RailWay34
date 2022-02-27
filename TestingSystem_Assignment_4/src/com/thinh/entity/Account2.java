package com.thinh.entity;

public class Account2 {
	public static int COUNT = 0;
	private int iD;
	private String name;
	private int balance;
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int credit(int amount) {
		return this.balance +=amount;
		
	}
	public int dedit(int amount) {
		return this.balance +=amount;
		
	}
	public Account2(String name, int balance) {
		super();
		COUNT++;
		this.iD = COUNT;
		this.name = name;
		this.balance = balance;
	}
	
	
}
