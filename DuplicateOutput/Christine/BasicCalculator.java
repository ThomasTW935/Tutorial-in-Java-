package Christine;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Firstnumber");
		int Firstnumber = s.nextInt();
		System.out.println("operator");
		String Operator = s.next();
		System.out.println("Secondnumber");
		int Secondnumber = s.nextInt();
		int Total=0;
		/*switch(Operator) {
		case "*": Total = Firstnumber * Secondnumber;break;
		case "/": Total = Firstnumber / Secondnumber;break;
		case "+": Total = Firstnumber + Secondnumber;break;
		case "-": Total = Firstnumber - Secondnumber;break;
		case "%": Total = Firstnumber % Secondnumber;break;
		default: System.out.print("error");
		}
		System.out.println(Firstnumber+Operator+Secondnumber+ "="+Total);*/
		if(Operator.equals("*")) {
			Total = Firstnumber * Secondnumber;
		}	
		if(Operator.equals("+")) {
			Total = Firstnumber + Secondnumber;
		}
		if(Operator.equals("-")) {
			Total = Firstnumber - Secondnumber;
		}		
		if(Operator.equals("/")) {
			Total = Firstnumber / Secondnumber;
		}
		if(Operator.equals("%")) {
			Total = Firstnumber % Secondnumber;
		}
		System.out.println(Firstnumber+Operator+Secondnumber+ "="+Total);
	}

	
	
	
	
}
