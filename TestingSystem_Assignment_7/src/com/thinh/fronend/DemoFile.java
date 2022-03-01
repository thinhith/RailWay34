package com.thinh.fronend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.thinh.fileUtils.FileException;
import com.thinh.fileUtils.Files;

public class DemoFile {

	public static void main(String[] args) throws Exception {
//		Files.renameFile("C:\\Users\\thinh\\Desktop\\TestFile.txt", "C:\\Users\\thinh\\Desktop\\TestFile2.txt");

		// Học IOStreanm
		// Ví dụ và demo vè đọc file

		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\thinh\\Desktop\\TestFile2.txt");

		// Đọc file dưới dạng byte
		byte[] b = new byte[1024]; // Đọc từng đoạn với định dạng 1024 byte, (Có thể tùy chọn nếu máy cấu hình
									// khỏe)
		// Tạo 1 biến độ dài để hứng file đọc
		int length = fileInputStream.read(b);
		// Chạy vòng lặp để in toàn bộ file text

		while (length > -1) {
			// Tạo 1 chuỗi, đọc với 1024 byte, từ vị trí thứ 0 đến length
			String content = new String(b, 0, length);
			// In ra
//			System.out.println(content);
//			System.out.println("---------------------------------------------");
			// Kiểm tra tổng độ dài thực tế
//			System.out.println(content.length());
			// ********* CHÚ Ý CÚ PHÁP CẬP NHẬT LẠI CÁI LENGTH,nếu không cập nhật lại thì sẽ
			// chạy vô hạn
			length = fileInputStream.read(b);
		}
		fileInputStream.close();

		// VÍ DỤ VÀ DEMO GHI FILE
		String content1 = "Tên tôi là....";
		// Đối với ghi file, viết ở sau parameter, sử dụng true hoặc false
		// True: ghi tiếp tục
		// false: ghi đè lên fie
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\thinh\\Desktop\\TestFile2.txt", false);
		// ghi file kèm với định dạng là byte
		fileOutputStream.write(content1.getBytes());
		System.out.println("Ghi file thành công");
		fileOutputStream.close();
	}
}
