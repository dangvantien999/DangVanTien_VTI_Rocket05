package Main;

import Class_Abstract.VietnamesePhone;

public class Demo {

	public static void main(String[] args) {
		VietnamesePhone VietNam = new VietnamesePhone();
		VietNam.insertContact("Đặng văn Tiến", "0966406033");
		VietNam.insertContact("Ngô Thanh Tâm", "0966535989");
		VietNam.insertContact("Nguyễn Thành Đạt", "0896531144");
		
		VietNam.removeContact("Ngô Thanh Tâm");
		
		VietNam.searchContact("Đặng Văn Tiến");
		
		VietNam.updateContact("Nguyễn Thành Đạt", "03465555xxx");

	}

}
