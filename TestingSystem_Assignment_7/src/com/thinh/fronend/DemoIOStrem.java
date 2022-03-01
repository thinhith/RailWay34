package com.thinh.fronend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.thinh.utils.IOManager;
import com.thinh.utils.Vehicle;

public class DemoIOStrem {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		IOManager.writeFile("C:\\Users\\thinh\\Desktop\\TestFile2.txt", true, "Myyyyyyyyyyyyyyyyyyyyyy");
//		Vehicle vehicle = new Vehicle("E250", "Red", "Mecerdes");
		// Ghi Object
		/*
		 * CHÚ Ý'' Ở class đọc cần implements Serializble Đuôi tên file được khởi tạo
		 * cần đặt tên đuôi là "ser"
		 */
//		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\thinh\\Desktop\\TestFile2.ser");
//		// Object ghi vào
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//		// Ở đây sử dụng writeObject để ghi instend đã khởi tạo là new Vehicle("E250", "Red", "Mecerdes");
//		objectOutputStream.writeObject(vehicle);
//		objectOutputStream.close();
//	IOManager.writeObject(vehicle, "C:\\Users\\thinh\\Desktop", null);
//		IOManager.readObject(vehicle, "C:\\Users\\thinh\\Desktop\\thinh.ser\\");

//		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\thinh\\Desktop\\thinh.ser");
//		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//		Object obj = objectInputStream.readObject();
//		
//		Vehicle vehicle = (Vehicle) obj.;
//		objectInputStream.close();
//		System.out.println(vehicle.getName());
//		
// THAM KHẢO CODE TRÊN MẠNG
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("C:\\Users\\thinh\\Desktop\\thinh.ser"));
			// read student
			Vehicle vehicle = (Vehicle) ois.readObject();
			// show student
			System.out.println(vehicle.toString());
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			ois.close();
		}
	}

}
