package com.thinh.backend;

public class PhoneException extends Exception {
/*Hàm khởi tạo
 * Đây được gọi là Custom Exception, do mình tự đặt và ném ra 1 throws để xử lý cuối cùng
 */
	
	public PhoneException(String str) {
		
		super(str);
	}
}
