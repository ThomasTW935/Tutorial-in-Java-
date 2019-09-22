package review;

public class ContinueBreak {

	public static void main(String[] args) {
		/*
		 * Continue and Break are commonly seen in loops. Break are also used in switch case
		 * 
		 *  Continue - Skips the codes below it but the loop will continue
		 *  Break - Skips the codes below it and will leave the loop
		 *  
		 */
		
		// Continue
		// Example 1
		System.out.println("Continue");
		System.out.print("Ex1:");
		for(int i = 1; i<=5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		//Example 2
		System.out.print("Ex2:");
		String[] arrayString = {"Daryl","Thomas","Christine","Aparato","Garp","Dragon"};
		for(int i = 0; i<arrayString.length; i++) {
			if(arrayString[i].equals("Christine")) {
				continue;
			}
			System.out.print(arrayString[i] + " ");
		}
		System.out.println();
		//Example 3
		System.out.print("Ex3:");
		for(String s : arrayString) {
			if(s.equals("Aparato")) {
				continue;
			}
			System.out.print(s + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// Break
		System.out.println("Break");
		System.out.print("Ex1:");
		for(int i = 1; i<=5; i++) {
			if(i == 3) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		//Example 2
		System.out.print("Ex2:");
		for(int i = 0; i<arrayString.length; i++) {
			if(arrayString[i].equals("Christine")) {
				break;
			}
			System.out.print(arrayString[i] + " ");
		}
		System.out.println();
		//Example 3
		System.out.print("Ex3:");
		for(String s : arrayString) {
			if(s.equals("Aparato")) {
				break;
			}
			System.out.print(s + " ");
		}
	}

}
