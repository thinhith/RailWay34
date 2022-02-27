package com.thinh.backend;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Excersise2 {
	public static void question1() {
		int q1 = 5;
		System.out.printf("%d%n", q1);
	}
public static void question2() {
	int q2 = 100000000;
	System.out.printf(Locale.US,"%,d",q2);
	
}
public static void question3() {
	float q3 = 5.567098f;
	System.out.printf("%5.4f",q3);
}
public static void question4() {
	String name = "Nguyễn Quang Thịnh";
	String name2 = String.format("Tên tôi là %s Và tôi đang độc thân", name);
	System.out.printf(name2);
}
public static void question5() {
	String pattern = "dd/MM/yyyy HH:mm:ss";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	String date = simpleDateFormat.format(new Date(0));
	System.out.println(date);
	
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy", new Locale("vi","VN"));
	String dates = dateTimeFormatter.format(null);
	System.out.println("Ngày in ra Account này là : " + dates);
}
	
	
}
