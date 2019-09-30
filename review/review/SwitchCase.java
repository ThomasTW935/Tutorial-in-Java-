package review;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * Switch Case Syntax
		 * 
		 * switch(variableName){
		 * 	case 1: ...code to execute...; break;
		 *  case 2: ...code to execute...; break;
		 *  case 3: ...code to execute...; break;
		 *  default: ...code to execute...; break;
		 * }
		 * 
		 */
		//Example 1
		String outPut1;
		int newInt = 4;
		switch(newInt) {
		 case 1: outPut1 = "I have an apple";break;
		 case 2: outPut1 = "I have a banana";break;
		 case 3: outPut1 = "I have a carrot";break;
		 case 4: outPut1 = "I have a dalandan";break;
		 default: outPut1 = "I have an eagle";break;
		}
		System.out.println(outPut1);
		
		//Example 2
		String newString = "Christine";
		switch(newString) {
			case "Daryl": newString += " Thomas";break;
			case "Christine": newString += " Aparato";break;
		}
		System.out.println(newString);
		
		//Example 3
		String outPut3 = "";
		char newChar = 'c';
		switch(newChar) {
		 case 'a': outPut3 = "Apple";break;
		 case 'b': outPut3 = "Banana";break;
		 case 'c': outPut3 = "Car";break;
		 case 'd': outPut3 = "Dart";break;
		}
		System.out.println(outPut3);
		
	}

}
