package com.thinh.entily;

import java.util.Arrays;

public class Employee<E> {
	private int id;
	private String name;
	private E[] salarisl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public E[] getSalarisl() {
		return salarisl;
	}

	public void setSalarisl(E[] salarisl) {
		this.salarisl = salarisl;
	}

	public Employee(int id, String name, E[] salarisl) {
		super();
		this.id = id;
		this.name = name;
		this.salarisl = salarisl;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name;
	}

}
