package review.method;

public class MethodSub {
	String name;
	int age;
	char gender;
	String Birthday;
	
	public void Setname(String name) {
		this.name = name;
	
	}
	public void Setage(int age) {
		this.age = age;
	}
	public void Setgender(char gender) {
		this.gender = gender;
	}
	public void SetBirthday(String Birthday) {
		this.Birthday = Birthday;
	}
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(Birthday);
	}
	public void printAll(String name, int age, char gender, String Birthday) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(Birthday);
	}
	public boolean FirstNumIsSmaller(int num1, int num2) {
		if(num1 < num2) {
			return true;
		} else {
			return false;
		}
	}
	int num1;
	int num2;
	public void changeNums(int num1, int num2) {
		if(num1>num2) {
			int temp;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
	} 
	public void printCondition(boolean compareNum) {
		if(compareNum) {
			System.out.println("num1 is smaller than num2");
		} else {
			System.out.println("num1 is greater than num2");
		}
	}
	
}
