package day4;

import java.util.Arrays;

public class ArrayDemo {
	
	public static void main (String[] args) {
		
		
		/*
		 * Array is a collection of elements of same data type (Homogeneous data). 
		 * We can store multiple values into a single variable.
		 * 
		 * Array are two types:
		 * 1. one dimensional
		 * 2. multi-dimentional 
		 * 
		 * how to declare an array?
		 * 
		 */
		
		
//Single dimensional Array		
		
		//declare array
		
		int myArray[] = new int [100]; //method 1
		
		int [] myArray2 = new int[78]; // method 2
		
		
		
	//assign value to the array
		
		int Array[] = new int[5]; 
		
			Array[0] = 10;
			Array[1] = 20;
			Array[2] = 30;
			Array[3] = 40;
			Array[4] = 50;
			
	//extract value from the array
			
			System.out.println(Array[4]); 

			
			
				System.out.println("-- find out the length of an array -- ");

	//find out the length of an array
			
			int length = Array.length;
			System.out.println("the length of this array is: " + length);
			System.out.println(Arrays.toString(Array)); //outcome comes with all values in a bracket. 

			
			
				System.out.println("-- declare and assign values at the same time  -- ");

		
	//declare and assign values at the same time 
			
			int a[] = {1, 2, 3, 4, 5};
			
			System.out.println(a[4]); //5
			
			
			
				System.out.println("-- extracting all values of the array or print all array values  -- ");

	//extracting all values of the array or print all array values
			
			System.out.println(Arrays.toString(a)); //outcome comes with all values in a bracket. 
			
			
			
		
				System.out.println("-- print all values using for loop  -- ");

	//print all values using for loop	
			
			for (int i = 0; i < 5; i++) {
				System.out.println (a[i]);
			}
			
			
			
			
				System.out.println("-- use enhanced for loop to print all the values out of an array  -- ");

	//use enhanced for loop to print all the values out of an array
				//limitation is that you can't print the array values backward
			
			for (int mA :a) { 
				System.out.println(mA);
			}
			
			
				System.out.println("-- Printing values backward from the last to first in the array index  -- ");

	//Printing values backward from the last to first in the array index
				
				for (int k = 4; k >= 0; k--) { //be careful about the length, reduce by a number. 
					System.out.println(a[k]);
				}
				
				
		System.out.println("-- print with .lenth   -- ");

			
				for (int j = a.length -1; j >= 0; j--) { //be careful about the length, reduce by a number. 
					System.out.println(a[j]);
				}
			
			
		//System.out.println(a) -> cannot print array in this manner. 
				
				
			}
					
			
	}


