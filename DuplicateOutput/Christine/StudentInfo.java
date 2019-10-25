package Christine;

import java.util.*;

public class StudentInfo 
{

	public static void main(String[] args) 
	{
		{
			Scanner s = new Scanner(System.in);
			StudentInfoSub sub = new StudentInfoSub();
			System.out.println("What is your First name?");
			String Fname = s.nextLine();
			sub.setFname(Fname);
			System.out.println("What is your Middle Initial?");
			String Mname = s.nextLine();
			sub.setMname(Mname);
			System.out.println("What is your Last name?");
			String Lname = s.nextLine();
			sub.setLname(Lname);
			System.out.println("What is your Gender? M or F");
			String Gender = s.nextLine();
			sub.setGender(Gender);
			System.out.println("How old are you?");
			int Age = s.nextInt();
			sub.setAge(Age);
			System.out.println("Whatis you Student ID?");
			int Studno = s.nextInt();
			sub.setStudno(Studno);
			sub.print();			
		}
	}
}