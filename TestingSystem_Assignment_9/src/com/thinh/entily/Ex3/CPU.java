package com.thinh.entily.Ex3;

public class CPU {
	private double price;

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		
	}
	public CPU(double price) {
		super();
		this.price = price;
	}
//* CHÚ Ý VỚI INNER CLASS MUỐN SỬ DỤNG CẦN ĐẶT PUBLIC
	 public class Processor {
		private byte coreAmount;
		private String menufacturer;
		
		public Processor(byte coreAmount, String menufacturer) {
			super();
			this.coreAmount = coreAmount;
			this.menufacturer = menufacturer;
		}
		public Double getCache() {
			return 4.3;
		}
	}
	public class Ram{
		private short memory;
		private String menufacturer;
		public Ram(short memory, String menufacturer) {
			super();
			this.memory = memory;
			this.menufacturer = menufacturer;
		}
		public Double getClockSpeed() {
			return 5.5;
		}
	}
}
