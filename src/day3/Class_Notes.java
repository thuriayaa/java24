package day3;

public class Class_Notes {
	
	/* what is automation? why do we need automation? what to automate?
	 * 
	 * Different methods of software development process? 1. agile, 80% 2. waterfall 
	 * - different types of frame work in agile
	 * 
	 * Which tools we will use for automation, we will learn selenium, why? selenium started 10 years ago, it is 
	 * pre-dominant in the market, if you one method, then learning another is easier because you already know
	 * one tool use. selenium is our start point. we know some basics, then we can master it, like APIs jobs. 
	 * it is widely used and used for automation. 
	 * 
	 * what is the relationship between selenium and java? 
	 * - selenium - is a sodo tool: selenium ID, webdriver, selenium brief 
	 * - selenium web driver is API - 
	 * - selenium brief is for cross browser/platform testing 
	 * 			- mostly used java for its communication 
	 * 
	 * we used a website, we went to oracle, we went to java.sun.com, from there we got java, there were lts java 
	 * java 17. 
	 * 
	 * for selenium, we need java basics 
	 * 
	 * terminal: java space - version to check java version 
	 * 
	 * download eclipse... 
	 * 
	 * we learned about how to do jshall, 
	 * to start jshall - just write jshall
	 * to stop a not stop code request  - control C for windows, control D for macOs
	 * to exit jshall - /exit 
	 * 
	 * we learned about data types etc... 
	 * 
	 * Day 2 we learned about data types, all operators (6 types of operators ) 
	 * 
	 * there are six types of operators. these operators can be 3 categories based.
	 * 
	 * we learned expressions and statements 
	 * 
	 * expression: anything turns to one item, 
	 * 
	 * statement is a complete set of code and do not need data type or semicolon
	 * 
	 * 
	 */
	
	/** Day 3 Notes:
	 * 
	 * What is java?
	 * -> java is a high level object oriented and platform independent programming language 
	 * -> sole purpose is to communicate with a computer 
	 * 
	 * high level language: it is nearer to English, related to spoken language and easy to understand 
	 * 
	 * platform independent: what is platform is operating system, like windows, mac, lenux. for java,
	 * you write your program on in a platform, you can run everywhere 
	 * 
	 * object oriented: what makes it object oriented? 
	 * OOPS: runs based on (object oriented programming system ? )
	 * 1. classes
	 * 2. objects
	 * 3. polymorphism 
	 * 4. inheritence concept
	 * 5. data abstraction 
	 * 6. support encapsulation  
	 * 
	 * Types of programming language: 3 types
	 * 1. structure, ex: c, python, 
	 * 2. object based, ex: VB - visual basic, VBscript, python 
	 * 3. object oriented, ex: C++, Java, C#, python
	 * 
	 * object based verse object oriented is that
	 * object based do not support polymorphism or inheritance 
	 * 
	 * History of java: 
	 * - 
	 * 
	 */
	
	/*
	 * Control statement: 5 types. Control the flow of execution. 
	 * 1. control using if condition 
	 * 2. control using looping or itoration statement or jump statement 
	 * 
	 * Last time, we learned about if statement, syntex of if statement is 
	 * 
				 * if(boolean expression) { block of code goes here
				 * } 
				 * 
				 * Example: 
				 * if (true) {
				 * 		System.out.println("we speak the truth."); 
				 * }
				 * 
				 * Example: 
				 * int person_age = 18; 
				 * if (person_age >= 18) {
				 * System.out.println("Eligible to vote."); 
				 * } else {
				 * System.out.println("Not eligible to vote."); 
				 * } 
				 * System.out.println("End of the program.");
				 * 
	 * 
	 * 
	 */

	public static void main (String[] args) {
		
		
		if (true) {
			System.out.println("we speak the truth."); 
		}
		
		System.out.println("Start of the program.");
		
		int person_age = 18; 
		 if (person_age >= 18) {
		 System.out.println("Eligible to vote."); 
		 } else {
		 System.out.println("Not eligible to vote."); 
		 } 
		 System.out.println("End of the program.");
		
	}
	
}
