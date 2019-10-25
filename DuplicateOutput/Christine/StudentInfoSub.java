package Christine;

public class StudentInfoSub 
{
	String Fname;
	String Lname;
	String Mname;
	String Gender;
	int Age;
	int Studno;
	
	public void print()
	{
		String fullName = Lname+ ", "+Fname+ " "+Mname;
		System.out.println("Name:" + fullName);
		System.out.println("Gender:" + Gender);
		System.out.println("Age:" + Age);
		System.out.println("Student ID:"+0+ Studno );
	}
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getStudno() {
		return Studno;
	}
	public void setStudno(int studno) {
		Studno = studno;
	}

	
	
	
}

	


