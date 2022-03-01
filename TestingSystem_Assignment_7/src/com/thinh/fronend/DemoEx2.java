package com.thinh.fronend;

import com.thinh.entilyEx2.MyMath;
import com.thinh.entilyEx2.PrimaryStudent;
import com.thinh.entilyEx2.SecondaryStudent;
import com.thinh.entilyEx2.Student;

public class DemoEx2 {

	public static void main(String[] args) {
//		System.out.println(MyMath.sum(2));
		// Ở đâu hệ thống sẽ báo lỗi không thể thay đổi biến chứa từ khóa final với
		// thông báo
		// --- The final field MyMath.PI cannot be assigned
//		MyMath.PI = (float) 3.15;
//		System.out.println(MyMath.PI);

		// Ques2
//		Student.addStudent();

		// Ques3
//		PrimaryStudent primaryStudent = new PrimaryStudent();
//		System.out.println(PrimaryStudent.study());
		SecondaryStudent secondaryStudent = new SecondaryStudent();
		System.out.println(SecondaryStudent.study());
	}

}
