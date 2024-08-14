package day8.exceptionDemo;

public class ThrowKeyWord {
	
	public void checkSum (int num) {
		
		if (num < 1 ) {
			throw new ArithmeticException ("Number is invalid, cannot find the area of a square" ); 
			
		} else
		
		System.out.println(num * num); 
		
		
	}

	
	public static void main (String[] args) {
		
		ThrowKeyWord tk = new ThrowKeyWord();
		
		try { //used try catch to avoid red warning messages ...
		
		tk.checkSum(-9);
		
		} catch (Exception e) {
			
			System.out.println("Exception occured");
			
			
		}
		
		System.out.println("........ran all codes........");
		
		
	}
	
	//throw keyword is used to throw an exception while THROWS is used to handle/fix an exception 
	
	
	
}

