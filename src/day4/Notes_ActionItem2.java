package day4;

public class Notes_ActionItem2 {
	
	/*
	 * what have we learned so far?
	 * 	-> day 1: what is automation? where do we need automation in terms of software testing, why need it in general, what to automate? 
	 * what are the things need to be automated? when to automate?
	 * 
	 * Different methods and different methods in agile? which project for automation? which tools to use? relationship between power and 
	 * intent
	 * 
	 * install java, eclipse, jshell, since when jshell was available? (since Java 9..) learned a few commands of jshell, keywords of java
	 * 
	 * -> day 2: six types of java operators, expressions and statements types. 
	 *
	 * 
	 */
	
	/**
	 * Heap memory
	 */
	
	/**
	 * Action item 2: 
	 * 
	 * 
	 */
	

	
	//factorial - return type is integer
	
	/*
	 * i = i + 1; 
	 * i +=1;
	 * factorial *= number;
	 * 
	 * factorial is usually a big number, 
	 * and integer does not a large number, 
	 * so return type should be long. so method should be LONG not int. 
	 */

	
											public static long doFactorial (int number) {
												
												//declare a new int type variable
												
												long factorial = 1; 
												
												while (number > 1) {
													
													factorial *= number; //we are multiplying subsequent values with factorial
													number --; //decreasing the given number in every iteration by 1
													
												}
												
												return factorial; //returning the calculated value
												
											}
	
	
public static void main (String[] args) {
	
	//print factorial
		
	System.out.println("Factorial is: " + doFactorial(9));
	
	//print temp in F
	
	System.out.println("Fahrenheit value is: " + converttoF(42));

		
	}
	


 		//convert F to C

									public static double converttoF(int Celcius) {
										
										double F; 
										F = ((Celcius * 9) / 5) + 32; //conversion formula
										return F;
			
										
									}
									
								

}
