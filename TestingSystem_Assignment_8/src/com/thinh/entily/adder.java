package com.thinh.entily;

public interface adder<T extends Number> {
	T zero(); // thêm mục không
	T add(T lst, T rst); // thêm 2 mục
	
}
