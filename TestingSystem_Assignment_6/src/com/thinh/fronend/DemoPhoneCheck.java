package com.thinh.fronend;

import java.util.Scanner;

import com.thinh.backend.PhoneCheck;
import com.thinh.backend.PhoneException;

public class DemoPhoneCheck {
public static void main(String[] args) throws PhoneException {
	PhoneCheck check = new PhoneCheck();
	Scanner sca = new Scanner(System.in);
//	String str = sca.nextLine();
//	check.checkPhone(str);
	String sac = sca.nextLine();
	System.out.println(sac);
	
}
}
