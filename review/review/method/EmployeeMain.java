package review.method;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		EmployeeSub es = new EmployeeSub();
		System.out.println("Employee Name?");
		es.EmployeeName(s.nextLine());
		System.out.println("Employee Position?");
		es.Position(s.nextLine());
		System.out.println("1. Full Time 2. Part Time");
		es.FullOrPartTime(s.nextInt());
		System.out.println("Hours Worked");
		es.HoursWorked(s.nextInt());
		System.out.println("Rate Per Hour?");
		es.Wage(s.nextDouble());
		s.close();
		es.PrintEmployeeInfo();

	}

}
