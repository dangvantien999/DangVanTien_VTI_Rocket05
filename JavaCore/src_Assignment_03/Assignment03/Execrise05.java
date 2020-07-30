package Assignment03;

//import java.util.Date;

public class Execrise05 {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Department[] departments = new Department[5];

		Department department1 = new Department();
		department1.departmentID = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.name = "IT";

		Department department4 = new Department();
		department4.departmentID = 4;
		department4.name = "Kế Toán";

		Department department5 = new Department();
		department5.departmentID = 5;
		department5.name = "Tài Chính";

		departments[0] = department1;
		departments[1] = department2;
		departments[2] = department3;
		departments[3] = department4;
		departments[4] = department5;

		question1(department1);
		question2(departments);
		question3(department1);
		question4(department1);
		question5(department1, department2);

	}


	public static void question1(Department department) {
		System.out.println(department);
	}


	public static void question2(Department[] departments) {
		for (Department department : departments) {
			System.out.println(department);
		}
	}


	public static void question3(Department department) {
		System.out.println(department.hashCode());
	}


	public static void question4(Department department) {
		if (department.name.equals("Phòng A")) {
			System.out.println("Có tên là phòng A");
		} else {
			System.out.println("Không tên là phòng A");
		}
	}


	public static void question5(Department department1, Department department2) {
		if (department1.equals(department2)) {
			System.out.println("Có bằng nhau !");
		} else {
			System.out.println("Không bằng nhau !");
		}
	}
}
