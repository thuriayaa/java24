package day2;

public class OperatorsDemo {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		// this is called main method, for java to run any java needs main method. 
		//no main method, java does not run.
		/*
		 * we are learning about Java Operators
		 * in Java, there are operators? what is operators?
		 * 
		 * What is operators? 
		 * -> operator is a symbol that will perform an operation.
		 * 
		 * if we write: int a = 50; -> in here equal is the operator. int is the data type, a variable, 
		 * equal operator, and 50 is the value
		 * 
		 * int a = 50;
		 * int b = 25;
		 * int c = a + b; 
		 * 
		 * addition is an operator, equal assigns value to the variable. 
		 * 
		 * How many types of operator in Java? 
		 * The commonly used operators are: 
		 * 
		 * 1) Arithmetic operators: add, subtract, multiply, division, % (modulas - reminder operator)
		 * 
		 * 2) Relational/Comparison operators: > < >= <= != == (greater, less, greater equal, less equal, not equal
		 * and equal.)
		 * 
		 * 3) Logical operators: && (logical and), || (logical or), ! (logical not equal)
		 * 
		 * 4) Increment and Decrement operators:  ++, --
		 * 
		 * 5) Assignment (Shorthand) Operators: = += -= *= /= %= (because equal sign is next to each operator)
		 * 
		 * 6) Conditional/Ternary operator: ? :
		 * 
		 * 
		 */
		
		/**
		 * Unary Operator --> any operator on a single operand/variable is an unary operator
		 * 		1. assignment operator
		 * 
		 * Binary operator --> two variables or operand
		 * 	1. arithmetic operators
		 * 	2. relational operators
		 *  3. logical operators
		 * 
		 * Ternary operator --> 3 operand such as 
		 * 	1. conditional operators
		 * 	2. Increment and Decrement operators 
		 */
		
		
		 /* 
		 * Today, we are learning about arithmetic operator.
		 * 
		 */
		
		/*
		 * another way of declaring a variable and assigning value to it, 
		 * using comma after declaring the data type once in the beginning
		 */
		
		int a = 20, b = 10; 
		
		System.out.println("Sum of a and b is: " + (a + b)); //add operators variables in parentheses or else will not add 
		System.out.println("Sum of a and b is: " + (a - b)); // 10
		System.out.println("Sum of a and b is: " + (a * b)); // 200
		System.out.println("Sum of a and b is: " + (a / b)); // 2
		System.out.println("Sum of a and b is: " + (a % b)); //0
			 
		/*
		 *  Relational/Comparison operators: > < >= <= != == (greater, less, greater equal, less equal, not equal
		 * and equal.)
		 * 
		 * operators work with operants and will return a boolean value (either true or false)
		 * 
		 * we are operating using int a = 20, b = 10; 
		 */
		
		System.out.println("========= Relational Operators =========".repeat(3));
		
		System.out.println(a > b); // true
		System.out.println(a < b); // false
		System.out.println(a >= b); // true
		System.out.println(a <= b); // false
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		
		
		System.out.println("========= Logical Operators =========".repeat(3));

		/*
		 * 3) Logical operators: && (logical and), || (logical or), ! (logical not equal)
		 * 
		 * Logical operators also return boolean value, either true or false 
		 * also these operators with two boolean values as seen below
		 */

		/*
		 * x		 y		=>	x&&y		x||y		!x 			!y
		 * true		false	=>	false		true		false		true
		 * 
		 * logical && looks for both equal values, true if both values are same or else will return false
		 * logical || - false if both are false or else it is true
		 * not fasle means true
		 * not true means false
		 * 
		 * * x		 y		=>	x&&y		x||y		!x 			!y
		 * true		true	=>	true		true		false		false
		 * 
		 * x		 y		=>	x&&y		x||y		!x 			!y
		 * false	true	=>	false		true		true		false
		 * 
		 *	x		 y		=>	x&&y		x||y		!x 			!y
		 * false	false	=>	false		false		true		true
		 *
		 */
		
		
		boolean x = true, y = false; //boolean value with variables 
		
		System.out.println(x && y); // false - working with 2 boolean variables and answer will be a boolean also. 
		System.out.println(x || y); // true
		System.out.println(!x); // false
		System.out.println(!y); // true
		
		
		
	}
	
	
	

}
