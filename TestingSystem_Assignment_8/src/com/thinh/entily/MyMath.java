package com.thinh.entily;

import java.util.ArrayList;
import java.util.List;

public class MyMath<N extends Number> {
	double ramdomNumber, minNumber, maxnumber, averge, sum = 0.0;
	ArrayList<N> arrayList = new ArrayList<>();
	@SuppressWarnings({"unchecked"})
//	public N add(N...numbers) {
//		Double sum = 0d;
//		for (N number : numbers) {
//			sum += number.doubleValue(); 
//		}
//		return (N)sum;
//	}

	public  <T extends Comparable<T>> T mymax(T x, T a, T b) {
		// Cần đặt 1 biến trung gian để so sánh ?
		// So sánh và dùng hàm compareTo ở đây có nghĩa là để sắp xếp đối tượng ?
		T max = x ;
		if (a.compareTo(max)>0) {
			max = a;
		}
		if (b.compareTo(max)>0) {
			max = b;
		}
		return max;

	}
	public <T extends Number> T sumValue(List<T> list, adder<T> adder) {
		T total = adder.zero();
		for (T n : list) {
			total = adder.add(total, n);
		}
		return total;
	}
}
