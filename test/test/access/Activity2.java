package test.access;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Activity2Sub sub = new Activity2Sub();
		System.out.println("What is your First Name?");
		String Name = s.nextLine();
		System.out.println("What is your Last Name?");
		Name +=" "+ s.nextLine();
		sub.print(Name);

	}

}
