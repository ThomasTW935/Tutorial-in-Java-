package Daryl;

public class StudentInfoSub {
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String gender;
	private int age;
	private long studentID;
	
	public void printInfo(String fullName, String gender, int age, long studentID) {
		StudentInfoSub2 sub2 = new StudentInfoSub2();
		sub2.print(fullName, gender, age, studentID);
	}
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public long getStudentID() {
		return studentID;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}
}
