package day4;

public class TwoDimensionalArray {
	
	public static void main (String[] args) {
		
//declaration of 2D Array
		
		int a[][] = new int [3][2];
		
//assigning values to the cells
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 600;
		a[1][1] = 700;
		
		a[2][0] = 800;
		a[2][1] = 900;

				System.out.println("print values of 2D Array -*- ".repeat(2));
				
//print values of 2D Array
		
		System.out.println(a[1][1]); //700
		
		
		
				System.out.println("declaring 2D array in one go -*-  ".repeat(2));

//declaring 2D array in one go. 
		
		int b [][] = { {1, 2, 23}, {3, 44, 5}, {5, 66, 7, 99} }; //jagged array has uneven number of values in sub arrays
	
		
		
				System.out.println("print a single value in an array -*- ".repeat(2));

//print a single value in an array
		
		System.out.println(b[2][2]);
		
		
			
				System.out.println("for loop print to print all values in the array -*- ".repeat(2));

// for loop print to print all values in the array
		
		for (int i = 0; i < a.length; i++) { //first index done. need to 2nd index for sub array.
			
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.println(a[i][j]);
			}
		}
		
					System.out.println("for loop all values 2nd array -*-  ".repeat(2));
					


			for (int i = 0; i < b.length; i++) { //first index done. need to 2nd index for sub array.
				
				for (int j = 0; j < b[i].length; j++) {
					
					System.out.println(b[i][j]);
				}
			}
		
			System.out.println("Enhance for loop print all -*-  ".repeat(2));

//Enhance for loop print all
			
			for (int arr[]: b) {
				for (int x : arr) {
					System.out.print(x + " "); 
				}
				
					System.out.println();
			}
			
			
			
	
	}
	
		
		
	

	}

