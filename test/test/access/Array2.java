package test.access;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String [] questions = {
				"What is the answer for 10*5",
				"What is the answer for 10+5",
				"What is the answer for 10/2",
				"What is the answer for 100/2",
				"What is the answer for 15+5",
				"What is the answer for 20*10"
		};
		String choices = "A."+10*5 + " B. "+10+5+ " C. "+ 10/2 + " D. "+100/2+" E. "+ (15+5) + " F. "+20*10;
		String [] correctAnswers = {"A","B","C","D","E","F"};
		int totalScore = 0;
		for(int i = 0; i<questions.length; i++) {
			System.out.println(questions[i]);
			System.out.println();
			System.out.println(choices);
			String userAnswer = s.nextLine();
			if(userAnswer.equals(correctAnswers[i])) {
				totalScore++;
			}
		}
		System.out.println("Score: " + totalScore + "/"+ questions.length);
		}
		
		
}
