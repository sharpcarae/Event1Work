package lab03;

import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("What main dish would you like? Fish, Burger or veg");
		String mainCourse = getString(s);
		s.nextLine();
		
		System.out.println("How many roast potatoes would you like");
		int potatoes = getInt(s);
		s.nextLine();
		System.out.println("How many brussel sprouts would you like");
		int brussels = getInt(s);
		s.nextLine();
	System.out.println("Hello, your lunch is: "+ mainCourse +" with " + potatoes +" roast potatoes and "+brussels+" brussel sprouts");
		
		
	
	}
	public static int getInt(Scanner s) {
		return s.nextInt();
	}
	public static String getString(Scanner s) {

		return s.nextLine();
			
	}
	public static String theLunchQueue(Scanner s) {
		String mainCourse;
		getString(s);
		mainCourse = s.nextLine();
		return mainCourse;
	
	}

	
}
