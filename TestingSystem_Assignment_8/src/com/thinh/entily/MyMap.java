package com.thinh.entily;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public MyMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
// Tại sao phải tạo cái này nhỉ

}
