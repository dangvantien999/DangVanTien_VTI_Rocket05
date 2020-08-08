package backend;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exe01_Question2 {
	
	public void HocSinh_MuonSom() {

		Stack<String> student = new Stack<String>();
		student.push("Trần Văn Nam");
		student.push("Nguyễn Văn A");
		student.push("Nguyễn Văn Nam");
		student.push("Nguyễn Văn Huyên");

		


		System.out.println(student.pop());
		System.out.println(student.pop());
		System.out.println(student.pop());
		System.out.println(student.pop());

	}
	
	public void HocSinh_SomMuon() {
		Queue<String> students = new LinkedList<String>();
		students.add("Nguyễn Văn A");
		students.add("Trần Văn Nam");
		students.add("Nguyễn Văn Huyên");
		students.add("Nguyễn Văn Nam");

		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
	}

}
