package frontend;

import backend.Exe01_Question2;
public class Program01 {

	public static void main(String[] args) {
		Exe01_Question2 exe1_Q2 = new Exe01_Question2();
		System.out.println("Danh Sách Học Sinh Đăng Ký Sớm Đến Muộn");
		System.out.println("");
		exe1_Q2.HocSinh_SomMuon();
		System.out.println("=======================================");
		
	
		System.out.println("Danh Sách Học Sinh Đăng Ký Muộn Đến Sớm");
		System.out.println("");
		
		exe1_Q2.HocSinh_MuonSom();
		}
	

}
