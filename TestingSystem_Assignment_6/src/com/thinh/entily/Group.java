package com.thinh.entily;

import java.time.LocalDate;

import com.thinh.utils.ScannerUtils;

public class Group {
	public static int COUNT = 0;
	public int id;
	public String name;
	public Account creatorId;
	public LocalDate joinDate;
	public Account[] accounts;

	public Group(String name, Account creatorId, LocalDate joinDate) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.creatorId = creatorId;
		this.joinDate = joinDate;
	}

	public Group() {
		super();
		COUNT++;
		this.id = COUNT;
		System.out.println("Nhâp tên Group");
		this.name = ScannerUtils.inputString();
		this.creatorId = creatorId;
		this.joinDate = ScannerUtils.inputLocalDate();
		System.out.println("Bạn có muốn thêm Account vào Group hay không (1-Có | 2- Không)");
		inputAccounttoGroup();
	}


	public void thongTinGroup() {
		System.out.println("Thông tin Group");
		System.out.println("Group [id=" + id + ", name=" + name + ", creatorId=" + creatorId + ", joinDate=" + joinDate + "]");
//		return "Group [id=" + id + ", name=" + name + ", creatorId=" + creatorId + ", joinDate=" + joinDate + "]";
		if(accounts !=null) {
			System.out.println("Số lượng Acc của group này là" + accounts.length);
			for (Account account : accounts) {
				System.out.println(account.toString());
			}
		}
	}

	public void inputAccounttoGroup() {
		int choose;
		while (true) {
			choose = ScannerUtils.inputInt();
			
			switch (choose) {

			case 1:
				System.out.println("Mời nhập số lượng Acc muốn thêm vào Group");
				inputAcc();
			case 2:
				return;
			default:
				System.out.println("Nhập lại");
				break;
			}
		}
		
	}

	public void inputAcc() {
		// đây là trường hợp tạo mới 1 Acc
		// Cách này tham khảo ở đáp án
		// trong trường hợp có sẵn 1 danh sách Account và chỉ cần add Account đó vào
		int count;
		while (true) {
			count = ScannerUtils.inputInt();
			Account[] accounts = new Account[count];
			for (int i = 0; i < accounts.length; i++) {
				System.out.println("Nhập vào Acc thứ tự :" + (i + 1));
				Account account = new Account();
				accounts[i] = account;
			}
			this.accounts = accounts;
			return;
		}
	}
	


}
