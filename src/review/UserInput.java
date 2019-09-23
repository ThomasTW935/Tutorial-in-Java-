package review;

import java.util.Scanner; //or java.util.*;

public class UserInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type a number");
		int newNum = s.nextInt();
		System.out.println(newNum);

	}

}
