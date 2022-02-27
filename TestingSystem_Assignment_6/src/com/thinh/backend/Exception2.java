package com.thinh.backend;

import java.util.Scanner;

public class Exception2 {
	private Scanner scanner;
	
	public  Exception2() {
		scanner =  new Scanner(System.in);
	}
	// Ex.1 and 2
	public static float divide(int a, int b) {
		float c = 0;
		try {
			return c = a / b;
			
		} catch (ArithmeticException e) {
			System.err.println("Connot divide 0");
		}finally {
			System.out.println("Divide completed");
		}
		return c;
	}
	
	// Ex.3
	public static void arrayC(int i) {
		int[] number = {1,2,3};
		try {
			System.out.println(number[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
	}
	// Ex.4
	public static void getIndex(int index) {
		
		String[] department = {"dep1", "dep2","dep3"};
		try {
			System.out.println(department[index]);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	// Ex.5
	public int inputAge() {
		String input;
		int output;
		while (true) {
			System.out.println("Mời nhập vào tuổi");
			try {
				
				input = scanner.nextLine().trim();
				 output = Integer.parseInt(input);
				
				if (output <= 0 || output >=100 ) {
					System.err.println("Mời nhập lại");
				}else {
					return output;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.out.println("Mời nhập lại");
			}
		}
	
		
	}
}
