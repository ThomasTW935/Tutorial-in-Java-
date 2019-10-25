package test.access;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String operator;
		System.out.println("First Number: ");
		int num1 = s.nextInt();
		System.out.println("Select Operator +,-,*,/,%");
		operator = s.next();
		System.out.println("Second Number: ");
		int num2 = s.nextInt();
		Operations op = new Operations();
		int output = op.Calculate(num1, num2, operator);
		System.out.println(output);
	}

}
