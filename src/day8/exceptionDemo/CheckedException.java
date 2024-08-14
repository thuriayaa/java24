package day8.exceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	
	public static void main (String[] args)  {
		
		System.out.println("Program started................");
		
		
	try {
		FileInputStream fis = new FileInputStream("c:\\file.txt");
	} catch (FileNotFoundException e) {
		// 
		e.printStackTrace();
	} 
	
	//this will throw an exception whether the link is correct or not. 
	
	//error gives two option. throw declaration. or try catch option and sets up the try catch code - these 2 ways to handle exceptions 
	
	
		
		
		
		
		
		System.out.println("............The END..............");
		
	}

}
 