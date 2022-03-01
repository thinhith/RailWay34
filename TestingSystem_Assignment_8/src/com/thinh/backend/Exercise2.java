package com.thinh.backend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.thinh.entily.StudentOfEx2;
import com.thinh.utils.ScannerUtils;

public class Exercise2 {
	static List<StudentOfEx2> listStu = new ArrayList<StudentOfEx2>();

	public static void question1() {
		System.out.println("Nhập số học sinh muốn khởi tạo");
		int stuNum = ScannerUtils.inputInt();
		for (int i = 0; i < stuNum; i++) {
			System.out.println("Nhập vào tên Student");
			String name = ScannerUtils.inputString();
			StudentOfEx2 studentOfEx2 = new StudentOfEx2(name);
			listStu.add(studentOfEx2);
		}
		System.out.println("Tạo thành công : " + listStu.size() + " Student ");
		Collections.sort(listStu);
		for (StudentOfEx2 studentOfEx2 : listStu) {
			System.out.println(studentOfEx2);
		}
	}
	public static void question2() {
		System.out.println("Nhập số học sinh muốn khởi tạo");
		int stuNum = ScannerUtils.inputInt();
		for (int i = 0; i < stuNum; i++) {
			System.out.println("Nhập vào tên Student");
			
			String name = ScannerUtils.inputString();
			System.out.println("Nhập vào điểm của Student");
			float diem = ScannerUtils.inputFloat();
			StudentOfEx2 studentOfEx2 = new StudentOfEx2(name,diem);
			listStu.add(studentOfEx2);
		}
		System.out.println("Tạo thành công : " + listStu.size() + " Student ");
		Collections.sort(listStu);
		for (StudentOfEx2 studentOfEx2 : listStu) {
			System.out.println(studentOfEx2);
		}
	}
}
