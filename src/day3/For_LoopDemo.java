package day3;

public class For_LoopDemo {
	
	public static void main (String[] args) {
		
		/**
		 * loop: same set of statement executed multiple types
		 * 
		 */
		
		/*
		 * for loop syntax
		 * 
		 * 			for (start point; logic ; increment/decrement) {
		 * 				//piece of code will be looping based on the logic given lines
		 * 				}
		 * 			 
		 */
		
		// let's print a number using 1-5 using loop
		
		for (int i = 1; i <= 5; i++) {
		
		System.out.println(i); //loops and adds 1 each time until it reaches 5, then stops
		
		}
		
		System.out.println("end of loop 1-5");
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("X"); //prints x 5 times
			
			}
		System.out.println("end of loop x");


		for (int i = 10; i >= 1; i--) {
			
			System.out.println(i); //prints x 5 times
			
			}
		System.out.println("end of loop 10");
		
	}

}
