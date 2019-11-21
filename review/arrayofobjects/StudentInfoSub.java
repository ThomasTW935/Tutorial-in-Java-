package arrayofobjects;

public class StudentInfoSub {
	String fName;
	String lName;
	String section;
	String gender;
	int age;
	int studentID;
	public void printInfo() {
		String fullName = lName+", "+fName;
		System.out.println("Name: "+ fullName);
		System.out.println("Age: "+ age);
		System.out.println("Gender: " + gender);
		System.out.println("Section: " + section);
		System.out.println("Student ID: "+ studentID);
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public void setGender(String gender) {
		gender = gender.toLowerCase();
		if(gender == "m") {
			gender = "Male";
		} else {
			gender = "Female";
		}
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
}
