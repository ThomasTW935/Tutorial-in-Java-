package Daryl;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StudentInfoSub st = new StudentInfoSub();
		System.out.println("What is your First Name?");
		st.setFirstName(s.nextLine());
		System.out.println("What is your Middle Initial?");
		st.setMiddleInitial(s.nextLine());
		System.out.println("What is your Last Name?");
		st.setLastName(s.nextLine());
		System.out.println("What is your Gender? M or F");
		st.setGender(s.nextLine());
		System.out.println("How old are you?");
		st.setAge(s.nextInt());
		System.out.println("What is your Student ID?");
		st.setStudentID(s.nextLong());
		
		st.printInfo();
	}

}
