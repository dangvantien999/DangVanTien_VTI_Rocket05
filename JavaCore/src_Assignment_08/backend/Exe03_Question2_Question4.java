package backend;

import java.util.HashMap;
import java.util.Map;

public class Exe03_Question2_Question4 {
	public void question2() {

		Map<Integer, String> parameter = new HashMap<Integer, String>() ;

		parameter.put(1, "Đặng Văn Tiến");
		parameter.put(2, "Ngô Thanh Tâm");
		parameter.put(3, "Nguyễn Thành Đạt");
		
		print(parameter.get(1));
		print(parameter.get(2));
		print(parameter.get(3));

	}
	public void question4() {
		Integer[] arrInt = { 5, 10, 15 };
		Float[] arrFloat = { 6f, 5f, 15f };
		Double[] arrDouble = { 5.2, 2.6, 6.9 };

		// print array
		printarray(arrInt);
		printarray(arrFloat);
		printarray(arrDouble);
	}

	private <T> void print(T a) {
		System.out.println(a);
	}
	private <T> void printarray(T[] arr) {
		for (T x : arr) {
			System.out.println(x);
		}
	}
}
