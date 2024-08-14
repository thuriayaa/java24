package day3;

public class Ai2_Q4_factorial {
	public static void main (String[] args) {
		
		int f = 3;
		int i = 1; 
		int times = 1; 
		
		while (f >= i) {
			
			times = times * f; 
			f--; 
			System.out.println("Current value: " + times);
			
		}
		
		System.out.println("\n Output of 3! is " + times + ".\n");
		
	}

}
