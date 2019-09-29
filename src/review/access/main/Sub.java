package review.access.main;

public class Sub {
	public String ChangeNameFormat(String firstName, String lastName, String middleInitial) {
		String newName = lastName + ", " + firstName + " "+ middleInitial + ".";
		return newName;
	}
}
