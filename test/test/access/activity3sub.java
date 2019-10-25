package test.access;

public class activity3sub {
	public void print(String name, int number) {
		System.out.println(name + " " +number);
		
	}
	public void Multiply(int multiply, int loops) {
		for(int i=1; i<=loops;i++) {
			int total = multiply *i;
			System.out.println(multiply + " x " + i+ " = "+ total);
		}
		
	}

}
