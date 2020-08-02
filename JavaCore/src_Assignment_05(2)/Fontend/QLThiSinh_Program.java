package Fontend;
import java.util.Scanner;

import Backend.QLThiSinh;

public class QLThiSinh_Program {

	public static void main(String[] args) {
		question5();

	}
	private static void question5() {

		QLThiSinh thisinh = new QLThiSinh();
		Scanner scanner = new Scanner(System.in);

		int choose;

		do {
			loadMenu();
			choose = scanner.nextInt();

			switch (choose) {

			case 1:
				thisinh.themThiSinh();
				break;

			case 2:
				thisinh.hienThiSinh();
				break;

			case 3:
				thisinh.timThiSinh();
				break;

			case 4:
				break;

			default:
				System.out.println("Nhập sai ! Vui lòng nhập lại !");
				break;
			}

		} while (choose != 4);

		scanner.close();
	}

	private static void loadMenu() {
		System.out.println("");
		System.out.println("1. Thêm mới thí sinh");
		System.out.println("2. Hiện thông tin thí sinh");
		System.out.println("3. Tìm kiếm theo số báo danh  ");
		System.out.println("4. Thoát                     ");
		System.out.println("");
	}
}
