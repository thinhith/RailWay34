package com.thinh.backend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import com.thinh.entily.Student;
import com.thinh.utils.ScannerUtils;

public class Exercise1 {
	static Set<Student> stus= new HashSet<Student>();
	static List<Student> listStu = new ArrayList<Student>();
	public Exercise1() {
		
	}
public static Stack<String> question2() {
	Stack<String> students = new Stack<String>();
	students.push("Nguyễn Văn Nam");
	students.push("Nguyễn Văn Huyên");
	students.push("Trần Văn Nam");
	students.push("Nguyễn Văn A");
	
	return students;
}

public static Stack<String> stackstudent(){
	Stack<String> student2 = question2();
// Sử dụng Stack và hàm Iterator để sắp xếp thứ tự
	System.out.println("In sinh viên từ muộn nhất đến sớm nhất");
	Iterator<String> interStudent = student2.iterator();
	while (interStudent.hasNext()) {
		String string = (String) interStudent.next();
		System.out.println(string);
	}
	System.out.println("----------------------------");
	System.out.println("Sinh viên đến muộn nhất");
	System.out.println(student2.peek());
	System.out.println("----------------------------");
	
for (int i = 0; i < student2.size(); i++) {
	System.out.println(student2.pop());
	
}
System.out.println("Số sinh viên còn lại " + student2.size());
return student2;
	
}
public static Queue<String> queueStudent(){
	Queue<String> queuestu = new LinkedList<String>();
	queuestu.add("Nguyễn Văn Nam");
	queuestu.add("Nguyễn Văn Huyên");
	queuestu.add("Trần Văn Nam");
	queuestu.add("Nguyễn Văn A");
	
	System.out.println("In theo tứ tự từ sớm nhất đến muộn nhất");
	for (int i = 0; i < queuestu.size(); i++) {
		// poll là trả về phần tử đầu tiên và xoá đi
		System.out.println(queuestu.poll());
		break;
	}
	System.out.println("Danh sách học sinh còn lại là :" + queuestu.size());
	return queuestu;
	
}
public static void ques3OfSet() {
	System.out.println("Nhập số sinh viên muốn tạo");
	int numStu = ScannerUtils.inputInt();
	for (int i = 0; i < numStu; i++) {
		Student stu = new Student("Student : "+ (i+1));
		listStu.add(stu);
	}
	System.out.println("Tạo thành công " + listStu.size() + "sinh viên");
	// Sử dụng Iterator để duyệt các phần tử (Sinh viên)
	Iterator<Student> iterator = listStu.iterator();
	for (int i = 0; i < listStu.size(); i++) {
		System.out.println(iterator.next());
	}
}
public static void question4() {
	System.out.println("Nhập số sinh viên muốn tạo");
	int numStu = ScannerUtils.inputInt();
	for (int i = 0; i < numStu; i++) {
		
		System.out.println("Nhập vào tên Student");
		String name = ScannerUtils.inputString();
		Student student4 = new Student(name);
		listStu.add(student4);
	}
	System.out.println("Tạo thành công " + listStu.size() + "sinh viên");
	Iterator<Student> iterator = listStu.iterator();
	for (int i = 0; i < listStu.size(); i++) {
		System.out.println(iterator.next());
		// Ở đây vẫn trả ra kết quả vì khác địa chỉ ô nhớ của vòng lặp
		// Question 5
		System.out.println("--------------QUESTION 5------------");
		List<Student> students5 = new ArrayList<Student>(listStu);
		Collections.sort(students5);
		// Ở chỗ này cần chú ý cài đặt phương thức (implements Comparable<Student>) để có thể so sánh
		for (Student student : students5) {
			System.out.println(student);
		}
	}
}

}
