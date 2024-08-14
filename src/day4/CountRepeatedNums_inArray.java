package day4;

public class CountRepeatedNums_inArray {
	
	public static void main (String[] args ) {
		
		int a[] = { 10, 45, 30, 30, 40, 50, 20, 10, 30}; 
		
		int numLooking = 99; 
		
		int count = 0; 
		
		for (int value : a) {
			if (value ==  numLooking) {
				
				count++; 
			}
		}
		
		System.out.println(numLooking + " is present " + count + " times.");
		
		
		
		
	}

}
