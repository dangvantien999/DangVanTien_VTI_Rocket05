package Assignment03;

public class Execrise03 {

	public static void main(String[] args) {

		Question1();
		Question2();
		 Question3();
	}

	public static void Question1() {
		Integer Question1 = 5000;
		System.out.printf("%10.2f", (float) Question1);
		System.out.println("");
	}

	public static void Question2() {
		String Question2 = "34582";
		Integer x = Integer.parseInt(Question2);
		System.out.println(x);
		
	}


	public static void Question3() {
		Integer a = 60895;
		int b = a.intValue();
		System.out.println(b);
	}
}
