package Class;

import java.util.Scanner;

public class Question7 {
	
	private static Scanner scanner = new Scanner(System.in);
	

	public static String inputAge(String errorMessage) {
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
					  System.out.println (errorMessage);

			 }  
		}
	}
	/*
	public static String inputInt(String errorMessage) {
		while (true) {
			try {
				return scanner.nextLine();
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}*/

}
