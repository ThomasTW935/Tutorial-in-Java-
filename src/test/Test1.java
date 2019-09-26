package test;

public class Test1 {

	public static void main(String[] args) {
		String Givenname = "Christine";
		String Lastname = "Aparato";
		String Field = "Information Technology";
		String Section = "BSIT-601";
		char  Gender = 'F';
		int Age = 31;
		
		System.out.println(Lastname + ", " + Givenname);
		System.out.println(Age);
		System.out.println(Gender);
		System.out.println(Field);
		System.out.println(Section);
	
	
		int num1 = 20;
		int num2 = 150;
	
		if(num1 < num2)
		{
			System.out.println(num1 + "is less than" + num2);
		}
		else
		{
			System.out.println(num1 + "is greater than" + num2);
		}
	
		int tin = 1;
		for(int i = 0; i<5; i++) 
		{
			tin+=i;
			System.out.print("*");
		}
	
	}

}
