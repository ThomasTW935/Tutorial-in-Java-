package test.access;

/*
 * 1. Create another class, name it "Activity1Sub"
 * 2. create a String name = <Your Name>  in the newly created class
 *    then output it in this class
 *  
 * 3. create a method that returns a double  in "Activity1Sub"
 * 4. create two double datatype value of the first double is 105.5
 *    and the second double is 15
 *    substract the first and second  then store it to total
 *    return total 
 * 5. and print the output in this class 
 *  
 */

public class Activity1 {

	public static void main(String[] args) {
		
		/*Activity1Sub act1 = new Activity1Sub();
		
		act1.setTin(5);
		System.out.println(act1.getTin());
		
		System.out.println(act1.addition(2, 2));
		
		Christine c = new Christine();
		System.out.println(c.multiply(5, 5));
		
		System.out.println(c.Student("tin", 02000066525));
		*/
		

	}
	public String gender(char charGender) {
		//print();
		String stringGender = "";
		if(charGender == 'F' || charGender == 'f') {
			stringGender = "Female";
		}
		if(charGender == 'M' || charGender == 'm') {
			stringGender = "Male";
		}
		return stringGender;
		
	}
	public void print() {
		System.out.println("Daryl Thomas");
	}

}
