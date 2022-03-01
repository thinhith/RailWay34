package com.thinh.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

import com.thinh.backend.PhoneCheck;
import com.thinh.backend.PhoneException;

public class ScannerUtils {
	private static Scanner scaner = new Scanner(System.in);
	private PhoneCheck checkPhone;

	public ScannerUtils() {
		scaner = new Scanner(System.in);
		checkPhone = new PhoneCheck();
	}

// Input int
	public static int inputInt() {
		String input;
		int output;
		while (true) {
			try {
				input = scaner.nextLine().trim();
				output = Integer.parseInt(input);
				if (output >= 0) {
					return output;
				} else {
					System.out.println("Mời nhập đúng số nguyên");
				}

			} catch (Exception e) {
				System.out.println("Chuỗi bạn nhập không phải là số nguyên !! Mời nhập lại");
			}

		}
	}

// Input float
	public static float inputFloat() {
		String input;
		float output;
		while (true) {
			System.out.println("Mời nhập số thực");
			try {
				input = scaner.nextLine().trim();
				output = Float.parseFloat(input);
				return output;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

// Input Double

	public static double inputDouble() {
		String input;
		double output;
		while (true) {
			System.out.println("Mời nhập số thực");
			try {
				input = scaner.nextLine().trim();
				output = Double.parseDouble(input);
				return output;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

// InputAge
	public static byte inputAge() {
		String input;
		byte output;
		while (true) {
			System.out.println("Mời nhập vào tuổi");
			try {

				input = scaner.nextLine().trim();
				output = Byte.parseByte(input);

				if (output <= 0 || output >= 100) {
					System.err.println("Mời nhập lại");
				} else {
					return output;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.out.println("Mời nhập lại");
			}
		}
	}

// Input Point
	public static double inputPoint() {
		String input;
		double output;
		while (true) {
			System.out.println("Mời nhập vào điểm");
			try {

				input = scaner.nextLine().trim();
				output = Double.parseDouble(input);

				if (output < 0 || output >= 11) {
					System.err.println("Mời nhập lại");
				} else {
					return output;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.out.println("Mời nhập lại");
			}
		}
	}

// Input String
	public static String inputString() {
		String input;
		while (true) {
			input = scaner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println("Mời nhập lại !");
			}

		}

	}

// Input Email
	public static String inputEmail() {
		// Sử dụng các đơn giản bằng cách kiểm tra chuỗi nhập vào có chứa ký tư '@' hay
		// không
		String input;
		while (true) {
			input = scaner.nextLine().trim();
			if (input.contains("@")) {
				return input;
			} else {
				System.out.println("Mời nhập đúng định dạng email");
			}
		}
	}

// Input Date -- Answer
	public static LocalDate inputLocalDate() {
		System.out.println("Nhập đúng theo định dạng ngày yyyy-MM-dd");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		while (true) {
			String local = scaner.nextLine().trim();
			try {
				if (simpleDateFormat.parse(local) != null) {
					LocalDate localD = LocalDate.parse(local);
					return localD;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}

// Input Phone - Vùng Việt nam
//	public String[] inputPhone() {
////		String[] number = {"0",1,2,3,4,5,6,7,8,9};
//		String input;
//		System.out.println("Mời nhập số điện thoại");
//		input = scaner.nextLine().trim();
////		input = input.replaceAll("\\s+", " ");
//		input = input.replaceFirst("+84","0");
//		String[] input2 = input.split("+");
//		
//	/* Trên nhận định theo quan điểm cá nhân, trên thực tế, số điện thoại người là bảo mật
//	 * vấn đề nhập đúng hay sai, có cần thiết hay không là do yêu cầu và lĩnh vực kinh doanh của công ty.
//	 * Trong trường hợp không cần thiết, người dùng có thể nhập sai để có thể vượt qua bước đăng ký
//	 *  Thứ 2 là đối với các trường hợp hệ thống trả mã code bằng số điện thoại, thì không cần yêu cầu
//	 *  khách hàng nhập đúng thì khách hàng cũng tự động phải nhập đúng, nếu khách hàng thực sự có nhu cầu sử dụng dịch vụ
//	 */
//		return input2;
//	}

	// Ham kiem tra dinh dang so dien thoai
	public void inputPhone() {
		/*
		 * Trên nhận định theo quan điểm cá nhân, trên thực tế, số điện thoại người là
		 * bảo mật vấn đề nhập đúng hay sai, có cần thiết hay không là do yêu cầu và
		 * lĩnh vực kinh doanh của công ty. Trong trường hợp không cần thiết, người dùng
		 * có thể nhập sai để có thể vượt qua bước đăng ký Thứ 2 là đối với các trường
		 * hợp hệ thống trả mã code bằng số điện thoại, thì không cần yêu cầu khách hàng
		 * nhập đúng thì khách hàng cũng tự động phải nhập đúng, nếu khách hàng thực sự
		 * có nhu cầu sử dụng dịch vụ
		 */
		String inputPhonenumber;
		System.out.println("Mời nhập số điện thoại");
		while (true) {

			inputPhonenumber = scaner.nextLine();

			try {
				checkPhone.checkPhone(inputPhonenumber);
				System.out.println(inputPhonenumber);
				return;
			} catch (PhoneException e) {
				System.err.println(e.getMessage());
			}
		}
	}

// Tham khảo
	public void inputPhone2() {
		boolean flag;
		do {
			String phonePattern = "(\\d{3}-)?\\d{3}-(\\d{4}";
			System.out.print("Input your phone(xxx-xxx-(xxxx): ");
			String input = scaner.next();
			flag = input.matches(phonePattern);
			if (!flag)
				System.out.println("Invalid data!");
		} while (!flag);
		System.out.println("Valid data");
	}

//Tham khảo
	public void inputEmail2() {
		/*
		 * Trong method này, có lỗi xảy ra đối với phần nhập vào là nếu có dấu . hoặc
		 * dấu khác là sẽ báo lối Trong trường hợp này ta phải ép kiểu định dạng về
		 * regex
		 */
		String emailPattern = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		String input;
		boolean flag;
		do {
//    	 String emailPattern = "\\w+@\\w+[.]\\w+([.]\\w+)?";
			System.out.print("Nhập vào định dạng email(email@address.com): ");
			input = scaner.next();
			flag = input.matches(emailPattern);
			if (!flag)
				System.out.println("Email không hợp lệ");
		} while (!flag);
		System.out.println("Nhập thành công");
	}

	public void inputPassword() {
		String passPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
		String input;
		boolean check;
		System.out.println("Nhập vào mật khẩu \r\n+ Phải chứa ít nhất 1 ký tự số từ 0 – 9\r" + "\r"
				+ "+ Phải chứa ít nhất 1 ký tự chữ thường\r" + "\r" + "+ Phải chứa ít nhất 1 ký tự chữ hoa\r" + "\r"
				+ "+ Phải chứa ít nhất 1 ký tự trong tập các ký tự ");
		do {
			input = scaner.nextLine();
			check = input.matches(passPattern);
			if (!check)
				System.out.println("Mật khẩu nhập không hợp lệ");
		} while (!check);
		System.out.println("Tạo mật khẩu thành công");

	}

}
