package com.thinh.backend;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.thinh.entily.Student;

public class Exercise1 {
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
		System.out.println(queuestu.poll());
		break;
	}
	System.out.println("Danh sách học sinh còn lại là :" + queuestu.size());
	return queuestu;
	
}
}
