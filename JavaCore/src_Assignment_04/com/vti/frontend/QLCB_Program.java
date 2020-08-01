package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.QLCB;

public class QLCB_Program {

	public static void main(String[] args) {
		
		question1_2();
	}
	
	private static void menuQuesion1_2() {
		System.out.println("");
		System.out.println("1. Thêm cán bộ");
		System.out.println("2. Hiện cán bộ");
		System.out.println("3. Tìm cán bộ  ");
		System.out.println("4. Xóa cán bộ ");
		System.out.println("0. Thoát      ");
		System.out.println("");
	}

	public static void question1_2() {
		QLCB qlcb = new QLCB();

		byte choose;
		do {
			menuQuesion1_2();
			Scanner scanner = new Scanner(System.in);

			choose = scanner.nextByte();
			switch (choose) {
			case 1:
				qlcb.ThemCanBo();
				break;
			case 2:
				qlcb.InCanBo();
				break;
			case 3:
				qlcb.TimCanBo();
				break;
			case 4:
				qlcb.XoaCanBo();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhập sai ! Nhập lại !");
				break;
			}
		} while (choose != 0);

	}
}
