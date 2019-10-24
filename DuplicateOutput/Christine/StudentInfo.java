package Christine;

import java.util.*;
public class StudentInfo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("What is your Firs name?");
		String Fname = s.nextLine();
		System.out.println("What is your Middele Initial?");
		String Mname = s.nextLine();
		System.out.println("W hat is your Last name?");
		String Lname = s.nextLine();
		System.out.println("What is your Gender? M or F");
		String gender = s.nextLine();
		System.out.println("How old are you?");
		int Age = s.nextInt();
		System.out.println("Whatis you Student ID?");
		int Studno = s.nextInt();
	
		String fullName = Lname+ ", " +Fname+ " " +Mname;
		System.out.println("Name:"+ fullName);
		System.out.println("Gender:"+ gender);
		System.out.println("Age:"+ Age);
		System.out.println("Student ID:"+ Studno);
	}

}
