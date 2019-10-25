package test.access;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("input number1?");
		int number1 = s.nextInt();
		System.out.println("operator?");
		String operator = s.next();
		System.out.println("input number2?");
		int number2 = s.nextInt();
		/*if(operator.equals("+")) {
			answer = number1+number2;
		}
		if(operator.equals("x") || operator.equals("X")|| operator.contentEquals("*")) {
			answer = number1*number2;
		}
		if(operator.equals  ("-")) {
			answer = number1-number2;
		}
		if(operator.equals( "/")) {
			answer = number1/number2;
		}
		if(operator.contentEquals("%")) {
			answer = number1%number2;
		
		}*/
		int answer = 0;
		switch(operator) {
		case "+":answer = number1+number2; break;
		case "*":answer = number1*number2; break;
		case "-":answer = number1-number2; break;
		case "/":answer = number1/number2; break;
		case "%":answer = number1%number2; break;
		}
		if(answer == 0) {
			System.out.println("error");
		}
		else
		{
			System.out.println(answer);
		}
	}

}
