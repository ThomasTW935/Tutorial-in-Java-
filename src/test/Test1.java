package test;

public class Test1 {
/*
	 * 1.
Given:
 
	Strings:  Aparato, Christine, BSIT-601
	Integer:  31
	Character:  F

Output:
	Name: Aparato, Christine
	Age: 31
	Gender: F
	Information Technology
	BSIT-601

2. Use Loop
Output:
	*****     

3. IfElse
Given:
Integers: 20, 150
	Condition: 20<150

Output
	if true print 20 is less than 150
	if false print 20 is greater than 150  
	
	 */
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
