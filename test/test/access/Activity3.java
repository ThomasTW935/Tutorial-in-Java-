package test.access;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*System.out.println("Whats your name?");
		String name = s.nextLine();
		System.out.println("Whats your fave number?");
		int number = s.nextInt();
		activity3sub sub = new activity3sub();
		sub.print(name, number);*/
		
		System.out.println("pick a number");
		int multipl = s.nextInt();
		System.out.println("up to: ");
		int loops = s.nextInt();
		activity3sub sub = new activity3sub();
		sub.Multiply(multipl, loops);
	}
	
}
