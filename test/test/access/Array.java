package test.access;

import java.util.Scanner;

public class Array {

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
		int [] correctAnswers = {10*5,10+5,10/2,100/2,15+5,20*10};
		int totalScore = 0;
		for(int i = 0; i<questions.length; i++) {
			System.out.println(questions[i]);
			int userAnswer = s.nextInt();
			if(userAnswer == correctAnswers[i]) {
				totalScore++;
			}
		}
		System.out.println("Score: " + totalScore + "/"+ questions.length);
	}

}
