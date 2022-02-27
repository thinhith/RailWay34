package com.thinh.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.attribute.AclEntry;
import java.util.Scanner;

import com.thinh.utils.ScannerUtils;

public class Files {
	// Làm theo tham khảo ở đáp án, tạo FileUtils

	// Tạo biến chứa các thông báo được sử dụng final để không thể thay đổi
	// File

	public static final String FILE_EXISTS = "File is exits!";
	public static final String FILE_NOT_EXISTS = "Error! File Not Exist.";
	// Folder
	public static final String FOLDER_EXISTS = "Folder is exits!";
	public static final String FOLDER_NOT_EXISTS = "Folder is not exits!";
	public static final String PATH_NOT_FOLDER = "Error! Path is not folder.";
	public static final String SOURCE_FILE_NOT_EXISTS = "Source File is not exits!";
	public static final String DESTINATION_FILE_EXISTS = "Destination File is exits!";
	public static final String NEW_FILE_EXISTS = "Error! New File Exist.";
	public static final String CREATE_FILE_SUCCESS = "Create file success!";
	public static final String CREATE_FILE_FAIL = "Create file fail!";
	public static final String DELETE_FILE_SUCCESS = "Delete file success!";
	public static final String DELETE_FILE_FAIL = "Delete file fail!";

	public Files() {

	}

// Tạo method kiểm tra File có trùng lặp hay không
	public static boolean isFileExists(String partFile) throws Exception {
		// Sử dụng toán tử 3 ngôi để kiểm tra -----> Giá trị trả về true or false
		return new File(partFile).exists() ? true : false;
	}

// Tạo method tạo file mới
	public static void createNewFile(String pathFile) throws Exception {
		// B1 -- Phải kiểm tra file đó có tồn tại hay không bằng cách sử dụng method
		// kiểm tra file tồn tại
		if (isFileExists(pathFile)) {
			throw new Exception(FILE_EXISTS);
		}
		boolean ketQua = new File(pathFile).createNewFile();
		System.out.println(ketQua ? CREATE_FILE_SUCCESS : CREATE_FILE_FAIL);
	}

// Tạo 1 method kiểm tra xem đây có phải đường dẫn hay Folder hay không ?
	public static void isCheckFileOrFolder(String pathFile) {
		File file = new File(pathFile);
		if (file.isDirectory()) {
			System.out.println("Đây là 1 Folder");
		} else if (file.isFile()) {
			System.out.println("Đây là 1 File");
		} else {
			System.out.println("Đây không phải là File hoặc folder");
		}
	}

// Tạo 1 method kiểm tra có phải folder hay không
	public static boolean isFolder(String pathFile) {
		File file = new File(pathFile);
		return file.isDirectory();
	}

// Lấy toàn bộ tên file có trong thư mục
// Đối tượng này sẽ trả về 1 mảng
	public static String[] getAllFilename(String pathFile) {
		// Check folder có tồn tại hay là không
		File file = new File(pathFile);
		if (!isFolder(pathFile)) {
			System.out.println("Đây không phải là 1 Thư mục");
			return null;
		} else {
			return file.list();
		}
	}

// Copy file 
	// Không làm theo đáp án vì không hiểu đáp án
	// lấy dữ liệu ở trên web
	// https://viettuts.vn/vi-du-java-io/copy-file-trong-java
	public static void copyFile() throws IOException {
		System.out.println("Nhập đường dẫn file thứ 1");
		String inStream = ScannerUtils.inputString();
		System.out.println("Nhập đường dẫn file thứ 2");
		String outStream = ScannerUtils.inputString();
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(inStream);
			outputStream = new FileOutputStream(outStream);
			int length;
			byte[] buffer = new byte[1024];

			// sao chép nội dung tệp theo byte

			while ((length = inputStream.read(buffer)) > 0) {
				/*
				 * Giải đáp đoạn code (buffer,0,length) Ở đây buffer là đọc file buffer với khối
				 * lượng 1024byte, từ vị trí thứ 0 đến độ dài(length)
				 */
				outputStream.write(buffer, 0, length);
				System.out.println("Sao chép file thành công");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
			outputStream.close();
		}
	}

	public static void moveFile() throws IOException {
		System.out.println("Nhập đường dẫn file thứ 1");
		String inStream = ScannerUtils.inputString();
		System.out.println("Nhập đường dẫn file thứ 2");
		String outStream = ScannerUtils.inputString();
		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {
			File fileLog1 = new File(inStream);
			File fileLog2 = new File(outStream);
			inputStream = new FileInputStream(fileLog1);
			outputStream = new FileOutputStream(fileLog2);
			int length;
			byte[] buffer = new byte[1024];
			// sao chép nội dung tệp theo byte
			while ((length = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, length);
			}
			// Xóa file cũ
			fileLog1.delete();
			System.out.println("Copy file thành công");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
			outputStream.close();
		}
	}

	public static void deleteFile() {
		System.out.println("Nhập đường dẫn ");
		String inStream = ScannerUtils.inputString();
		try {
			File file = new File(inStream);
			if (file.delete()) {
				System.out.println(file.getName() + " xóa thành công");
			} else {
				System.out.println("Không thể xóa file này");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void renameFile(String inputFile, String newName) throws Exception {
		if(!isFileExists(inputFile)) {
			System.out.println(FILE_NOT_EXISTS);
		}
		if (isFileExists(newName)) {
			throw new Exception(NEW_FILE_EXISTS);
		}
		File oldFile = new File(inputFile);
		File newFile = new File(newName);
		oldFile.renameTo(newFile);
		System.out.println("Đổi tên file thành công thành " + newName);
	}
}
