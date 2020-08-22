package backend;

import java.util.Date;

import entity.Student;

public class Annotations {
	
	public static void quesiton1() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2020, 4, 29);
		System.out.println(date);
	}

	public void Question2() {
		Student student = new Student();
		student.setId(1);
		student.setName("Nguyễn Văn A");
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		System.out.println(student.getIdV2());
	}
}
