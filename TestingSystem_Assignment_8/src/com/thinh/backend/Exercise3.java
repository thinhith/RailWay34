package com.thinh.backend;

public class Exercise3 {
	public static <T> void print(T obj) {
		// Tạo kiểu định nghĩa chung chung cho người dùng nhập vào bất cứ cái gì
		System.out.println(obj);
	}
// Dưới đây là tạo kiểu in ra 1 chuỗi
	public static <E> void ArrayPrint(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
	}
}
