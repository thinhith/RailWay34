package com.thinh.fronend;

import com.thinh.entily.MyMap;
import com.thinh.entily.MyMath;
import com.thinh.entily.Salary;

public class DemoWildcard {
	public static void main(String[] args) {
		Salary<Integer> salary1 = new Salary<Integer>(1000000);
//		System.out.println(salary1);
		MyMath<Integer> math1 = new MyMath<>();
		MyMath<Float> math2 = new MyMath<>();
		int maxint = math1.mymax(1, 233, 10);
//		System.out.println(maxint);
		float maxfloat = math1.mymax(1.0f, 9.5f, 5.6f);
//		System.out.println(maxfloat);
		Float[] floatary = {};
		
		Float sumFloat = math2.add(1.5f,2.4f,10.4f);
//		System.out.println(sumFloat);
		
		float subint = math2.subtract(10f, 5f);
//		System.out.println(subint);

	}

}
