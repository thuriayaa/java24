package day8.exceptionDemo;

public class HandleException {
	
	public static void main (String[] args) {
		

		System.out.println("Example THREE Started..............");

/**
//Example # 3: NullPointerException
		
		String s = null;
		
		try {
		
		int len = s.length();  	
		

		System.out.println(len);
		
		} catch (NullPointerException e) {
			
			System.out.println("Null Pointer Exception");
			
		}
		
		System.out.println("...............NullPointerException Ended..............");
		
		
		
		//did not show red line error warning but printed exception error statement from the code and completed running of the whole code

		*/

		
String s = "Welcome";
		
		try {
		
		int num = Integer.parseInt(s); 	
	
		System.out.println(num);
		
		
		} catch (NullPointerException e) {
			
			System.out.println("Null Pointer Exception");
			
		}

		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Null Pointer Exception");
			
		}
		
		
		
		
		
	}

}
