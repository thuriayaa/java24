package day6;

import java.util.Arrays;

public class LargestandLowest {
	
	public static void main (String[] args) {
		
		int arr[] = {  3, 8, 8, 9, 2, 67, 34};
		
		int mini = arr[0]; 
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < mini) {
				 
				mini = arr[i];
				
			} else if ( arr[i] > max) { 
				
				max = arr[i];
			}
		}
		
		
		System.out.println("The minimum number is: " + mini);
		
		System.out.println("The maxium number is: " + max);
		
		
//using predefined function/library

		int minimum = Arrays.stream(arr).min().getAsInt();
		
		int maximum = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("Minimum is: " + minimum);
		System.out.println("Maximum is: " + maximum);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
