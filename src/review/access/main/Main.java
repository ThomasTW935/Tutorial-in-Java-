package review.access.main;

// if class is in another package
// syntax import package name;
import review.access.sub.Christine;
import review.access.sub.Daryl;

public class Main {

	public static void main(String[] args) {
		/* Syntax
		 * ClassName name = new ClassName();
		 */
		Sub s = new Sub();
		System.out.println(s.ChangeNameFormat("Christine", "Aparato", "B"));
		
		
		Christine ch = new Christine();
		ch.name();
		
		Daryl da = new Daryl();
		int firstNum = 30;
		int secondNum = 20;
		int thirdNum = da.AddNumbers(firstNum, secondNum);
		System.out.println(thirdNum);
	}

}
