package com.thinh.fronend;

import java.util.ArrayList;
import java.util.List;

import com.thinh.backend.Exercise4;
import com.thinh.entily.MyMap;
import com.thinh.entily.MyMath;
import com.thinh.entily.Salary;
import com.thinh.entily.adder;

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
		
//		Float sumFloat = math2.add(1.5f,2.4f,10.4f);
//		System.out.println(sumFloat);
		
//------------------------------------------------------------------------------
		// Demo Interger
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(5);
		MyMath<Integer> myMath = new MyMath<Integer>();
		Integer total = myMath.sumValue(list, new adder<Integer>() {
			public Integer add(Integer a, Integer b) {
				return a-b;
			}

			@Override
			public Integer zero() {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		System.out.println(total);
		//------------------------------------------------------------------------------
				// Demo Float
//		List<Float> list2 = new ArrayList<Float>();
//		list2.add(1.4f);
//		list2.add(4.4f);
//		list2.add(3.4f);
//		MyMath<Float> myMath2 = new MyMath<Float>();
//		Float total2 = myMath2.sumValue(list2, new adder<Float>() {
//			public Float add(Float a, Float b) {
//				return a-b;
//			}
//
//		
//
//			@Override
//			public Float zero() {
//				// TODO Auto-generated method stub
//				return (float) 0;
//			}


		
//		});
//		System.out.println(total2);
		//-----------------------------------------------------------------
		// Test question 5
		Exercise4.question5();
	}

}
