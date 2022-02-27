package com.thinh.entity;

public class HighSchoolStudent extends StudentEx5 {
	private String clazz;
	private String desiredUniversity;

	public HighSchoolStudent( String name, String clazz, String desiredUniversity) {
		super(name);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDesiredUniversity() {
		return desiredUniversity;
	}

	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}

	@Override
	public String toString() {
		return "HighSchoolStudent [clazz=" + clazz + ", desiredUniversity=" + desiredUniversity + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getClazz()=" + getClazz() + "]";
	}

}
