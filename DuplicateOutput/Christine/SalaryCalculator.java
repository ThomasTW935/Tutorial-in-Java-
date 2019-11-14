package Christine;

import java.util.Scanner;
public class SalaryCalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Employee name");
		String name = s.next();
		System.out.print("Position");
		String position = s.next();
		System.out.print("Absences");
		int absences = s.nextInt();
		
		int rate;
		
		if(position.contentEquals("CEO"))
		{
			rate = 3000;
		}
		else 
		{
			rate = 1500;
		}
		SalaryCalculatorSub sub = new SalaryCalculatorSub();
		sub.setEmpName(name);
		sub.setPosition(position);
		sub.setAbsences(absences);
		sub.setRate(rate);
		sub.calculate();
		sub.print();
	}

}
