package com.vti.entity;

import java.util.Scanner;

public class TapChi extends TaiLieu{

	private int soPhatHanh;
	private byte thangPhatHanh;

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public byte getThangPhatHanh() {
		return thangPhatHanh;
	}

	@Override
	public void ThemTaiLieu() {
		super.ThemTaiLieu();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số phát hành: ");
		soPhatHanh = scanner.nextInt();

		System.out.println("Nhập tháng phát hành: ");
		thangPhatHanh = scanner.nextByte();
	}

	@Override
	public void InTaiLieu() {
		super.InTaiLieu();

		System.out.println("Số phát hành: " + soPhatHanh);
		System.out.println("Tháng phát hành: " + thangPhatHanh);
	}
}
