package com.thinh.fronend;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.thinh.backend.Exercise2;
import com.thinh.entily.Student;

public class DemoEx2 {

	public static void main(String[] args) {
//		Date date1 = Exercise2.question1(2012, 11, 12);
		Date date2 = new Date(2012,11,12);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String sdate = dateFormat.format(date2);
//		System.out.println(sdate);
// =============================================
		// Question 2
		Student student = new Student("Nguyễn Văn A");
		System.out.println("Phiên bản cũ");
		System.out.println(student.getId());
		System.out.println("Phiên bản mới");
		System.out.println(student.getIdV2());
	
	}

}
