package com.thinh.entily;

import java.time.LocalDate;

public class StudentOfEx2 implements Comparable<StudentOfEx2> {
	public static int COUNT = 0;
	private int id;
	private String name;
	private LocalDate birthDay;
	private float diem;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public StudentOfEx2(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}

	public StudentOfEx2(String name, float diem) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + " Điểm Thi = " + diem + "]";
	}

	public int compareTo(StudentOfEx2 o) {

		this.name.compareTo(o.getName());
		if (o.diem > diem) {
			return 1; // ?
		} else if (o.diem < diem) {
			return -1; // ?
		}
		return 0;

	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

}
