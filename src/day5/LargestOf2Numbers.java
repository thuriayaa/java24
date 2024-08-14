package day5;

public class LargestOf2Numbers {
	
	public static void main (String[] args) {
		

		int n1 = 78, n2 = 58, largest; 
		
		largest = (n1 > n2) ?  n1 : n2; //ternary operator needs 3 operands, if true, then n1, if false n2. 
		
		System.out.println("The largest number is: " + largest);
		
		
		
		
		short num1 = 200, num2 = 52, greater;
		
		greater = (num1 > num2) ? num1 : num2; 
		
		System.out.println("The greater number is " + greater);
		
		
		double d1 = 1.234, d2 = 4.444, larger; 
		
		larger = (d1 > d2) ? d1 : d2;
		
		System.out.println("The larger number is " + larger);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
