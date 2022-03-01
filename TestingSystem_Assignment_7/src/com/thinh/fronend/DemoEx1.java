package com.thinh.fronend;

import java.util.ArrayList;

import com.thinh.entily.Student;

public class DemoEx1 {

	public static void main(String[] args) {

		Student[] students = new Student[3];

		// Ques 1
//		for (int i = 0; i < students.length; i++) {
//			students[i] = new Student();
//			students[i].setName("Nguyễn Văn " + (i+1));
//			
//			System.out.println(students[i]);
//			
//		}

		// Khi để ở hàm main thì phải để ở public để tăng phạm vi truy cập pack
//		Student.college = "Đại học Công Nghệ";
//		for (int i = 0; i < students.length; i++) {
//			students[i] = new Student();
//			students[i].setName("Nguyễn Văn " + (i+1));
//			
//			System.out.println(students[i]);

//		}

		// Ques 2
//		System.out.println("Các sinh viên đóng quỹ mỗi người 100k");
//		System.out.println("Tổng quỹ :" + (Student.moneyGroup += 300));
//		System.out.println("Học sinh 1 lấy 50k đi mua đồ");
//		System.out.println("Tổng quỹ :" + (Student.moneyGroup -=50));
//		System.out.println("Học sinh 2 lấy 20k đi mua bánh mỳ");
//		System.out.println("Tổng quỹ :" + (Student.moneyGroup -=20));
//		System.out.println("Học sinh 3 lấy 150k đi mua đồ dùng học tập");
//		System.out.println("Tổng quỹ :" + (Student.moneyGroup -=150));
//		System.out.println("Cả nhóm mỗi người đóng lại 50k");
//		System.out.println("Tổng quỹ :" + (Student.moneyGroup +=50));

		// quest 4
//	Student student = new Student();
//	System.out.println(student);
		// Ques 5
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].setName("Nguyễn Văn " + (i + 1));
			System.out.println(students[i].COUNT);
		}
	}
}
