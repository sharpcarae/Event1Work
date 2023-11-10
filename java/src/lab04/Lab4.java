package lab04;

import java.util.Scanner;

public class Lab4 {
	Scanner s = new Scanner(System.in); 
	
	public int getInt() {
		return s.nextInt();
	}
	
public void part1() {
	System.out.println("Price of a bag please?");
	int bag = getInt();
	s.nextLine();
	System.out.println("How much money do you have?");
	int money = getInt();
	if (bag <= 0 || money <= 0) {
		System.out.println("Invalid values, try again.");
		return;
	}
	int numBag = money/bag;
	System.out.println("If the price is "+bag+"p and you have "+money+"p then you will be able to buy "+ numBag +" bags.");
}

}
