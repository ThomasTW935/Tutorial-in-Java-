package test.access;

import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int score = 0; 
		System.out.println("What is the meaning of 3 in 3yr 2sem?");
		System.out.println("A. First year B. Second year C. Third year D. Fourth year");
		String  answer = s.nextLine();
		if (answer.equals("C") || answer.equals ("c"))
		{
			System.out.println("Correct");
			score++;
		}
		else
		{
			System.out.println("Wrong");
		}
		System.out.println("What programming language is use in this program?");
		System.out.println("A.Java B. C++ C. C# D. none of the above");
		String answer1 = s.nextLine();
		if(answer1.equals("A")|| answer1.equals ("a"))
		{
			System.out.println("Correct");
			score++;
		}
		else
		{
			System.out.println("Wrong");
		}
		
		System.out.println("Score:"+ score + "/2");
		
	}

	
}
