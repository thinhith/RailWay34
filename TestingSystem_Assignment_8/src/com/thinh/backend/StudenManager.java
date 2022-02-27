package com.thinh.backend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.thinh.entily.Student;
import com.thinh.utils.ScannerUtils;

public class StudenManager {
	private List<Student> liststudent;

	public StudenManager() {
		liststudent = new ArrayList<Student>();
	}

	public  void addStudent() {
		// Ở phần này còn có fix số lượng học sinh muốn thêm vào
		
		Student student1 = new Student("Nguyễn Văn A");
		Student student2 = new Student("Nguyễn Văn A");
		Student student3 = new Student("Nguyễn Văn A");
		liststudent.add(student1);
		liststudent.add(student2);
		liststudent.add(student3);
		System.out.println("Thêm thành công " + liststudent.size());
		
	}
public void printStudent() {
	for (Student student : liststudent) {
		System.out.println(student.toString());
	}
}
public void choose4number() {
	System.out.println("Phần tử thứ 4 là : " + liststudent.get(2));
}
	// Tạo mới một ArrayList và copy tất cả các phần tử của List trên

	public  void studentcopies() {
		List<Student> studentCopis = new ArrayList<Student>();
		studentCopis.addAll(liststudent);
		// In các phần tử trong ArrayCopies
		for (Student student : studentCopis) {
			System.out.println(student);
		}
	}
	public void topandlastStudent() {
		System.out.println("Phần tử đầu là: " + liststudent.get(0));
		System.out.println("Phần tử cuối là:" + liststudent.get(liststudent.size()-1));
	}
	public void addStudentbonustop() {
		String name = "Nguyễn Văn B";
		liststudent.add(0, new Student(name));
		for (Student student : liststudent) {
			System.out.println(student);
		}
	}
	public void addstudentbonuslast() {
		String name = "Nguyễn Văn c";
		liststudent.add(new Student(name));
		for (Student student : liststudent) {
			System.out.println(student);
		}
	}
	public void daoNguoc() {
		List<Student> studentCopis2 = new ArrayList<Student>();
		studentCopis2.addAll(liststudent);
		Collections.reverse(studentCopis2);
		for (Student student : studentCopis2) {
			System.out.println(student.toString());
		}
	
	}
	public void seachStudentbyId() {
		System.out.println("Nhập vào id muốn tìm kiếm");
		int id = ScannerUtils.inputInt();
		for (Student student : liststudent) {
			if(student.getId()== id) {
				System.out.println(student);
			}
		}
	}
	public void seachStudentbyName() {
		System.out.println("Nhập vào tên muốn tìm kiếm");
		String name = ScannerUtils.inputString();
		for (Student student : liststudent) {
			if(student.getName().contains(name)) {
				System.out.println(student);
			}
		}
	}
	public void deleteStudentbyID() {
		System.out.println("Nhập vào ID muốn xoá");
		int id = ScannerUtils.inputInt();
		for (Student student : liststudent) {
			if(student.getId() == id) {
				student.setName(null);
				System.out.println("thành công");
			}
		}
		printStudent();
		
	}
//private List<Student>studentCopies(String stu){
//	
//	stu = stu.trim();
//	for (Student student : liststudent) {
//		if (student.getName().trim().contains(stu)) {
//			studentCopis.add(student);
//		}
//	}
//	return studentCopies(null);
//}

}
