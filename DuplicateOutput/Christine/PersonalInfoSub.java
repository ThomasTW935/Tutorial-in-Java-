package Christine;

public class PersonalInfoSub {
	String Firstname;
	String Lastname;
	String Birthday;
	String Gender;
	int Age;
	
	public void printInfo()
	{
		String Fullname = Firstname+" "+Lastname;
		System.out.println("Name:"+Fullname);
		System.out.println("Birthday:"+Birthday);
		System.out.println("Gender:"+Gender);
		System.out.println();
		
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
}