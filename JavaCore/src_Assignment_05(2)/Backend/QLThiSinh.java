package Backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Class.ThiSinh;

public class QLThiSinh implements ITuyenSinh {

	private Scanner scanner;

	private List<ThiSinh> ThiSinhs;

	public QLThiSinh() {
		ThiSinhs = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	@Override
	public void themThiSinh() {
		System.out.println("Nhập số thí sinh muốn nhập: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			ThiSinh thisinh = new ThiSinh();
			thisinh.nhap();
			ThiSinhs.add(thisinh);
		}
	}

	@Override
	public void hienThiSinh() {
		for (ThiSinh thisinh : ThiSinhs) {
			System.out.println(thisinh);
		}
	}

	@Override
	public void timThiSinh() {

		System.out.println("Nhập sbd cần tìm: ");
		String sbd = scanner.nextLine();

		for (ThiSinh thisinh : ThiSinhs) {
			if (thisinh.getSbd().equals(sbd)) {
				System.out.println(thisinh);
			}
		}
	}
}
