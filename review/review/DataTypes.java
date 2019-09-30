package review;

import java.util.*;

public class DataTypes {

	public static void main(String[] args) {
		String firstName = "Christine";
		String lastName = "Aparato";
		String fullName = lastName +", " +  firstName;
		String section = "BSIT-601";
		int firstNameLength = firstName.length();
		double lastNameLength = lastName.length();
		float fullNameLength = fullName.length();
		char [] sectionChars = section.toCharArray();
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Full Name: " + fullName);
		System.out.println("First Name Length: " + firstNameLength);
		System.out.println("Last Name Length: " + lastNameLength);
		System.out.println("Full Name Length: " + fullNameLength);
		System.out.print("Character At Index 1: " + sectionChars[1]);
	}

}
