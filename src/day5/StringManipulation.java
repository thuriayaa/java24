package day5;

public class StringManipulation {
	
	public static void main (String[] args) {
		
		
//Strings are immutable meaning it cannot be changed
		
//Method 1: String Literal
		
		String s = "Welcome 123";
		
		s = "Hello"; //separate memory for each "s" variable with string value. //prints this one.


		System.out.println(s.length()); //prints 2nd s.
		
		
		int num = 1000;
		num = 2000; //num value changed from 1000 to 2000, which means it is mutable. 
		

//another way to declare string
		
//Method 2: String Object
		
		String ss = new String("Welcome"); 
		
//to learn important methods of string class
		
		
/** length() -- counts all the characters in a string and returns the number in int data type, with the help of the class object, we can
 * access all methods of that object class. 
 */
	
		int length =	ss.length(); //it is a method, that's why it is followed by ();
		
		System.out.println("The length is: " + length);
		
//concat() - join multiple string
		
		String s1 = "Welcome"; 
		String s2 = " to joba"; 
		String s3 = " Programming.";
		
		
		System.out.println(s1 + s2);
		
		System.out.println(s1.concat(s2).concat(s3)); //prints in a line. 
		
//trim() - would trim any leading and trailing spaces from a string. 
		
		String td = "           welcome to java             ";
		
		System.out.println(td.length());
		td.trim();
		System.out.println(td.trim().length()); //to see the new length of the trimmed string, you need to save in a new string variable. 

//charAt() - return a single character out of a string from a specific index
//index starts from zero.
		
		s = "Java Selenium";  
		
		System.out.println(s.charAt(5));
	
		System.out.println(s.charAt(5));
		
//contains() - returns a boolean (true/false). it would check a string is the part of the main string or not 
		
		System.out.println(s.contains("Jav"));
		System.out.println(s.contains("Sel"));
		System.out.println(s.contains("ium"));
		System.out.println(s.contains("Sli"));//cannot be in between letters, so it is false. 
		System.out.println(s.contains("a S"));

//equals(), equalsIgnoreCase() - compares two strings and returns true/false. 
		
		s1 = "Welcome";
		s2 = "welcome"; 
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals("welcome")); //false
		
		System.out.println(s1.equalsIgnoreCase(s2)); //true - besides case, both same words
		
//replace() - it replaces a single character or character sequence of a given string
		
		s = "welcome to java selenium automation";
		
		System.out.println(s.replace("java", "python"));

//substring() - extract substring from the main string
		
		System.out.println(s.substring(11));
		System.out.println(s.substring(11, 15));
		
//toUpperCase() toLowerCase() -> Converts cases
		
		s = "Welcome"; 
		
		System.out.println(s.toUpperCase()); //WELCOME
		System.out.println(s.toLowerCase()); //welcome
		
//split() - split or divide or original string into multiple parts based on delimiter 
		
		s = "abc@xyz"; 
		String a[] = s.split("@");
		
		System.out.println(a[1]);
		
		s = "welcome to java selenium automation";
		String b[] = s.split(" "); 
		
		System.out.println(b[0]);
		System.out.println(b[3]);

		System.out.println(s.replace(" ", "_"));

//extract only abc from the following string
		
		s = "abc,123@m.com";
		String[] c = s.split(",");
		
		System.out.println(c[0]);
		
//string array method
		
		s = "abc,123@m.com";
		String d1 = "abc";
		String d2 = "123@m.com"; //because we split into multiple parts, we need a string array variable to save all parts into one.
		
		String[] c1 = s.split(",");
		
		System.out.println(c[0]);
		
		
		
		
		
	}

}
