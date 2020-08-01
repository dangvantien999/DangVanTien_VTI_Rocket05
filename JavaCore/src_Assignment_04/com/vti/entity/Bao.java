package com.vti.entity;

import java.util.Scanner;

public class Bao extends TaiLieu{

	private String ngayPhatHanh;

	@Override
	public void ThemTaiLieu() {
		super.ThemTaiLieu();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập ngày phát hành: ");
		ngayPhatHanh = scanner.nextLine();
	}

	@Override
	public void InTaiLieu() {
		super.InTaiLieu();

		System.out.println("Ngày phát hành: " + getNgayPhatHanh());
	}

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

}
