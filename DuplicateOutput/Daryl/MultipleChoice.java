package Daryl;

import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String [] questions = {
				"What is the color of an apple?",
				"What is the color of a banana?",
				"What is the color of a watermelon?"
		};
		String [] answers = {
				"red",
				"yellow",
				"green"
		};
		int score = 0;
		int [] wrongIndex= new int[3];
		int wrongCount=0;
		for(int i = 0; i<questions.length; i++) {
			System.out.println(questions[i]);
			String inputAnswer = s.nextLine();
			if(inputAnswer.equals(answers[i])) {
				score++;
			} else {
				wrongIndex[wrongCount] = i;
				wrongCount++;
			}
		}
		System.out.println("Score: "+score);
		for(int i = 0; i<wrongCount+1; i++) {
			System.out.println(questions[wrongIndex[i]]);
			System.out.println("Answer: " + answers[i]);
		}
	}
}
