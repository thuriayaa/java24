package day8.overriding;

public class TestFinalKeyWord {
	
	final int rollNo = 1001; 
	
	
	public static void main (String[] args) {
		
		TestFinalKeyWord obj = new TestFinalKeyWord();
		
	/**
	 * 	obj.rollNo = 1002; //when used final keyword it shows error, 
	 * cannot assign new value to the variable, cannot override or assign new value
	 * 
	 * when we assign final to a variable value, it cannot be updated or changed. 
	 * 
	 */
		
		System.out.println("Roll No is " + obj.rollNo);
		
		
	}

}
