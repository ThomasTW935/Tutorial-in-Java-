package review.method;

public class Method {

	public static void main(String[] args) {
		
		String name = "Aparato";
		int age = 41;
		char gender = 'F';
		String Birthday = "June 09, 1988";
		
		MethodSub ms = new MethodSub();
		//ms.printAll(name, age, gender, Birthday);
		
		name = "CHristine";
		//ms.printAll(name, age, gender, Birthday);
		boolean isTrue = ms.FirstNumIsSmaller(10, 8);
		ms.printCondition(isTrue);

	}
	

}
