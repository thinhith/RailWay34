package com.thinh.backend;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.thinh.entily2.Student;

public class Student_Manager {
	private ArrayList<Student> listStu;
	private Scanner scanner;
	private Random random;

	public Student_Manager() {
		listStu = new ArrayList<Student>();
		scanner = new Scanner(System.in);
		random = new Random();

	}

	public void menu() {
		System.out.println("--------CHƯƠNG TRÌNH PHÂN CHIA CÔNG VIỆC,QUẢN LÝ SINH VIÊN--------");
		byte chucNang ;
		boolean isCheck = false ;
		
		do {
			System.out.println("Nhập chức năng muốn sử dụng \n 1-Tạo ngẫu nhiêu sinh viên "
					+ "\n 2-Điểm danh \n 3-Gọi nhóm 1 đi học bài \n 4-Gọi nhóm 2 đi dọn vệ sinh \n 5-Thoát)");
			chucNang = scanner.nextByte();
			switch (chucNang) {
			case 1:
					themSinhVien();
					System.out.println("Tạo thành công 10 sinh viên");
				break;
			case 2:
				diemdanh();
				break;
			case 3:
				goinhom();
				break;
			case 4:
				donVeSinh();
				break;
			case 5:
				return;
			default:
				System.out.println("Mời chọn lại đúng giá trị (1-5)");
				isCheck = false;
			}
		} while (isCheck == false);
		
		
	}

	public void themSinhVien() {
		for (int i = 0; i < 10; i++) {
			Student student = new Student("Học Sinh : " + (i + 1), random.nextInt(3) + 1);
			listStu.add(student);
		}
	}

	public void diemdanh() {
		for (Student student : listStu) {
			student.diemDanh();
		}
	}

	public void goinhom() {
		for (Student student : listStu) {
			if (student.getGroup() == 1) {
				student.hocBai();
			}
		}
	}

	public void donVeSinh() {
		for (Student student : listStu) {
			if (student.getGroup() == 2) {
				student.diDonVeSinh();
			}
		}
	}
}
