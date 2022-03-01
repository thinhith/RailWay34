package com.thinh.entily4;

import java.io.File;
import java.util.Scanner;

import com.thinh.utils.ScannerUtils;

public class Files {

	public Files() {

	}

//	public static String inputStringByFile() {
//		Scanner scanner = new Scanner(System.in);
//		String input;
//		input = scanner.nextLine().trim();
//		input = input.replace("\", "\\")
//	}
	public static boolean isFileExists() {

		String pathFile;
		pathFile = ScannerUtils.inputString();

		File file = new File(pathFile);
		if (file.exists()) {
			System.out.println("File is Exists");
			return true;
		} else {
			System.out.println("File is not exists");

		}
		return false;
	}
}
