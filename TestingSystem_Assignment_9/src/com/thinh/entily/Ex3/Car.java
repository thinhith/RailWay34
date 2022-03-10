package com.thinh.entily.Ex3;

public class Car {
	private String name;
	private String style;

	public Car(String name, String style) {
		super();
		this.name = name;
		this.style = style;
	}
	public class Engine{
		private String engineType;

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public Engine(String engineType) {
			super();
			this.engineType = engineType;
		}
		
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", style=" + style + "]";
	}
	
}
