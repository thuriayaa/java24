package day4;

import java.util.Scanner;

public class SearchingElementsinArray {
	
	public static void main (String[] args) {
		
//create an array and search element
		
		int a[] = {10, 40, 20, 30, 60, 50, 90, 80}; //created array
		
//scanner class
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Please type a number to search for.");
		
		
//create a status state		
		
		boolean status = false; 
	
//declare a number to search for 
		
		int searcnum = sc.nextInt(); 
		
		for (int i = 0; i < a.length; i++) {
			
			if (searcnum == a[i]) {
				
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		
		if (status == false) {
			System.out.println("Sorry!! Element not found");	

		}
		
		
		
		
	}

}
