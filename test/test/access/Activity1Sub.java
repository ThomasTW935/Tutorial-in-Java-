package test.access;

public class Activity1Sub {
	public String name = "Christine Aparato";
	
	double tin;

	public double getTin() {
		return tin;
	}

	public void setTin(double tin) {
		this.tin = tin;
	}
	public double tinne(double num1, double num2, int num3) {
		double output = num1 * num2 - num3;
		return output;
	}

	public int addition (int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
