package com.thinh.fronend;

import com.thinh.backend.Exercise3;
import com.thinh.entily.Employee;
import com.thinh.entily.MyMap;
import com.thinh.entily.Phone;
import com.thinh.entily.Staff;
import com.thinh.entily.Student;
import com.thinh.entily.StudentEx3OfGeneric;
import com.thinh.entily.StudentOfEx2;

public class DemoEx3OfGeneric {
	public static  void main(String[] args) {
		StudentEx3OfGeneric<Integer> studentEx3OfGeneric1 = new StudentEx3OfGeneric<Integer>(1,"QUang Thịnh");
		StudentEx3OfGeneric<Float> studentEx3OfGeneric2 = new StudentEx3OfGeneric<Float>(2f,"QUang Thịnh");
		StudentEx3OfGeneric<Double> studentEx3OfGeneric3 = new StudentEx3OfGeneric<Double>(3d,"QUang Thịnh");
//		System.out.println(studentEx3OfGeneric1);
//		System.out.println(studentEx3OfGeneric2);
//		System.out.println(studentEx3OfGeneric3);
	//==================Exercise3========================================
//		Exercise3.print("Guyễn Quang THịnh");
		Integer[] testArray = { 1,3,2,4,51,5};
		String[] tesAString = {"Thịnh","Hạnh","Nguyên","Đăng",};
//		Exercise3.ArrayPrint(testArray);
//		Exercise3.ArrayPrint(tesAString);
		
//		Integer[] salarys = {1000,10000,100000,100000};
//		Employee<Integer> employee1 = new Employee<Integer>(1, "Thịnh", salarys);
//		System.out.println(employee1);
//		System.out.println("Lương của " + employee1 + "là " + salarys[salarys.length-1]);
//		System.out.println(employee1);
	// Float
//		Float[] salarys = {1000f,10000f,100000f,100000f};
//		Employee<Float> employee1 = new Employee<Float>(1, "Thịnh", salarys);
//		System.out.println(employee1);
//		System.out.println("Lương của " + employee1 + "là " + salarys[salarys.length-1]);
//		System.out.println(employee1);
	// Double
		
//		Double[] salarys = {1000d,10000d,100000d,100000d};
//		Employee<Double> employee1 = new Employee<Double>(1, "Thịnh", salarys);
//		System.out.println(employee1);
//		System.out.println("Lương của " + employee1 + "là " + salarys[salarys.length-1]);
	// Demo MyMap
//		MyMap<Integer, String> map1 = new MyMap(1, "Thịnh");
//		String name = map1.getValue();
//		Integer id = map1.getKey();
//		System.out.println(id);
		
//		System.out.println(map1.getKey());
	// Demo Phone extents MyMap
		Phone<String, String> phone1 = new Phone<String, String>("thinhithp@gmail.com", "0705876737");
		System.out.println("Email : " + phone1.getKey() + " | Phone Number :" + phone1.getPhoneNumber());
		System.out.println("----------------------------------------------------------");
		Phone<Integer, String> phone2 = new Phone<Integer, String>(1, "070231123");
		System.out.println("Số thứ tự :" + phone2.getKey() +  " | Phone Number : " + phone2.getPhoneNumber());
		System.out.println("----------------------------------------------------------");
		Phone<String, String> phone3 = new Phone<String, String>("Thịnh", "070231123");
		System.out.println("Tên người sử dụng :" + phone2.getKey() + " | Phone Number : " + phone2.getPhoneNumber());
		System.out.println("----------------------------------------------------------");
		Staff<Integer, String> staff1 = new Staff<Integer, String>(1, "Thịnh");
		System.out.println("Số thứ tự : " + staff1.getId() + " | Tên : " + staff1.getName());
	}
}
