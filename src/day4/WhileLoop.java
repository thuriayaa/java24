package day4;

public class WhileLoop {
	/*
	 * For loop, we need
	 * 	1. initialization; int i = 0; int is data type, i is the variable, 
	 * 	2. condition or logic; i < 10; 
	 * 	3. increment/decrement; i++
	 * 
	 * Loop: same set of statements multiple types. 
	 * 
	 * -> For loop syntax
	 * 
	 * for (int i = 0; i < 10; i++) { ... }
	 * 
	 * 
	 * When do we use for loop?
	 * 	-> when we know the exact number how many times we will loop;
	 * 
	 * --> we use while loop when we don't know how many types we will loop.
	 * 
	 * --> if no condition is not true for while loop, it won't run. 
	 * 			--> but in do while loop, even if the condition is not true, loop will run at least once
	 * 
	 * 
	 */
	

	public static void main (String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(i);
			
		}
		
	
		System.out.println("\n while loop output" .repeat(2));
		
		
		/** 
		 * print 1 to 5 using while loop
		 * need initialization 
		 */
		
// while loop
		
		int num = 1; 
		
		while (num <= 5) {
			
			System.out.println(num);
			num ++;
			
		}
		
		System.out.println("\n DO WHILE LOOP output" .repeat(2));

		/**
		 * print 1 to 5 using do while loop
		 */
		
// do while loop
		
		int day = 1; 
		
		do  { System.out.println(day);
		
			day ++; 
		
		} while (day <= 5);
		
		
		System.out.println("\n DO WHILE LOOP output Example 2" .repeat(2));

		/**
		 * print 1 to 5 using do while loop
		 */
		
		int number = 1; 
		
		do  { 
	
			System.out.println(" -> John \n"); // can print a name. 
		
			number ++; 
		
		} while (number <= 5);
		
		
		System.out.println("-- For loop print 1-10 with a jump statement -- " .repeat(2));
		
		System.out.println("-- situation 1: with break.  -- ");

	
//situation 1: with break. 
		
		for (int a = 1; a <=10; a++) {
			
			System.out.println(a);
			
//keeping the code intact, exclude printing 6-10;
			
			if (a == 5) { //jump statement
				break; 
			}
			
		}
		
		System.out.println("-- situation 2: with continue, after skipping a number  -- ");

// situation 2: with continue, print all numbers besides 5
		
		for (int z = 1; z <= 10; z++) {
			
			if (z == 5) {
				continue; //skip current sequence except 5
			}
			
			System.out.println(z); 
			
			
		}
		
		
		}
		
		
		
		
		
	}
	


