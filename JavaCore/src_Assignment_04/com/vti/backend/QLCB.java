package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.CanBo;
import com.vti.entity.NhanVien;
import com.vti.entity.KySu;
import com.vti.entity.CongNhan;


public class QLCB {
	
	private List<CanBo> canbos;

	public QLCB() {
		canbos = new ArrayList<>();
	}

	public void ThemCanBo() {
		int n;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số tài liệu mà bạn muốn nhập:  ");
		n = scanner.nextInt();

		byte choose;
		CanBo canbo = new CanBo();
		for (int i = 0; i < n; i++) {

			System.out.println("Bạn muốn nhập 1 : Công Nhân ");
			System.out.println("Bạn muốn nhập 2 : Nhân viên ");
			System.out.println("Bạn muốn nhập 3 : Kỹ Sư ");
			choose = scanner.nextByte();

			switch (choose) {
			case 1:
				canbo = new CongNhan();
				break;
			case 2:
				canbo = new NhanVien();
				break;
			case 3:
				canbo = new KySu();
				break;
			default:
				System.out.println("Nhập sai !");
				i--;
				break;
			}
			canbo.ThemCanBo();
			canbos.add(canbo);
		}
	}


	public void XoaCanBo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập mã tài liệu cần xóa: ");
		String hoTen = scanner.nextLine();

		for (CanBo canbo : canbos) {
			if (hoTen == canbo.getHoTen()) {
				canbos.remove(canbo);
			}
		}
	}


	public void InCanBo() {
		for (CanBo canbo : canbos) {
			canbo.InCanBo();
		}
	}


	public void TimCanBo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập Tên cán bộ : ");
		String hoTen = scanner.nextLine();
		
		for (CanBo canbo : canbos) {
			if (hoTen == canbo.getHoTen()) {
				canbo.InCanBo();
			}
		}
		
	}
	public void Thoat() {
		
	}

}












