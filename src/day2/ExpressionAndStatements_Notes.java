package day2;

public class ExpressionAndStatements_Notes {

		
		//void is a return type. 

		/*
		 * Expression and Statement
		 * - Very important and must be fluent on this
		 * - anything ends with a ; is a statement
		 * - if you declare a variable, add equal sign and then add a value, that's a expression, such as int a = 25; 
		 * 
		 * an Expression is a construct that evaluates to a single value. 
		 * Expression can be as simple as a literal or a variable or as complex 
		 * as a combination of multiple operators and
		 * method calls. 
		 * 
		 * -> expressions are often on the right side but sometimes it could be on the left side. 
		 * 		
		 * 		Example: 
		 * 				int[] myArray = new int[5]; 
		 * 				myArray[i] = 67;
		 * 
		 * Examples of Expressions: 
		 * 
		 * 1. Literal or variable 
		 * 		a. int x = 5; // 5 is an expression and it is literal
		 * 
		 * 		b. int y = x; // x is an expression, and it is a variable
		 * 
		 * 2. Examples of arithmetic operations 
		 * 
		 * 		a. int sum = x + y; // x + y is an expression
		 * 
		 * 		b. sum = (12+25) + (20/50); // (12+25) + (20/50) -> this whole thing is an expression
		 * 
		 * 3. Examples of Method Call
		 * 
		 * 		a. int length = "Hello".length(); // "Hello".length() is an expression 
		 * 
		 * 4. Boolean expression 
		 * 
		 * 		a. boolean adult = age >= 18; // age >= 18 this is an expression  
		 * 
		 */
		
		
		/* 
		 * Statement: a statement is a complete unit of execution that performs some action. It needs to contain some expression,
		 * without expression there cannot be any statements. These statements are made up of single or multiple expressions. 
		 * Statements are usually terminated by a semicolon (;) or by a closing curly bracket } which represents end of a code
		 * block. 
		 * 
		 * Types of Statements: 
		 * 
		 * 1. Declaration Statement
		 * 		Ex: int x; 	
		 * 
		 * 2. Assignment Statement
		 * 		Ex: x = 24; 
		 * 
		 * 3. Expression statement
		 * 		Ex: x = y + 23; // y + 23 is evaluated and that's the value of x. 
		 * 
		 * 4. Control Flow Statement 
		 * 		a) Conditional statement
		 * 				Ex: if(x > 0) {
		 * 								System.out.println("positive");
		 * 							}
		 * 			
		 * 		b) Loop statement
		 * 				Ex: (for int 1 = 0; i <= 5; i++) {
		 * 													System.out.println(i);
		 * 												}
		 * 
		 * 
		 * 		c) Switch statement: go to the asked statement and return that. 
		 * 				Ex: int day = 3
		 * 					
		 * 					switch(day) {
		 * 							case 1: System.out.println("Monday"); 
		 * 							return;
		 * 
		 * 							case 2: System.out.println("Monday"); 
		 * 							return;  
		 * 						}
		 * 
		 * 		d) Return statement: 
		 * 				Ex: public int doSum (int a, int b) {
		 * 														return a + b; 
		 * 												}
		 * 
		 * 		e) Try Catch statement: catch and block and continue.   	
		 * 				Ex: try {
		 * 							int result = 10/0; 
		 * 						} catch (ArithmeticException ae)
		 * 						
		 * 						{ 
		 * 							System.out.println("Arithmetic Exception");
		 * 						}
		 *
		 */
		
		
		public static void main (String[] args) {
			
			double s = 2.5444444444444;
			System.out.println(s);
			
			float g = 2.333F;
			System.out.println(g);
		}
		
		
		
		
	}


