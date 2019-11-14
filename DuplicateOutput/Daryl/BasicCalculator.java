package Daryl;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type the first number.");
		double firstNumberInput = s.nextInt();
		System.out.println("Type the operator.");
		String operatorInput = s.next();
		System.out.println("Type the second number.");
		double secondNumberInput = s.nextInt();
		
		BasicCalculatorSub bc = new BasicCalculatorSub();
		bc.setFirstNumber(firstNumberInput);
		bc.setSecondNumber(secondNumberInput);
		bc.setOperator(operatorInput);
		
		bc.calculate();
		
	}
	
}
