package test.access;

public class Operations {
	public int Calculate(int num1 , int num2, String operator) {
		int total = 0;
		switch(operator) {
		case "+": total = num1 + num2;break;
		case "-": total = Sub(num1,num2);break;
		case "*": total = num1 * num2;break;
		case "/": total = num1 / num2;break;
		case "%": total = num1 % num2; break;
		default: System.out.println("Error");break;
		}
		return total;
		
	}
	public int Sub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}
}
