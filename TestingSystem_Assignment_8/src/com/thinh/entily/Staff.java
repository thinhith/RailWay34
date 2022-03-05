package com.thinh.entily;

public class Staff<K, V> extends MyMap<K, V> {

	public Staff(K key, V value) {
		super(key, value);
	}

	public K getId() {
		return (K) getKey();

	}

	public V getName() {
		return (V) getValue();
	}
}
