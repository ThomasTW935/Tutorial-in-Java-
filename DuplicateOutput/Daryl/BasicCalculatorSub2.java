package Daryl;

public class BasicCalculatorSub2 {
	public double Add(double first, double second, String operator) {
		first+=second;
		return first;
	}
	public double Sub(double first, double second, String operator) {
		first-=second;
		return first;
	}
	public double Mul(double first, double second, String operator) {
		first*=second;
		return first;
	}
	public double Div(double first, double second, String operator) {
		first/=second;
		return first;
	}
	public double Mod(double first, double second, String operator) {
		first%=second;
		return first;
	}
}
