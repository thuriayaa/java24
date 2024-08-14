package day5;

public class CountEvenOddDigitsinANumber {
	
	public static void main(String[] args) {
		
		int num = 251, oddcount = 0, evencount = 0; 
		
		
		
		while (num > 0) {
			
			int digit = num % 10;
			
			if (digit % 2 == 0) {
				
				evencount ++;
			}
			
			else {
				
				oddcount ++; 
			}
			
		//	num /= 10; 
			
			num = num / 10; //same as num /= 10;
		}
		
		System.out.println("Even count: " + evencount);
		
		System.out.println("Odd count: " + oddcount);
		
		
//*************************************************************************
		
		short s = 24433, countodd = 0, counteven = 0; 
		
		while (s > 0) {
			
			long d = s % 10; 
			
			if (d % 2 == 0) {
				counteven ++ ;
			} 
			
			else {
				countodd ++;
			}

			s /= 10;
		}
		
		System.out.println("\n\nCount even = " + counteven);
		System.out.println("Count odd = " + countodd);
		
		
		


// count number of digits - action item 3 - # 6
		
		int n1 = 2023, count = 0; 
		
		while (n1 !=0) {
			
			n1 /= 10; 
			
			count ++; 
		} 
		
		System.out.println("\n\nThe number of digits in this number is " + count);
		
		
		}
		
		
		
		
		
	

}
