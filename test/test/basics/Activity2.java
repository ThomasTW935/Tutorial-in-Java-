package test.basics;

public class Activity2 {

	/*
	 * using the three types of loop
	 * for,while,dowhile
	 * 
	 * create an int with a value of 2
	 * loops = 6
	 * for every loop print then add 3 
	 * 
	 * output:
	 *  2 5 8 11 14 17
	 *  
	 */
	
	public static void main(String[] args) {
		String name = "Christine Aparato";
		for(int i = 0; i<5; i++) {
			//System.out.println(name);	
		}
		
		double num2 = 52.24232;
		for(int i = 0; i<=10; i++) {
			System.out.print(num2*i + " ");
		}
	
		System.out.println();
		
		double i = 52;
		while(i < 600) {
			System.out.print(i + " ");
			i*=2;
		}
		

	}

}
