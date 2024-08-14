package day2;

public class If_Condition {
	
	public static void main (String[] args) {
		
		/** 
		 * Conditional Statements
		 * 
		 * 1) if 
		 * 
		 * 2) if else 
		 * 
		 * 3) switch statement
		 * 
		 */
		
		/* 1) if syntax looks like: 
		 * 
		 * 			if (boolean condition) { 
		 * 									
		 * 								block of code goes here						
		 * 
		 * 							}
		 */
		
		
		System.out.println("========= Example 1 =========".repeat(3));
		

		if(true){
			System.out.println("We speak the truth."); 
		} 
		
		System.out.println("========= Example 2 =========".repeat(3));

		if (false) {
			System.out.println("We speak the truth."); //did not print this because false
		}
		
		System.out.println("End of the program."); 
		
		
		System.out.println("========= Example 3 =========".repeat(3));

		int person_age = 25; 
			
		if (person_age >= 18) { // person_age >= 18 this expression is either true or false - a single boolean value.
			
			System.out.println("Eligible to Vote.");
		}
		
			System.out.println("End of the program");
		
		
	}
	

}
