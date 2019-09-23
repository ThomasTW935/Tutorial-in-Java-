package review;

import java.util.Scanner; //or java.util.*;

public class UserInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//For String/Character
		System.out.println("Type a text");
		String newString = s.nextLine(); // or s.next();
		System.out.println("Output: " + newString);
		
		//For Integer
		System.out.println("Type a Integer");
		int newInt = s.nextInt();
		System.out.println("Output: " + newInt);
		
		//For Double
		System.out.println("Type a Double");
		double newDouble = s.nextDouble();
		System.out.println("Output: " + newDouble);
		
		//For Float
		System.out.println("Type a Float");
		float newFloat= s.nextFloat();
		System.out.println("Output: " + newFloat);
		
				
		System.out.println();
		
	}

}
