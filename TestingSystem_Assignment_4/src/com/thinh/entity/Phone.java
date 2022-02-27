package com.thinh.entity;

public abstract class Phone {
	 private String id;
	 private String name;
	 private String hangsx;
	 private Contacts[] contacts;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHangsx() {
		return hangsx;
	}
	public void setHangsx(String hangsx) {
		this.hangsx = hangsx;
	}
	public Contacts[] getContacts() {
		return contacts;
	}
	public void setContacts(Contacts[] contacts) {
		this.contacts = contacts;
	}
	 
	 public Phone() {
		 
	 }
	public Phone(String id, String name, String hangsx, Contacts[] contacts) {
		super();
		this.id = id;
		this.name = name;
		this.hangsx = hangsx;
		this.contacts = contacts;
	}
	 
	
}
