package com.thinh.backend;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
	static Scanner scanner = new Scanner(System.in);

	public static void question1() {
		float q1 = 5240.5f;
		float q2 = 10970.055f;
		int q11 = (int) q1;
		int q12 = (int) q2;
		System.out.println("Lương của q1 là :" + q11 + "$");
		System.out.println("Lương của q2 là :" + q12 + "$");
	}

	public String question2() {
		Random random = new Random();
		int q2;
		q2 = random.nextInt(99999);
		String qq2 = String.valueOf(q2);
		switch (qq2.length()) {
		case 1:
			return "0000" + qq2;
		case 2:
			return "000" + qq2;
		case 3:
			return "00" + qq2;
		case 4:
			return "0" + qq2;
		default:
			return qq2;
		}

	}
	public static void question2in2() {
		Random random = new Random();
		int q2;
		q2 = random.nextInt(99999);
		String qq2 = String.valueOf(q2);
		while (qq2.length()<5) {
			qq2 = "0"+q2;
			break;
		}
	}

	public void question3() {
		Random random = new Random();
		int q2;
		q2 = random.nextInt(99999);
		String q3 = String.valueOf(q2);
		// SUBTRING LÀ HÀM CẮT CHUỖI THỨ TỰ TỪ....
		if(q3.equals(q3.length()<2)) {
			System.out.println("0"+ q3);
		}
		System.out.println(q3.substring(q3.length()-2));
		// BÀI NÀY CÓ TRƯỜNG HỢP CÓ 1 CHỮ SỐ
		
	}
	public void question3in2() {
		Random random = new Random();
		int q2;
		q2 = random.nextInt(99999);
		int q3;
		if(q2 % 100 !=0) {
			System.out.println("0" + q2);
		}
	}

	public static void question4() {
		System.out.println("Nhập vào số nguyên a");
		int a = scanner.nextInt();
		System.out.println("Nhập vào số nguyên b");
		int b = scanner.nextInt();

		System.out.println("Kết quả thương số là :" + (double) a / b);

	}
}
