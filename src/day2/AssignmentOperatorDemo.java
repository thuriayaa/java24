package day2;

public class AssignmentOperatorDemo {
	
	public static void main (String[] args) {
		
		/*		
		 *  5) Assignment (Shorthand) Operators: = += -= *= /= %= (because equal sign is next to each operator)
		 */
		
		
		
		System.out.println("========= Assignment Operators =========".repeat(3));

		System.out.println("========= example 1 =========".repeat(3));

		//Example 1
		
		int a = 10;
		//a = a + 5; 
		
		a += 5; //assignment method of increasing a variable value with more than 1. 
		
		System.out.println(a); //15

		System.out.println("========= example 2 =========".repeat(3));

		
		// Example 2
		
		int b = 10;
		
		//b = b - 5; 
		
		b -= 5; //assignment method to decrease by more than 1
		
		System.out.println(b); //5
		
		System.out.println("========= example 3 =========".repeat(3));
		
		// Example 3

		int c = 10;
		
		//c = c * 5; 
		
		c *= 5; //assignment method to multiply 
		
		System.out.println(c); //50
		
		
		System.out.println("========= example 4 =========".repeat(3));
		
		// Example 4
		
		int d = 50;
		
		//d = d / 5; 
		
		d /= 5; //assignment method to divide
		
		System.out.println(d); //10
		

		System.out.println("========= example 5 =========".repeat(3));
		
		// Example 5
		
		int e = 70;
		
		// e = e % 6; 
		
		e %= 6;
		
		System.out.println(e); //4
	}

}
