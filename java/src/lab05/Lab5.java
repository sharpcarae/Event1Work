package lab05;

import java.util.Scanner;

public class Lab5 {
	
		Scanner s = new Scanner(System.in); 
		
		public int getInt() {
			return s.nextInt();
		}
		public String getString() {
			return s.nextLine();
		}
//public void grades() {
//	System.out.println("Please input a grade?");
//	int grade = getInt();
//	s.nextLine();
//	if (grade < 1 || grade > 100) {
//		System.out.println("Error: marks must be between 1 and 100");
//		return;
//	}
//	else if ( grade < 50) {
//			System.out.println("fail");
//	}
//	else if ( grade >= 50 && grade <= 60) {
//		System.out.println("pass");
//	}
//	else if ( grade >= 61 && grade <= 70) {
//		System.out.println("merit");
//	}
//	else if ( grade >= 71 && grade <= 100) {
//		System.out.println("distinction");
//	}
//}

public void part2() {
	boolean answerSummer = true;
	boolean answerEvening = true;
			
	System.out.println("Is it summer time?");
	String summer = getString();
//	s.nextLine();
	System.out.println("Is it evening time?");
	String evening = getString();
	if (summer.equals("no")) {
		 answerSummer = false;
	}
	if (evening.equals("no")) {
		answerEvening = false;
	}
	System.out.println(answerSummer + " "+ answerEvening);
	
	if (answerSummer == true && answerEvening == true) {
		System.out.println("Action: Take a Shower");
		System.out.println("Action: Eat outside");
		System.out.println("Action: Do outdoors hobby");
		System.out.println("Action: Contact friends");
		
	}
	else if (answerSummer == true && answerEvening == false) {
		System.out.println("Action: Take a Shower");
		System.out.println("Action: Do outdoors hobby ");
		System.out.println("Action: Eat inside");
		System.out.println("Action: Contact friends");
	}
	else if (answerSummer == false && answerEvening == true) {
		System.out.println("Action: Take a Shower");
		System.out.println("Action: Take a walk");
		System.out.println("Action: Eat inside");
		System.out.println("Action: Contact Friends");
	}
	else {
		System.out.println("Action: Take a shower");
		System.out.println("Action: Eat inside");
		System.out.println("Action: Contact friends");
	}
//	if (answerSummer == true && answerEvening == true) {
//		System.out.println("Action: Take a shower, Eat Outside, Do outdoors hobby and Contact Friends");
//	}
//	else if (answerEvening == true && answerSummer == false) {
//		System.out.println("Action: Take a shower, Eat Inside, Take a Walk, Contact Friends");
//	}
//	else if (answerEvening == false && answerSummer == true) {
//		System.out.println("Action: Take a shower, Eat Inside, Do outdoors hobby, Contact Friends");
//	}
//	else if (answerEvening == false && answerSummer == false) {
//		System.out.println("Action: Take a shower, Eat inside, Contact Friends");
//	}
}}
//
