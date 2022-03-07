package com.thinh.backend;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
public static void question5() {
	List<Object> obj = new ArrayList<Object>();
	obj.add("Nguyễn Văn Nam");
	obj.add(30);
	obj.add("Hà Nội");
	for (Object object : obj) {
		System.out.println(object);
	}
}
}
