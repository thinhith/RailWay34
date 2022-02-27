package com.thinh.backend;

import java.io.DataInputStream;
import java.util.Scanner;

public class ChuanHoaChuoi {
	private String st;

	public ChuanHoaChuoi(String s) {
		st = s;
	}

	public ChuanHoaChuoi() {
	};

	// Ham nhập String từ bàn phím sử dụng try catch
	String nhapString() {
		String x;
//		DataInputStream ip = new DataInputStream(System.in);
		Scanner ip = new Scanner(System.in);
		try {
//			x = ip.readLine();
			x = ip.nextLine();
		} catch (Exception e) {
			System.out.println("Mời nhập lại !");
			x = nhapString();
		}
		return x;
	}

	public String nhapChuoi() {
return st = nhapString();
	}

	public String chuanHoa() {
		// .trim là cắt khoẳng trắng đầu và cuối
		st = st.trim().toLowerCase();

		// \\s+ là đại diện cho các khoảng trắng liên tiếp nhau
		st = st.replaceAll("\\s+", " ");

		/*
		 * split là thao tác tách các chuỗi thành các chuỗi con dựa vào ký tự truyền vào
		 */
		String[] temp = st.split(" ");
		// sau khi tách xong thì gán st thành rỗng
		st = "";
		for (int i = 0; i < temp.length; i++) {
			st += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
			if (i < temp.length - 1) {
				st += " ";
			}
		}
		return st;
	}

	public String hienThi() {
		System.out.println(st);
		return st;
	}
}
