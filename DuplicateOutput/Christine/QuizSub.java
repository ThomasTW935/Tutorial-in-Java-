package Christine;

public class QuizSub {
	
	String FirstName;
	String MiddleName;
	String LastName;
	String Gender;
	int Age;
	int StudentID;

	public void Print() {
		String fullName = FirstName+ " " +MiddleName+ " "+ LastName;
		System.out.println("Name:" +fullName);
		System.out.println("Gender" +Gender);
		System.out.println("Age" +Age);
		System.out.println("StudentID" +StudentID);
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	
}
