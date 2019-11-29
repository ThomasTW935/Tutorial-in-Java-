package test.basics;

public class Quiz3 {

	public static void main(String[] args) {
			String [] FirstName = {"Christine", "Hush","Daryl"};
			String [] LastName = {"Aparato", "De peralta", "Thomas"};
			
			
			
			for (int i=0; i<FirstName.length;i++)
			{
				int Age = 20;
				if(FirstName[i].equals("Christine")) {
					Age = 31;
				}
				String Gender = "Male";
				if(FirstName[i].equals("Christine") &&LastName[i].equals("Aparato")) {
					Gender = "Female";
				
				}
				System.out.println(FirstName[i]+ " "+LastName[i]);
				System.out.println(Age);
				System.out.println(Gender);
			}
	}

}
