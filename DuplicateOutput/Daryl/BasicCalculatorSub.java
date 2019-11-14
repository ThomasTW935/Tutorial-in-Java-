package Daryl;

public class BasicCalculatorSub {
	double firstNumber,secondNumber;
	String operator;
	double total;
	public void calculate() {
		BasicCalculatorSub2 bc2 = new BasicCalculatorSub2();
		switch(operator) {
		case "+": bc2.Add(firstNumber, secondNumber, operator);break;
		case "-": bc2.Sub(firstNumber, secondNumber, operator);break;
		case "*": bc2.Mul(firstNumber, secondNumber, operator);break;
		case "/": bc2.Div(firstNumber, secondNumber, operator);break;
		case "%": bc2.Mod(firstNumber, secondNumber, operator);break;
		}
		System.out.println(total);
	}
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
}
