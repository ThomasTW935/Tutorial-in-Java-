package Christine;

public class PersonalInfo {

	public static void main(String[] args) {
		String[] Firstname = {"Christine","Daryl","Hush"};
		String[] Lastname = {"Aparato","Thomas","De Perlta"};
		String[] Birthday = {"June 9,1988","January 1,1582","February 5, 1585"};
		String Gender;
		
		PersonalInfoSub[] info = new PersonalInfoSub[Firstname.length];
		
		
		
	
		for(int i=0; i<Firstname.length;i++)
		{
			info[i]= new PersonalInfoSub();
			info[i].setFirstname(Firstname[i]);
			info[i].setLastname(Lastname[i]);
			info[i].setBirthday(Birthday[i]);
			
			Gender = "Female";
					if(Firstname[i] == "Daryl")
					{
						Gender = "Male";
					}
					
			info[i].setGender(Gender);
			info[i].printInfo();
		}
	}
	

}