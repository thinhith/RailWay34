package com.thinh.entity;

import java.util.Scanner;

public class ScanUtils {
	private static Scanner scanner;

	public void ScannerUtils() {
		scanner = new Scanner(System.in);
	}

	public int inputInt() {
		while (true) {
			try {
				String input = scanner.nextLine().trim();
				int output = Integer.parseInt(input);

				return output;
			} catch (NumberFormatException e) {
				System.out.println("Chuỗi bạn nhập không phải là số nguyên. Mời bạn nhập lại!");
			}
		}
	}

	public int inputPositiveInt() {
		while (true) {
			try {
				String input = scanner.nextLine().trim();
				int output = Integer.parseInt(input);

				if (output < 0) {
					System.out.println("Giá trị phải là số dương");
					continue;
				}

				return output;
			} catch (NumberFormatException e) {
				System.out.println("Chuỗi bạn nhập không phải là số nguyên dương. Mời bạn nhập lại!");
			}
		}
	}

	public float inputFloat() {
		while (true) {
			try {
				String input = scanner.nextLine().trim();
				float output = Float.parseFloat(input);

				return output;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				System.out.println("Chuỗi bạn nhập không phải là số thực. Mời bạn nhập lại!");
			}
		}
	}

	public double inputDouble() {
		while (true) {
			try {
				String input = scanner.nextLine().trim();
				double output = Double.parseDouble(input);

				return output;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				System.out.println("Chuỗi bạn nhập không phải là số thực. Mời bạn nhập lại!");
			}
		}
	}

	public String inputString() {
	
			String inputString = scanner.nextLine();
			inputString = inputString.trim();
			inputString = inputString.replaceAll("\\s+", " ");
	
			return inputString;

		
	}

	public String inputEmail() {
		while (true) {
			String email = scanner.nextLine().trim();
			if (email.contains("@") == false) {
				System.out.println("Email bạn nhập không đúng định dạng. Mời bạn nhập lại:");
			} else {
				return email;
			}
		}
	}
}
