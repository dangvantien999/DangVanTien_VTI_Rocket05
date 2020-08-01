package com.vti.entity;

import java.util.Scanner;

public class NhanVien extends CanBo  {
	
	private String congViec;

	public String getCongViec() {
		return congViec;
	}
	
	public void ThemCanBo() {
		super.ThemCanBo();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập Công Việc :");
		congViec = scanner.nextLine();
	}
	
	public void InCanBo() {
		super.InCanBo();
		
		System.out.println("Công Việc : "+congViec);
	}
}
