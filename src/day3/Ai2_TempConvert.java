package day3;

public class Ai2_TempConvert {
	
	public int F(double c) { //non static method
		
		double result = ((c*9)/5) + 32; 
		
		return (int) result; 
		/**
		 * return - must be on the last line of function
		 * in a method 
		 */
	
	}
	
	public static void main (String[] args) {
		
		Ai2_TempConvert temp1 = new Ai2_TempConvert();
		
		System.out.println(temp1.F(23));
		
	}

}
