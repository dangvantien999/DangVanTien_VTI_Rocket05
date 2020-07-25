import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);

		// Q1.
		System.out.println("Moi ban nhap vao 3 so nguyen duong ");
		for (int i = 0; i < 3; i++) {
			int x = scanner.nextInt();
			System.out.println("Ban da nhap: " + x + "\n");
		}

		// Q2.
		System.out.println("Moi ban nhap vao 2 so thuc");
		for (int i = 0; i < 2; i++) {
			double d = scanner.nextDouble();
			System.out.println("Ban da nhap: " + d + "\n");
		}

		// Q3.
		System.out.println("Moi ban nhap vao ho");
		String s1 = scanner.next();
		System.out.println("Moi ban nhap vao ten");
		String s2 = scanner.next();
		System.out.println("Ten ban da nhap: " + s1 + " " + s2 + "\n");

		// Q4.
		System.out.println("Moi nhap vao ngay sinh");
		String dob = scanner.next();
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = dateFormat.parse(dob);
		System.out.println("Input: " + date);

		// Q7.
		System.out.println("Moi ban nhap vao 1 so chan");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("Input: " + number);
		} else {
			System.out.println("Nhap sai");
		}

	}
}