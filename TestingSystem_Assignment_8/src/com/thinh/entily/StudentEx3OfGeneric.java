package com.thinh.entily;

public class StudentEx3OfGeneric<T> {
	private T id;
	private String name;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentEx3OfGeneric(T id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentEx3OfGeneric [id=" + id + ", name=" + name + "]";
	}

}
