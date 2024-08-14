package day0_Homework;

public class AI5_StarTriangle {
	
	public static void startri (int n) {
		
		int a, b; 
		
		for (a = 0; a < n; a ++) {
			
			for (b = 0; b <= a; b ++ ) {
				
				System.out.print("* "); 
				
			}
			
			System.out.println(); 
		}
		
	}
	
	public static void main (String[] args) {
		
		int k = 5; 
		
		startri(k);
		
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 

		
		
		
		
		int rows = 5; 
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("* "); 
				
			}
			System.out.println(); 

		}
		
		
		
		
		
		
	}

}
