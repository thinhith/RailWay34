package com.thinh.fronend;

import com.thinh.backend.StudenManager;

public class DemoStudenManager {
public static void main(String[] args) {
	StudenManager manager = new StudenManager();
	
	manager.addStudent();
	System.out.println("========================================================");
	manager.printStudent();
	System.out.println("========================================================");
	manager.choose4number();
	System.out.println("========================================================");
	manager.topandlastStudent();
	System.out.println("========================================================");
	manager.addStudentbonustop();
	System.out.println("========================================================");
	manager.addstudentbonuslast();
	System.out.println("========================================================");
	manager.daoNguoc();
	System.out.println("========================================================");
//	manager.seachStudentbyId();
//	manager.seachStudentbyName();
	manager.deleteStudentbyID();
//	StudenManager.studentcopies();
}
}
