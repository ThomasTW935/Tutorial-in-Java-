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
		System.out.println("Continue");
		for(int i = 1; i<=5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Break
		System.out.println("Break");
		for(int i = 1; i<=5; i++) {
			if(i == 3) {
				break;
			}
			System.out.print(i + " ");
		}
	}

}
