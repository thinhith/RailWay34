package com.thinh.entily3;

public class HHException extends Exception {
	public HHException() {
		super("Số lượng hình học vượt quá cho phép là :" + Configs.SO_LUONG_HINH_TOI_DA);
	}
}
