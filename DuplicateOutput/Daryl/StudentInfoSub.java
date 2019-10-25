package Daryl;

public class StudentInfoSub {
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String gender;
	private int age;
	private long studentID;
	public void printInfo() {
		String fullName = getLastName()+ ", " + getFirstName() + " " + getMiddleInitial();
		System.out.println("Name: "+fullName);
		System.out.println("Gender: "+ gender);
		System.out.println("Age: "+ age);
		System.out.println("Student ID: "+ studentID);
	}
	
	private String getFirstName() {
		return firstName;
	}
	private String getMiddleInitial() {
		return middleInitial;
	}
	private String getLastName() {
		return lastName;
	}
	private String getGender() {
		return gender;
	}
	private int getAge() {
		return age;
	}
	private long getStudentID() {
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
