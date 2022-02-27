package com.thinh.fronend;

import java.time.LocalDate;

import com.thinh.entity.Account;
import com.thinh.entity.Student;

public class Program {

	public static void main(String[] args) {

		Student student1 = new Student("234234", "Hà Nội");
		student1.setPoint(4.5);
		student1.addPoint(1.0);
		
		System.out.println(student1.toString());
	
	}
	

}
