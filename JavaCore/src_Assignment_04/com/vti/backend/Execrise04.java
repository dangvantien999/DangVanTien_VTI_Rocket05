package com.vti.backend;

import com.vti.entity.Student;

public class Execrise04 {


	public void Question1() {
		Student student1 = new Student("Đặng Văn Tiến", "Hà Nội");
		student1.setDiem(5);
		
		Student student2 = new Student("Ngô Thanh Tâm", "Thanh Hóa");
		student1.setDiem(8);
		
		Student student3 = new Student("Đỗ Xuân Vĩnh", "Thái Bình");
		student1.setDiem(6);
		
		Student student4 = new Student("Nguyễn Thành Đạt", "Hà Nội");
		student1.setDiem(1);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
	}
}
