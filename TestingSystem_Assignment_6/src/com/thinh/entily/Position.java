package com.thinh.entily;

import java.util.Scanner;

import com.thinh.utils.ScannerUtils;

public class Position {
	public static byte COUNT;
	private byte id;
	private PositionName positionName;

	public Position(PositionName positionName) {
		super();
		COUNT++;
		this.id = COUNT;
		this.positionName = positionName;
	}

	public Position() {
		super();
		COUNT++;
		this.id = COUNT;
		System.out.println("Chọn vị trí (1-Dev | 2-Test | 3-Scrum_Master | 4 - PM)");
		int choise;
		while (true) {
			 choise = ScannerUtils.inputInt();
				switch (choise) {
				case 1:
					this.positionName = PositionName.DEV;
					return;
				case 2:
					this.positionName = PositionName.TEST;
					return;
				case 3:
					this.positionName = PositionName.SCRUM_MASTER;
				case 4:
					this.positionName = PositionName.PM;
					return;

				default:
					System.err.println("Mời chọn lại");
					
				}
			}
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", positionName=" + positionName + "]";
	}
		

}
