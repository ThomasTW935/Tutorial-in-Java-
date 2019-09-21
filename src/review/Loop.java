package review;

public class Loop {

	public static void main(String[] args) {
		/* Types of loops 
		 * > 
		 * > for loop
		 * > for each loop
		 * > while loop
		 * > do while loop
		 * 
		 */
		
		
		/*
		 * for loop syntax
		 * 
		 * for(declaration, condition, increment/decrement){
		 * 	 ...code to execute...
		 * }
		 * 
		 */
		
		System.out.println("For Loop: ");
		int forLoop = 2;
		for(int i = 0; i<5; i++) {
			forLoop+=i; // forLoop = forLoop + i;
			System.out.print(forLoop + " ");
		}
		
		System.out.println();
		
		/*
		 * for each syntax 
		 * for(declaration : array){
		 * 	...code to execute...
		 * }
		 * 
		 */
		
		System.out.println("For Each: ");
		int [] forEach = {2,5,3,7,10};
		for(int num : forEach) {
			num*=2; // num = num * 2;
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		/*
		 * while loop syntax
		 * 
		 * while(condition){
		 * 	...code to execute
		 * }
		 * 
		 */
		
		System.out.println("While Loop:");
		int whileLoop = 1;
		while(whileLoop <= 5) {
			System.out.print(whileLoop + " ");
			whileLoop++; // whileLoop = whileLoop + 1;
		}
		
		System.out.println();
		
		/*
		 * do while loop syntax
		 * 
		 * do{
		 * 	...code to execute...
		 * }while(condition);
		 * 
		 */
		
		System.out.println("Do While Loop:");
		int doWhileLoop = 1;
		do{
			System.out.print(doWhileLoop + " ");
			doWhileLoop++; // doWhileLoop = doWhileLoop + 1;
		}while(doWhileLoop <= 5);
	}

}
