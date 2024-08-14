package day8.exceptionDemo;

import java.util.Scanner;

public class ExceptionExamples {
	
	public static void main (String[] args) {
		

/*	
		
		System.out.println("Example ONE Started..............");
	
//Example # 1: ArithmeticException
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int num = sc.nextInt(); 
		
		System.out.println(100/num); //ArithmeticException - created the exception and stopped the execution of the rest of the code
		
		System.out.println("...............ArithmeticException Ended..............");

		

		System.out.println("Example TWO Started..............");

//Example # 2: ArrayIndexOutOfBoundsException
		
		int a[] = new int[5];
		
		System.out.println("Enter the position (0-4): ");
		
		int posn = sc.nextInt();
		
		System.out.println("Enter the value: ");
		
		int value = sc.nextInt();
		
		a[posn] = value;
		
		System.out.println(a[posn]);
		
		System.out.println("...............ArrayIndexOutOfBoundsException Ended..............");



		System.out.println("Example THREE Started..............");

//Example # 3: NullPointerException
		
		String s = null;
		
		int len = s.length(); 	
		
		System.out.println(len);
		
		System.out.println("...............NullPointerException Ended..............");



		sc.close();
		
*/
		
		System.out.println("Example FOUR Started..............");
		
//Example # 4: NumberFormatException	
		
		String s = "Welcome";
		int num = Integer.parseInt(s); //parseInt - if a strong contains a number, it will convert that string to number. 
		System.out.println(num);
		
		System.out.println("...............NumberFormatException Ended..............");
		
		
		
		System.out.println("...............Program Ended..............");

		
	}

}
