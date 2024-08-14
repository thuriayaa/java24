package day5;

import java.util.Arrays;

public class ReversingAnArray {
	
	public static void main (String[] args) {
		
//array is homogenous, it will only hold the data you declared, such as int. 
		
		int a [] = { 
				10, 45, 23, 76, 35, 90, 35
		};
		
		System.out.println("My array is: " + Arrays.toString(a));

	//	int size = a.length;
		
		for (int i = 0; i < a.length/2; i++) { //then replace a.length with variable size
			
			int temp = a [i];
			
			a[i] = a[a.length - i - 1];
			
			a[a.length -i - 1] = temp; 
			
		}
		
		System.out.println("Reverse array: ");
		
		System.out.println(Arrays.toString(a));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
