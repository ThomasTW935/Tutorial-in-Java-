package Christine;

public class SalaryCalculatorSub {
	String EmpName;
	String Position;
	int Absences;
	int Rate;
	double FixSalary;
	double Deduction;
	double Salary;
	
	
	
	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public void setPosition(String position) {
		Position = position;
	}
	public void setAbsences(int absences) {
		Absences = absences;
	}
	public void setRate(int rate) {
		Rate = rate;
	}	

	public void calculate()
	{
		FixSalary = Rate*15;
		Deduction = Rate * Absences;
		Salary = FixSalary - Deduction;
	}
	
	public void print()
	{
		System.out.println("Name: "+EmpName);
		System.out.println("Position: "+Position);
		System.out.println("Rate: "+Rate);
		System.out.println("Deduction: "+Deduction);
		System.out.println("Salary: "+Salary);
	}

}