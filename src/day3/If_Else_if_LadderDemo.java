package day3;

public class If_Else_if_LadderDemo {
	
	public static void main (String[] args) {
		/**
		 * let's create a program that:  if result >= 90 grade A
		 * if result is <90 >=70 grade B
		 * if result is >= 60 >70 grade C
		 * rest = grade F
		 * 
		 * we will use if else if statements
		 */
		
		int result = 88;
		
		if (result <=100 && result >= 90) {
			System.out.println("Grade A");
		} 
		
		else if (result <90 && result >=70) {
			System.out.println("Grade B");
		}
		
		else if (result <70 && result >=60) {
			System.out.println("Grade C");
		}
		
		else {
			System.out.println("Grade F");
		} 
		

		
		
		System.out.println("End of else if grade code");
		
		/*
		 * this is if else if ladder, we wrote (result <=100 && result >= 90) an expression 
		 * that returns a true/false boolean statement. and -> && both side has to be true
		 * else does not need logic but with else if we need. 
		 */
		
		
		
	}

}
