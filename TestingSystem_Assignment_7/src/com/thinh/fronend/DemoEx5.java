package com.thinh.fronend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.thinh.entilyEx5.Student;

public class DemoEx5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student1 = new Student(1, "Nguyễn Văn A");
		Student student2 = new Student(2, "Nguyễn Văn B");
		Student student3 = new Student(3, "Nguyễn Văn C");
		Student[] studens = { student1, student2, student3 };
/* THAM KHẢO CODE
 * https://cachhoc.net/2013/05/23/java-nhap-mang-tu-file-sap-xep-va-xuat-ra-file-trong-java-import-array-from-file-sort-and-export-file-in-java/a
 * 
 */
	////////////// GHI FILE RA .TXT
//		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\Desktop\\StudentInformation.txt");
//		PrintWriter out = new PrintWriter(fileOutputStream);
//		for (int i = 0; i < studens.length; i++) {
//			out.println(studens[i]);
//		}
//		out.close();
		
	////////////// ĐỌC FILE VỪA XUẤT RA Ở TRÊN

		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\StudentInformation.txt");
		byte[] b = new byte[1024];
		int length = fileInputStream.read(b);
		while (length>-1) {
			// Tạo 1 chuỗi, đọc với 1024 byte, từ vị trí thứ 0 đến length
			String content = new String(b,0,length);
			// In ra 
			System.out.println(content);
//			System.out.println("---------------------------------------------");
			// Kiểm tra tổng độ dài thực tế
//			System.out.println(content.length());
		//********* CHÚ Ý CÚ PHÁP CẬP NHẬT LẠI CÁI LENGTH,nếu không cập nhật lại thì sẽ chạy vô hạn
			length = fileInputStream.read(b);
		}
		fileInputStream.close();
	}

}
