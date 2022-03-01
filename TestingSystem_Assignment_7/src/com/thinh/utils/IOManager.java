package com.thinh.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOManager {
	private static final String FILE_EXISTS = "File is exits!";
	private static final String FILE_NOT_EXISTS = "Error! File Not Exist.";
	private static final String WRITE_FILE_SUCCESS = "Write file success!";

	public static String readFile() throws Exception {
		System.out.println("Nhập vào đường dẫn file");
		String pathFile = ScannerUtils.inputString();
		if (!Files.isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		// Ví dụ và demo vè đọc file

		FileInputStream fileInputStream = new FileInputStream(pathFile);

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
			System.out.println(content);
			System.out.println("Độ dài tổng ký tự của đoạn này là : " + content.length());
			System.out.println("---------------------------------------------");
			// Kiểm tra tổng độ dài thực tế
			// ********* CHÚ Ý CÚ PHÁP CẬP NHẬT LẠI CÁI LENGTH,nếu không cập nhật lại thì sẽ
			// chạy vô hạn
			length = fileInputStream.read(b);
		}
		fileInputStream.close();
		return null;
	}

	public static void writeFile(String duongDan, boolean isC, String content) throws Exception {
		if (!Files.isFileExists(duongDan)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		FileOutputStream outStream = new FileOutputStream(duongDan, isC);
		outStream.write(content.getBytes());
		outStream.close();
		System.out.println(WRITE_FILE_SUCCESS);
	}

	public static void writeObject(Object object, String path, String fileName) throws Exception {
		if (!Files.isFileExists(path)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		System.out.println("Nhập tên file");
		fileName = ScannerUtils.inputString();
		// sau đó
		path = path + "\\" + fileName;
		FileOutputStream fileOutputStream = new FileOutputStream(path);
		// Object ghi vào
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(object);
		fileOutputStream.close();
		objectOutputStream.close();
		System.out.println(WRITE_FILE_SUCCESS);

	}

	public static void readObject(Object object, String path) throws Exception {
		if (!Files.isFileExists(path)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		FileInputStream fileInputStream = new FileInputStream(path);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Object obj = objectInputStream.readObject();
		object = obj;
		objectInputStream.close();
		System.out.println(object.toString());
	}
}
