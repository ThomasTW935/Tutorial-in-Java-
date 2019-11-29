package Daryl;

public class StudentInfoSearchSub {
	String firstName;
	String lastName;
	String fullName;
	String gender;
	String birthMonth;
	int birthDay;
	int birthYear;
	String birthDate;
	int age;
	String course;
	String courseDescription;
	int studentID;
	
	public void printInfo() {
		System.out.println("Name: "+ lastName + ", " + firstName);
		System.out.println("Gender: "+ gender);
		System.out.print("Birthday: "+ birthDate);
		System.out.println(" ("+ age+" years old)");
		System.out.println("Course: "+ course + " - "+ courseDescription);
		System.out.println("StudentID: 0" + studentID);
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
		String [] fullNameSplit = fullName.split(" ");
		firstName = fullNameSplit[0];
		lastName = fullNameSplit[1];
	}

	public void setGender(String genderInput) {
		genderInput = genderInput.toLowerCase();
		gender = "Female";
		if(genderInput.equals("m")) {
			gender = "Male";
		}
	}

	public void setBirthDay(String birthDay) {
		String [] birthDaySplit = birthDay.split("/");
		switch(Integer.parseInt(birthDaySplit[0])) {
			case 1: birthMonth = "January";break;
			case 2: birthMonth = "February";break;
			case 3: birthMonth = "March";break;
			case 4: birthMonth = "April";break;
			case 5: birthMonth = "May";break;
			case 6: birthMonth = "June";break;
			case 7: birthMonth = "July";break;
			case 8: birthMonth = "August";break;
			case 9: birthMonth = "September";break;
			case 10: birthMonth = "October";break;
			case 11: birthMonth = "November";break;
			case 12: birthMonth = "December";break;
		}
		
		this.birthDay = Integer.parseInt(birthDaySplit[2]);
		birthYear = Integer.parseInt(birthDaySplit[2]);
		age = 2019 - birthYear;
		birthDate = birthMonth + " " + birthDay+ ", " + birthYear;
	}

	public void setCourse(String course) {
		course = course.toUpperCase();
		this.course = course;
		switch(course) {
			case "BSIT": courseDescription = "Bachelor of Science in Information Technology";break;
			case "BSCS": courseDescription = "Bachelor of Science in Computer Science";break;
			case "BSCE": courseDescription = "Bachelor of Science in Computer Engineering";break;
		}
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getGender() {
		return gender;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public int getStudentID() {
		return studentID;
	}

}
