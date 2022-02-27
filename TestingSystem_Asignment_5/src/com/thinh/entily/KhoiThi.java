package com.thinh.entily;

public class KhoiThi {
	private String khoi;
	private String boMon;

	public KhoiThi(String khoi) {
		this.khoi = khoi;
	}

	public String getKhoi() {
		return khoi;
	}



	public String getBoMon() {
		switch (this.khoi) {
		case "A":
			this.boMon = "Toán, Lý,Hóa";
			break;
		case "B":
			this.boMon = "Toán,Hóa,Sinh";
			break;
		case "C":
			this.boMon = "Văn, Sử,Địa";
			break;

		}
		return boMon;
	}

}
