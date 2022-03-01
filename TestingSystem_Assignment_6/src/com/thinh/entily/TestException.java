package com.thinh.entily;

public class TestException {

	public static void main(String[] args) {

		double test = devide(5, 0);
		System.out.println("f1");
		System.out.println("f3");
	}

	public static int devide(int a, int b) {
		int c = 0;
		try {
			// Trong này sẽ cho vào đoạn code có khả năng sẽ sinh ra lỗi
			c = a / b;
		} catch (Exception e) {
			// e.getmess là tin nhắn báo lỗi của hệ thống
			System.err.println(e.getMessage());
		} finally {
			// FINALLY LÀ LỆNH DÙ IN RA CÓ LỖI HAY KHÔNG CŨNG SẼ IN RA
			System.out.println("Divide completed!");

		}
		return c;
	}
}
