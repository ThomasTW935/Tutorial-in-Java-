package test.basics;

public class Quiz2 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);
		System.out.println(numbers[7]);
		System.out.println(numbers[8]);
		System.out.println(numbers[9]);
		
        int[] number = {11,12,13,14,15,16,17,18,19,20};
		
		
		for(int i= 0;  i<10;i++)
		{
			System.out.print(numbers[i]+number[i]);

		}
		System.out.println();
		for(int i= 0;  i<10;i++)                    
		{                           
			if(numbers[i] == 5) {
				continue;
			}
			System.out.print(numbers[i]); 
      	}                                         
   }       
      }    
                                                    