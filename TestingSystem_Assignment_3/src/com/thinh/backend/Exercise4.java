package com.thinh.backend;

import java.util.Scanner;

public class Exercise4 {
	ChuanHoaChuoi chuanHoaChuoi = new ChuanHoaChuoi();
	static Scanner scanner = new Scanner(System.in);

	public void question1() {
		String q1 = "Chỉ số VNINDEX";
		System.out.println(q1.length());
	}

	public void question2() {
		String s1 = " Chỉ số VNINDEX ";
		String s2 = " Tôi rất thích ";
		String s3 = s2 + s1;
		System.out.println(s3);
	}

	public void question3() {
		System.out.println("Nhập vào tên của bạn");
		chuanHoaChuoi.nhapChuoi();
		chuanHoaChuoi.chuanHoa();
		System.out.println("Tên với định dạng đúng của bạn là :");
		chuanHoaChuoi.hienThi();
	}

	public void question4() {
		System.out.println("Nhập vào tên của bạn");
		String name = scanner.nextLine();
		name = name.trim().toUpperCase();
		name = name.replaceAll("\\s+", "");
		String[] temp = name.split("");
		for (String string : temp) {
			System.out.println(string);
		}
	}

	public void question5and7() {
		System.out.println("Mời nhập họ :");
		String firstName = chuanHoaChuoi.nhapChuoi();
		firstName = chuanHoaChuoi.chuanHoa();

		System.out.println("Nhập tên đệm :");
		String middleName = chuanHoaChuoi.nhapChuoi();
		middleName = chuanHoaChuoi.chuanHoa();

		System.out.println("Nhập tên của bạn");
		String lastName = chuanHoaChuoi.nhapChuoi();
		lastName = chuanHoaChuoi.chuanHoa();

		System.out.println("Họ tên của bạn là : " + firstName + " " + middleName + " " + lastName);
	}

	public void question6() {
		System.out.println("Mời nhập vào Họ tên của bạn");
		String fullName = chuanHoaChuoi.nhapChuoi();
		fullName = fullName.trim();
		fullName = fullName.replaceAll("\\s+", " ");
		String[] temp = fullName.split(" ");
		String ho = temp[0];
		String ten = temp[temp.length - 1];
		String temDem = "";
		for (int i = 1; i < temp.length - 1; i++) {
			temDem += temp[i] + " ";
		}
		System.out.println("Họ của bạn là :" + ho);
		System.out.println("Tên đệm của bạn là :" + temDem);
		System.out.println("Tên của bạn là :" + ten);
	}

	public void question8() {
		String[] group = {"Java là gì","Trang Java PRoMax","SQL","Fronend"};
		// Hàm tìm kiếm theo ký tự chuỗi là contain
		for (String string : group) {
			if(string.contains("Java")) {
				System.out.println(string);
			}
		}
	}
public void question9() {
	String[] groups = {"Java","C#","SQL"};
	for (String string : groups) {
		if(string.equals("Java")) {
			System.out.println(string);
		}
	}
}
public void question10() {
	String q10 = chuanHoaChuoi.nhapChuoi();
	String q102 = chuanHoaChuoi.nhapChuoi();
	String q103 = "";
	for(int i =  q10.length() -1; i>=0;i-- ) {
		q103 += q10.substring(i,i+1);
	}
	System.out.println(q103);
	if(q102.equals(q103)) {
		System.out.println("Đây là chuỗi đảo ngược");
	}else {
		System.out.println("Đây không phải là chuỗi đảo ngược");
	}
}
public void question11() {
	String chuoi;
	char kyTu = 'a';
	int count = 0;
	System.out.println("Nhập vào chuỗi bất kỳ");
	chuoi = scanner.nextLine();
	for (int i = 0; i < chuoi.length(); i++) {
		if(chuoi.charAt(i)==kyTu) {
			count++;
		}
		
	}
	System.out.println("Số lần xuất hiện của " + kyTu + "trong chuỗi" + 
	chuoi + " = " + count);
	
}
public void question12() {
	String q12 = "Chỉ số VNINDEX";
	String q122 = "";
	for(int i = q12.length() -1; i>=0; i--) {
		q122 += q12.substring(i,i+1);
	}
	System.out.println(q122);
	// Cách 2 = Sử dụng StringBuilder
//	String q12 = "Chỉ số VNINDEX";
//	StringBuilder stringBuilder = new StringBuilder(q12);
//	System.out.println(stringBuilder.reverse().toString());
}
public void question13() {
	System.out.println("Nhập vào chuỗi bất kỳ");
	String q13 = chuanHoaChuoi.nhapChuoi();
	char kyTu = '*';
	q13 = q13.trim().toLowerCase();
	q13 = q13.replaceAll("[0-9]+", "*");
	for(int i = 0; i < q13.length(); i++) {
		if(q13.charAt(i)==kyTu) {
			System.out.println("False");
			return;
		}
		
	}
	System.out.println("True");
}
public void question14() {
	System.out.println("Nhập vào chuỗi");
	String q14 = chuanHoaChuoi.nhapChuoi();
	String replaceq14 = q14.replace("e", "*");
	System.out.println("Chuỗi sau khi bị thay thế là : " + "\n"+ replaceq14);
}
public void question15() {
	System.out.println("Nhập vào chuỗi cần đảo ngược");
	String q16 = chuanHoaChuoi.nhapChuoi();
	q16 = q16.replaceAll("\\s+", " ");
	String q162 = "";
	for(int i = q16.length() -1; i>=0;i--) {
		q162 += q16.substring(i,i+1);
	}
	System.out.println("Chuỗi sau khi đảo ngược là : " + q162);
}
public void question16() {
	System.out.println("Nhập chuỗi bất kỳ");
	String chuoi = chuanHoaChuoi.nhapChuoi();
	System.out.println("Nhập số nguyên");
	int i = scanner.nextInt();
	if(chuoi == null || chuoi.isEmpty() || chuoi.length() % i !=0) {
		System.out.println("False");
		return;
	}
	for (int j = 0; j < chuoi.length(); j+=i) {
		System.out.println(chuoi.substring(j,j+i));
		
	}
}
}
