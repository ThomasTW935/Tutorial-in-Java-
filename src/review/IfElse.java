package review;

public class IfElse {

	public static void main(String[] args) {
		
		/*
		 *  Syntax of if, if else , if else if
		 *  
		 *  if(condition){
		 *  	...code to execute...
		 *  } 
		 *  else if(condition){
		 *  	...code to execute...
		 *  } else {
		 *  	...code to execute...
		 *  }
		 *  
		 */
		int firstNum = 5;
		int secondNum = 10;
		
		if(firstNum >= secondNum/2) {
			System.out.println(firstNum + " is greater than or equal to " + secondNum);
		} 
		
		if(firstNum == secondNum) {
			System.out.println(firstNum + " is equal to " + secondNum);
		} else {
			System.out.println(firstNum + " is not equal to " + secondNum);
		}
		
		firstNum *= secondNum;
		
		if(firstNum < secondNum) {
			System.out.println(firstNum + " is less than to " + secondNum);
		} 
		else if(firstNum != secondNum) {
			System.out.println(firstNum + " is not equal to " + secondNum);
		} else {
			System.out.println(firstNum + " is greater than or equal to " + secondNum);
		}

		if(! (firstNum != secondNum || firstNum == secondNum) && firstNum >= secondNum) {
			System.out.println("ONCE");
		} else {
			System.out.println("TWICE");
		}
		
	}

}
