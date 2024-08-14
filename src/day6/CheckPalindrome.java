package day6;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		
//Q6. Remove junk or special character from a string
		
		
//Q5: palindrome method return
		
		String input = "String";
		
		System.out.println("Given string is a palindrome = " + isPalindrome(input));
		
		String doubtfulinput = "This is my string with special characters : _*&^%$#@!";
		
		String result = doubtfulinput.replaceAll("[^-zA-Z0-9]", "");
		
		System.out.println(result + " result is");
		
		
		
		
//main method	
	}
	
//palindrome 
	
	public static boolean isPalindrome (String str) {
		
		String reversed = "";
		
		for ( int i = str.length() -1; i >= 0; i-- ) {
			
			reversed += str.charAt(i);
			
		}
		
		return str.equals(reversed); 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
