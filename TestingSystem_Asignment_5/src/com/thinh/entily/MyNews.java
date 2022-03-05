package com.thinh.entily;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class MyNews implements IMyNews {
	private ArrayList<News> news;
	private Scanner scanner;
	private ChuanHoaChuoi chuanHoaChuoi;

	public MyNews() {
		news = new ArrayList<News>();
		scanner = new Scanner(System.in);
		chuanHoaChuoi = new ChuanHoaChuoi();
	}

	@Override
	public void insertNews() {
		System.out.println("Mời nhập vào tiêu đề");
		String title = scanner.nextLine();
		System.out.println("Mời nhập vào ngày ");
		byte datepub = scanner.nextByte();
		System.out.println("Mời nhập vào tháng");
		byte month = scanner.nextByte();
		System.out.println("Mời nhập vào năm");
		int year = scanner.nextInt();
		String localDate = LocalDate.of(year, month, datepub).format(DateTimeFormatter.ofPattern("dd LLLL yyyy"));

		scanner.nextLine();
		System.out.println("Mời nhập tác giả");
		String author = scanner.nextLine();
		System.out.println("Mời nhập nội dung");
		String content = scanner.nextLine();
		System.out.println("Nhập vào đánh giá 1 (Bằng số)");
		int rate1 = scanner.nextInt();
		System.out.println("Nhập vào đánh giá 2 (Bằng số)");
		int rate2 = scanner.nextInt();
		System.out.println("Nhập vào đánh giá 3 (Bằng số)");
		int rate3 = scanner.nextInt();
		int[] is = { rate1, rate2, rate3 };
		News new1 = new News(title, localDate, author, content, is);
		news.add(new1);
		System.out.println("Tạo thành công");
	}

	@Override
	public void viewListNews() {
		for (News news2 : news) {
			news2.Display();
		}
	}

	@Override
	public void averageRate() {
		for (News news2 : news) {
			System.out.println("Tiêu đề :" + news2.getTitle() + " Đánh giá trung bình :" + news2.Calculate());
		}
	}

	@Override
	public void exit() {
		return;
	}

}
