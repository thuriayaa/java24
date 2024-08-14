package day1;

public class DataTypes {
	
	public static void main (String[] args) {
		
		System.out.println("Byte\t" + Byte.SIZE + "\t"

                           + Byte.MIN_VALUE + "\t"

                           + Byte.MAX_VALUE);
	
	
	//all data types info details
		
		   System.out.println(

		            "S.No.\t  Data Type\t  Size\t  Min. Value\t\t  Max. Value\t");

		        System.out.println("1\t  Byte\t\t" + Byte.SIZE

		                           + "\t" + Byte.MIN_VALUE

		                           + "\t\t\t" + Byte.MAX_VALUE);

		        System.out.println("2\t  Short\t\t" + Short.SIZE

		                           + "\t" + Short.MIN_VALUE

		                           + "\t\t\t" + Short.MAX_VALUE);

		        System.out.println("3\t  Integer\t" + Integer.SIZE

		                           + "\t" + Integer.MIN_VALUE

		                           + "\t\t" + Integer.MAX_VALUE);

		        System.out.println("4\t  Float\t\t" + Float.SIZE

		                           + "\t" + Float.MIN_VALUE

		                           + "\t\t\t" + Float.MAX_VALUE);

		        System.out.println("5\t  Long\t\t" + Long.SIZE

		                           + "\t" + Long.MIN_VALUE + "\t"

		                           + Long.MAX_VALUE);

		        System.out.println("6\t  Double\t" + Double.SIZE

		                           + "\t" + Double.MIN_VALUE

		                           + "\t\t" + Short.MAX_VALUE);

		        System.out.println("7\t  Character\t"

		                           + Character.SIZE);
		        
		   
		        
		        
		    //data types examples 
		        
		        byte x = 5; 
		        short y = 53;
		        int z = 1205;
		        long a = 133333333L; 
		        float d = 23445.2F; 
		        double c = 23.234; 
		        char e = 'A';
		        
		 
		        
		        System.out.println(x + y + z + a + d + c + e); 
		        
		        
		   // examples of character data type
		        
				/*
				char ch = 'a'; 
				// Unicode for uppercase Greek omega character
				char uniChar = '\u03A9';
				// an array of chars
				char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
				*/
				
		System.out.println(
				"I am tired. "
				+ "\n I want to sleep now. "
				+ "\n I missed prayer for sleep. "
				+ "\n Today was tiring. "
				+ "\n I need to finish this homework and send it before I sleep");
		        
	
	
	}

}
