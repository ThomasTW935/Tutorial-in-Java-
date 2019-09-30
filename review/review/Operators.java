package review;

public class Operators {

	public static void main(String[] args) {
		/*
		 *  Types of Operators
		 *  >Arithmetic Operators
		 *  >Assignment Operators
		 *  >Logical Operators
		 *  
		 *  Arithmetic Operators
		 *  > +  #Addition
		 *  > -  #Subtraction
		 *  > *	 #Multiplication
		 *  > /  #Division 
		 *  > %  #Modulus - The answer would be the remainder of the divided numbers
		 *  
		 *  Assignment Operators
		 *  > =  #Equal to 	
		 *  > += 	
		 *  > -=
		 *  > *=
		 *  > /=
		 *  > %=
		 *  
		 *  Logical Operators
		 *  > ! 	#Not/Reverse
		 *  > !=	# Not Equal to
		 *  > ==	# Equal to
		 *  > &&	# And
		 *  > ||	# Or
		 *  
		 */
		
		int firstNum = 100;
		int secondNum = 6;
		
		// Arithmetic Operators
		System.out.println("Arithmetic Operators");
		System.out.print(firstNum + secondNum + " ");
		System.out.print(firstNum - secondNum + " ");
		System.out.print(firstNum * secondNum + " ");
		System.out.print(firstNum / secondNum + " ");
		System.out.print(firstNum % secondNum);
		
		System.out.println();
		
		// Assignment Operators 
		 
		System.out.println("Assignment Operators");
		double thirdNum;
		System.out.print((firstNum += secondNum) + " "); // firstNum = firstNum + secondNum
		System.out.print((firstNum -= secondNum) + " "); // firstNum = firstNum - secondNum
		System.out.print((firstNum *= secondNum) + " "); // firstNum = firstNum * secondNum
		System.out.print((firstNum /= secondNum) + " "); // firstNum = firstNum / secondNum
		System.out.print((firstNum %= secondNum) + " "); // firstNum = firstNum % secondNum
		
		System.out.println();
		
		/*
		 * Logical Operators
		 *  !  : reverses the input #if input is false the output will be true
		 *  == : compares two values if it is equal it is true otherwise false
		 *  != : compares two values if it is not equal it is true otherwise false
		 *  && : also called "And". The power of False. compares two values the outputs will be: 
		 *  		TT = T
		 *  		TF = F
		 *  		FT = F
		 *  		FF = F
		 *  	T = True : F = False
		 *  || : also called "Or". The power of True. compares two values the ouputs will be:
		 *  		TT = T
		 *  		TF = T
		 *  		FT = T
		 *  		FF = F
		 */
		System.out.println("Logical Operators");
		System.out.println("! or Not/Reverse: ");
		System.out.println(!true);
		System.out.println();
		
		System.out.println("!= or Not Equal: ");
		System.out.println(true != true);
		System.out.println(true != false);
		System.out.println();
		
		System.out.println("== or Equal to: ");
		System.out.println(true == true);
		System.out.println(true == false);
		System.out.println();
		
		System.out.println("&& or AND");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		
		System.out.println("|| or OR");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		

	}

}
