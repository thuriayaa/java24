package day2;

public class TernaryOperatorDemo {

	public static void main (String[] args) {
		
		/*
		 * 6) Conditional/Ternary operator: ? :
		 */
		
		System.out.println("========= Ternary Operators =========".repeat(3));
		
		/*
		 * entire thing is a string, we have 3 expression
		 * (age >= 18) is an expression 
		 */

		System.out.println("========= Ex. 1 =========".repeat(3));

		int age = 25; 
		
		String result = (age >= 18) ? "Eligible to vote" : "Not Eligible"; 
		
		System.out.println(result);
		
		
		System.out.println("========= Ex. 2 =========".repeat(3));

		
		int a = 15; 
		
		String res = (a >= 18) ? "Eligible to vote" : "Not Eligible"; 
		
		System.out.println(res);
		
		
		System.out.println("========= Ex. 3 - Swap value and print =========".repeat(3));

		int c = 25, d = 10; 
		
		c = d; 
		
		System.out.println(c); //10
		
		d +=15;
		
		System.out.println(d); //25
		
		

		System.out.println("========= Ex. 3 - ANS - Swap value and print =========".repeat(3));

		int aa = 25, bb = 10;
		
		//System.out.printf("initial value of aa %d and bb %d",  aa, bb);
		
		System.out.println("Initial value of a is: " + aa + " and b is: " + bb);

		
		System.out.println();
		
		aa = aa + bb; //35
		bb = aa - bb; //25
		aa = aa - bb; 
		
		//System.out.printf("initial value of aa %d and bb %d",  aa, bb);
		
		System.out.println("Final value of a is: " + aa + " and b is: " + bb);

	}
	
	
}
