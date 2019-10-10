package review.method;

public class EmployeeSub {
	String employeeName;
	String employeePosition;
	String fullOrPartTime;
	int hoursWorked;
	double ratePerHour;
	double bonusHours;
	double bonus;
	double wage;
	
		public void EmployeeName(String name) {
			this.employeeName = name.trim();
		}
		public void Position(String position) {
			this.employeePosition = position.trim();
		}
		public void FullOrPartTime(int fullOrPart) {
			switch(fullOrPart) {
			case 1: this.fullOrPartTime = "Full Time"; 
			case 2: this.fullOrPartTime = "Part Time";
			}
		}
		public void HoursWorked(int hoursworked) {
			if(hoursworked>40) {
				this.bonusHours = hoursworked - 40;
			}
			this.hoursWorked = hoursworked;
		}
		public void Wage(double rateperHour) {
			this.ratePerHour = rateperHour;
			bonus = bonusHours*(ratePerHour*1.5);
			this.wage = hoursWorked*ratePerHour + bonus;
			if(hoursWorked>40) {
				this.wage = 40*ratePerHour + bonus;
			}
		}
		public void PrintEmployeeInfo() {
			System.out.println("Employee Name: "+employeeName);
			System.out.println("Employee Position: "+ employeePosition);
			System.out.println(fullOrPartTime);
			System.out.println("Rate/Hour: "+ ratePerHour);
			System.out.println("Hours Worked: "+ hoursWorked);
			System.out.println("Bonus: "+ bonus);
			System.out.println("Wage: " + wage);
		}
		
}
