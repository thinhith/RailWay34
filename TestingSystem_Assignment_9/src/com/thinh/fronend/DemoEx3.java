package com.thinh.fronend;

import com.thinh.entily.Ex3.CPU;
import com.thinh.entily.Ex3.Car;

public class DemoEx3 {

	public static void main(String[] args) {
		// QUESTION 1
		// Đối với inner class, đầu tiên phải khởi tạo 1 lớp ngoài cùng tức là CPU trước
		CPU cpu = new CPU(5);
		// --------------------------------------
		CPU.Processor proc = cpu.new Processor((byte) 4, "Razer");
		// --------------------------------------
		CPU.Ram ram = cpu.new Ram((short) 128, "Razer");
		//--------------------------------------
			// Sau khi đã tạo xong thì gọi được các method bên trong (subclass)
//		System.out.println("In thông tin thuộc tính của Processor");
			// VD
//		System.out.println("Cache processor :" + proc.getCache());
//		System.out.println("Clock Speed Ram : " + ram.getClockSpeed());
		
		//--------------------------------------
		// QUESTION 2
		Car car = new Car("Mazda", "8WD");
		Car.Engine eng = car.new Engine("Crysler");
		//----------
			// In ra thông tin của động cơ
		System.out.println("Thông tin xe : " + car);
		System.out.println("Engine Type : " + eng.getEngineType());
	}

}
