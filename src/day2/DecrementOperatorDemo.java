package day2;

public class DecrementOperatorDemo {

	public static void main (String[] args) {
		
		/*
		 * 4) Increment and Decrement operators:  ++, --
		 * 
		 * We will learn decrement -- now.
		 * 
		 */
		System.out.println("========= Decrement operators =========".repeat(3));

		int a = 100;
		
		//a = a - 1; 
		
		a--; //this is the decrement method, lower by 1 value.
		
		System.out.println(a); //99
		
		System.out.println("========= Post Decrement =========".repeat(3));

		int b = 100; 
		
		int result = b--;
		
		System.out.println(result); //100
		System.out.println(b); //99
		
		System.out.println("========= Pre Decrement =========".repeat(3));

		int c = 100;
		int res = --c;
		System.out.println(res); //99
		
		
		
		
	}
	
	
}
