package test.basics;

public class Quiz {
	

	public static void main(String[] args) {
		String FirstName = "Christine";
		String MiddleName = "Bermejo";
		String LastName = "Aparato";
		String Gender = "Female";
		int Age = 31;
		int StudentID = 2000066525;
		
		QuizSub sub = new QuizSub();
		
		sub.setFirstName(FirstName);
		sub.setMiddleName(MiddleName);
		sub.setLastName(LastName);
		sub.setGender(Gender);
		sub.setAge(Age);
		sub.setStudentID(StudentID);
		sub.Print();
	}

}
