package Daryl;

import java.util.Scanner;

public class InterestCalculator {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		InterestCalculatorSub it = new InterestCalculatorSub();
		System.out.println("What did you buy?");
		it.setItemName(s.nextLine());
		System.out.println("What is the price?");
		it.setItemPrice(s.nextDouble());
		System.out.println("How many percent(%) is the interest?");
		it.setInterestPercent(s.nextInt());
		System.out.println("How long for full payment?");
		it.printInterest();
	}

}
