package lab06;

import java.util.Scanner;

public class Lab6 {

	Scanner s = new Scanner(System.in);

	public int getInt() {
		return s.nextInt();
	}

	public String getString() {
		return s.nextLine();
	}

	public void part1() {
		grades();

	}

	public void grades() {
		String names[] = new String[5];
		int marks[] = new int[5];

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Please enter students name");
			names[i] = getString();
			
			System.out.println("Please enter students grade");
			marks[i] = getInt();
			s.nextLine();
		}

		for (int i = 0; i < names.length; i++) {
			int grade = marks[i];
			System.out.println("Students name is: " + names[i]);
			System.out.println("Students mark is: " + grade);
			if (grade < 1 || grade > 100) {
				System.out.println("Error: marks must be between 1 and 100");
				return;
			} else if (grade < 50) {
				System.out.println("Students grade is: fail");
			} else if (grade >= 50 && grade <= 60) {
				System.out.println("Students grade is: pass");
			} else if (grade >= 61 && grade <= 70) {
				System.out.println("Students grade is: merit");
			} else if (grade >= 71 && grade <= 100) {
				System.out.println("students grade is: distinction");
			}
			
			
			
			
		
		}
	}
}