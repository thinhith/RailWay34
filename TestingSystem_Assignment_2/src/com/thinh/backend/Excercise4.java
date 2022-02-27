package com.thinh.backend;

import java.time.LocalDate;
import java.util.Random;

public class Excercise4 {

	public Random random = new Random();

	public void question1() {

		int i = random.nextInt();
		System.out.println(i);
	}

	public void question2() {
		float i = random.nextFloat();
		System.out.println(i);
	}

	public void question3() {
		String[] students = { "Họ tên số 1", "Họ tên số 3", "Họ tên số 2", "Họ tên số 4", "Họ tên số 5" };
		int i = random.nextInt(students.length);
		System.out.println("Tên ngẫu nhiên là :" + students[i]);
	}
	public void question4() {
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDate = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDate);
	}
	public void question5() {
		int maxDay = (int) LocalDate.of(2022, 1, 18).toEpochDay();
		long randomInd = maxDay - random.nextInt(365);
		LocalDate randomDate = LocalDate.ofEpochDay(randomInd);
		System.out.println(randomDate);
	}
	public void question6() {
		int maxDay = (int) LocalDate.of(2022, 1, 18).toEpochDay();
		long randomInd = random.nextInt(maxDay);
		LocalDate randomDate = LocalDate.ofEpochDay(randomInd);
		System.out.println(randomDate);
	}
	public void question7() {
		int i = random.nextInt(1000 -100+1)+100;
		System.out.println(i);
	}
}
