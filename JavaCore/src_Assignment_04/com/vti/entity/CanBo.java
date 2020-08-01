package com.vti.entity;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;

	public String getHoTen() {
		return hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}
	
	public void ThemCanBo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập Họ Tên :");
		hoTen = scanner.nextLine();
		
		System.out.println("Mời Nhập Tuổi");
		tuoi = scanner.nextInt();
		
		System.out.println("Mời Nhập Giới Tính Là Nam Hoặc Nữ");
		gioiTinh = scanner.nextLine();
		
		System.out.println("Mời Nhập Địa Chỉ");
		diaChi = scanner.nextLine();
	}
	
	public void InCanBo() {
		System.out.println("Họ Tên : "+ hoTen);
		System.out.println("Tuổi ;"+ tuoi);
		System.out.println("Giới Tính : "+ gioiTinh);
		System.out.println("Địa Chỉ : "+ diaChi);
	}
	
	
	
	
	
	
	
	
	
	
	
}