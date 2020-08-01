package com.vti.entity;

import java.util.Scanner;

public class CongNhan extends CanBo {
	

	private int bac;


	public int getBac() {
		return bac;
	}
	
	public void ThemCanBo() {
		super.ThemCanBo();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập Bậc: ");
		bac = scanner.nextInt();

	}

	@Override
	public void InCanBo() {
		super.InCanBo();

		System.out.println("Bậc của công nhân: " + bac);
	}

}
