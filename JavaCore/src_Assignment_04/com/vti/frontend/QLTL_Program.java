package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.QLTL;

public class QLTL_Program {

	public static void main(String[] args) {
		question4();
	}

	private static void menuQuestion4() {
		System.out.println("1. Thêm tài liệu ");
		System.out.println("2. Hiện tài liệu");
		System.out.println("3. Tìm tài liệu ");
		System.out.println("4. Xóa tài liệu ");
		System.out.println("0. Thoát  ");
		System.out.println("");
	}

	public static void question4() {
		QLTL qltl = new QLTL();

		int dem;
		do {
			menuQuestion4();

			Scanner scanner = new Scanner(System.in);

			dem = scanner.nextByte();
			switch (dem) {
			case 1:
				qltl.inputTaiLieu();
				break;
			case 2:
				qltl.printTaiLieu();
				break;
			case 3:
				qltl.TimTaiLieu();
				break;
			case 4:
				qltl.deleteTaiLieu();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhập sai ! Nhập lại !");
				break;
			}
		} while (dem != 0);
	}

}
