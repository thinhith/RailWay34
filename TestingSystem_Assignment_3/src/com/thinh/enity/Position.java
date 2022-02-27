package com.thinh.enity;

public class Position {
	public static byte COUNT = 0;
	public byte iD;
	public PositionName name;

	@Override
	public String toString() {
		return "Position [iD=" + iD + ", name=" + name + "]";
	}

	public Position(PositionName name) {
		super();
		COUNT++;
		this.iD = COUNT;
		this.name = name;
	}

	public Position() {
		// TODO Auto-generated constructor stub
	}

}
