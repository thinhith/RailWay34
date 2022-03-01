package com.thinh.backend;

public class PhoneCheck {
	// Ham kiem tra dinh dang so dien thoai
	public void checkPhone(String str) throws PhoneException {
		// Bieu thuc chinh quy mo ta dinh dang so dien thoai
		String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

		// Kiem tra dinh dang
		boolean kt = str.matches(reg);

		if (kt == false) {
			throw new PhoneException("Loi: Khong dung dinh dang!");
		} else {
			System.out.println("Dung dinh dang so dien thoai!");
		}
	}
}
