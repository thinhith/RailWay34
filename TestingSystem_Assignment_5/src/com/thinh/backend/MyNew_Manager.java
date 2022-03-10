package com.thinh.backend;

import java.util.Scanner;

import com.thinh.entily.MyNews;

public class MyNew_Manager extends MyNews {
	Scanner scanner = new Scanner(System.in);
	public void menu() {
		System.out.println("-------------CHƯƠNG TRÌNH QUÁN LÝ TIN TỨC-------------");
		boolean ischucNang = false;
		byte chucNang ;
		
		do {
			System.out.println("1 - Thêm tin tức \n 2 - Xem danh sách \n 3 - Xem đánh giá \n 4 - Thoát chương trình");
			chucNang = scanner.nextByte();
			switch (chucNang) {
			case 1:
				insertNews();
				break;
			case 2:
				viewListNews();
				break;
			case 3:
				averageRate();
				break;
			case 4:
				exit();
				System.out.println("Hẹn gặp lại");
				return;
				

			default:
				System.out.println("Mời chọn đúng chức năng");
				ischucNang = false;
			}
		} while (ischucNang == false);
		
	
	}
}
