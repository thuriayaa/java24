package day5;

public class PalingdromeOrNot {
	
	public static void main (String[] args) {
		
//reverse a number using the while loop		
		
	int originalnumber = 555, reverse = 0;
	
	System.out.println("The original number is: " + originalnumber);
	
	int number = originalnumber;

	
	while (number != 0) {
		
		int reminder = number % 10;
		
		reverse = reverse * 10 + reminder;
		
		number = number  / 10; 
	
	}
		System.out.println("The reverse number is: " + reverse);
		
		

		
// palindrome, if these two things remain same, then it is palindrome		
		
		
		if (originalnumber == reverse) {
			
			System.out.println("It is a Palindrome");
			
		} 
		
		else {
			
			System.out.println("Not a palindrome!!");
		}
		
		
		
		
//action item 4 - reverse a number 
		
				System.out.println("\n\nAction item 5 start");

				
				long n1 = 17342, rvs = 0;
				
				System.out.println("\n\nInitial # is: " + n1);
				
				long n2 = n1;
				
				while (n2 != 0) {
					long n3 = n2 % 10; //reminder 
					rvs = rvs * 10 + n3;
					n2 = n2 / 10;
				} System.out.println ("The original number after reverse is: " + rvs );
				
				if (n1 == rvs) {
					System.out.println("It is a Palindrome");
				} else {
					System.out.println("It is not a Palindrome");
				}
				
				System.out.println("\n\nAction item 5 end");

					

		 
		
		
		
		
	}

}
