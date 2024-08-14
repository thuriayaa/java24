package day5;

public class SmallestOf3Numbers {
	
	public static void main (String[] args) {
		
//method 1: 
		
		int a = 89, b = 67, c = 37, smallest; 
	
//comparing a and b and printing the smallest
		
		int temp = (a < b) ? a : b;  
		
//comparing temp with c and store the result in smallest value
		
		smallest = (c < temp) ? c : temp; 
		
System.out.println ("The smallest number is with Method 1: " + smallest);
	

//Method 2:
//a more concise approach for brain storming - if logic compounded, one into another

		smallest = c < (a < b ? a : b) ? c : (a < b ? a : b);
		
		
		System.out.println ("The smallest number is with Method 2: " + smallest);
		
		
		
//method 1: 
		System.out.println();

		short apple = 5, orange = 7, banana = 10, smaller; 
		
		short smaller1 = (apple < orange) ? apple : orange;
		
		smaller = (smaller1 < banana) ? smaller1 : banana;
		
		System.out.println("The smallest number is " + smaller);
		
//method 2: 
		System.out.println();

		smaller = banana < (apple < orange ? apple : orange) ? banana: (apple < orange ? apple : orange);
		
		System.out.println ("The tinest number is with Method 2: " + smaller);

		
		
		
		
		
		
	}

}
