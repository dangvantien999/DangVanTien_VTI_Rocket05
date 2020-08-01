package com.vti.entity;

import java.util.Scanner;

public class KySu extends CanBo{
	
	private String nganhDaoTao;


	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	

	public void ThemcanBo() {
		super.ThemCanBo();
		
		Scanner sanner = new Scanner(System.in);
		System.out.println("Nhập vào ngành đào tạo");
	}
	
	
	public void InCanBo() {
		super.InCanBo();
		
		System.out.println("Ngành đào tạo : "+nganhDaoTao);
	}
}