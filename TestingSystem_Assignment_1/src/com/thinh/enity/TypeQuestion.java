package com.thinh.enity;

public class TypeQuestion {
	public static byte COUNT = 0;
	byte id;
	ETypeQuestion typeName;
	public TypeQuestion( ETypeQuestion typeName) {
		super();
		COUNT++;
		this.id = COUNT;
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "TypeQuestion [id=" + id + ", typeName=" + typeName + "]";
	}
	
	
}
