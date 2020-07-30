package Assignment03;

import java.util.Date;

public class Execrise02 {

	public static void main(String[] args) {
		Account[] accounts = new Account[6];

		// insert account
		for (int i = 0; i < accounts.length ; i++) {
			accounts[i] = new Account();
			accounts[i].accountID = i+1;
			accounts[i].createDate = new Date(2020, 03, 17);
		//	accounts[i].department = ;
			accounts[i].email = "tytien1999@gmail.com_"+(i+1);
			accounts[i].fullname = "Đặng Văn Tiến_"+(i+1);
		//	accounts[i].position = "DEV";
			accounts[i].username = "tien_"+(i+1);
		}

		// print accounts
		for (Account account : accounts) {
			System.out.println("ID của nhân viên : "+ account.accountID);
			System.out.println("User của nhân viên : "+ account.username);
			System.out.println("Tên của nhân viên : "+ account.fullname);
			System.out.println("Ngày lập account : "+ account.createDate);
		}
	}

}
