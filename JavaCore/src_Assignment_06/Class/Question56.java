package Class;

import java.util.Scanner;

public class Question56 {
	private static Scanner scanner = new Scanner(System.in);
	

	public static int inputAge() {
		while (true) {
			System.out.println("Mời nhập tuổi :");
			String age = scanner.nextLine();
			  try { 
				    if (Integer.parseInt(age) > 0) {
				    	System.out.println("Tuổi của bạn là :" + Integer.parseInt(age));
					}else {
						System.out.println("Tuổi phải lơn hơn 0");
					}
				  } catch(NumberFormatException e){  
				    System.out.println("Wrong inputing! Please input an age as int, input again.");  
			 }  
		}
	}

}
