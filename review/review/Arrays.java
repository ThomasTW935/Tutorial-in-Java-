package review;

public class Arrays {
	
	/*
	 * Arrays are use to store multiple values in a single variable gggg
	 */
	
	public static void main(String[] args) {
		int [] num = {1,2,3,4,5};
		String [] lastName= {"Thomas","Aparato","Pacleb","Abalos","Gajasan"};
		
		// to access the values we need the index.
		// Syntax: name[index];
		System.out.println(lastName[1]);
		
		// looping through all the values
		for(int i = 0; i<lastName.length; i++) {
			System.out.print(lastName[i] + " ");
		}
		System.out.println();
		/*
		 *  or using foreach
		 *  for(String st: lastName){
		 *  	System.out.print(st + " ");
		 *  }
		 */
		
		/*
		 *  combining values from two different arrays
		 */
		System.out.println();
		String [] firstName = {"Daryl", "Christine", "Roland", "Romabel", "Jonathan"};
		for(int i = 0; i<firstName.length;i++) {
			System.out.println(firstName[i] + " "+ lastName[i]);
		}
		
		
	}

}
