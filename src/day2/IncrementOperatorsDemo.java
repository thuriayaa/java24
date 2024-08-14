package day2;

public class IncrementOperatorsDemo {
	
	public static void main (String[] args) {
		
		
		/*
		 * 4) Increment and Decrement operators:  ++, --
		 * 
		 * -> if we want to increase by one unit only, then we use increment operator ++
		 * 
		 */

		System.out.println("========= Increment operators =========".repeat(3));
		
		int a = 10; 
		
		//a = a + 1; this is a method to increase by 1
		
		a++; //this is the increment method to increase by 1. same as the above method. 
		
		System.out.println(a); //11 
		
		//increment operator is two types, 1. post and  2. pre increments. 
		
		System.out.println("========= Post Increment =========".repeat(3));
		

		// post increment - assign then add
		
		int x = 10; 
		
		int result = x++; 
		
		System.out.println(result); //10, did not return 11. you get the post increment value, which is the original value
		
		System.out.println(x); //11
		
		
		System.out.println("========= Pre Increment =========".repeat(3));

			//increase then add
		
		
		int b = 20; 
		
		int res = ++b; 
		
		System.out.println(res); //21
		
		
	}

}
