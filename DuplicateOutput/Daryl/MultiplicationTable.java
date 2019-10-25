package Daryl;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MultiplicationTableSub mu = new MultiplicationTableSub();
		System.out.println("From what Number?");
		mu.setFromNumber(s.nextInt());
		System.out.println("To what Number?");
		mu.setToNumber(s.nextInt());
		mu.printTable();
	}

}
