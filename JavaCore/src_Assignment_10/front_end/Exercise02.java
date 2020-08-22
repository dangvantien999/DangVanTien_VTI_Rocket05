package front_end;

import java.util.Scanner;

import backend.DepartmentBackend;
import entity.Department;

public class Exercise02 {

	public static void main(String[] args) throws Exception {
			
		Scanner scanner = new Scanner(System.in);
			System.out.println("Input department id: ");
			int id = scanner.nextInt();

			Department department = new DepartmentBackend().getDepartmentByID(id);
			System.out.println(department);
		}



}
