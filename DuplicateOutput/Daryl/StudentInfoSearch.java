package Daryl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentInfoSearch {

	public static void main(String[] args) {
		StudentInfoSearchSub [] students = new StudentInfoSearchSub[2];
		Scanner s;
		for(int i = 0; i<students.length;i++){
			s = new Scanner(System.in);
			students[i] = new StudentInfoSearchSub();
			System.out.println("Input Name.");
			students[i].setFullName(s.nextLine());
			System.out.println("Input Birthday. (Ex. 06/09/1988)");
			students[i].setBirthDay(s.nextLine());
			System.out.println("Input Gender. (M/F)");
			students[i].setGender(s.nextLine());
			System.out.println("Input Course. (Ex. BSIT)");
			students[i].setCourse(s.nextLine());
			System.out.println("Input Student ID.");
			students[i].setStudentID(s.nextInt());
			System.out.print("Press q to Quit");
			boolean quit = s.hasNext("q");
			if(quit){
				break;
			}
			
		}
		
		
		s = new Scanner(System.in);
		
		//System.out.println("Type Student ID");
		//int input = s.nextInt();
		
		System.out.println("Type Course");
		String input = s.nextLine();
		
		for(StudentInfoSearchSub student : students) {
			int studentID = student.getStudentID();
			String course = student.getCourse();
			String fullName = student.getFullName();
			String firstName = fullName.split(" ")[0]; 
			String lastName = fullName.split(" ")[1];
			System.out.println(course);
			if(input.equals(course)) {
				student.printInfo();
			}
		}
		
		
	}

}
