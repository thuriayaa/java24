package day4;

import java.util.Arrays;

public class PracticeDay4Notes {
	
	public static void main (String[] args) {
		
		int a[] = {10, 11, 23, 24, 24, 52, 52, 52, 53, 11, 10}; 
		
		int lookupnum = 10; 
		
		int count = 0;
		
		for (int value : a ) {
			
			if (value == lookupnum) {
				
				count++; 
				
			}
		}
		
		System.out.println(lookupnum + " is present " + count + " times");
		
		
		String b[] = {"apple", "orange", "apple", "apple"};
		
		String lookupword = "apple"; 
		
		int count2 = 0; 
		
		for (String value2: b) {
			if (value2 == lookupword) {
				
				count2++;
			}
		}
		
		System.out.println(lookupword + " is present " + count2 + " times");

		
		
		short c[] = {1, 1, 2, 3, 3, 3, 3, 4, 4, 2, 5, 5, 3};
		
		short lookupshort = 2; 
		
		short count3 = 0; 
		
		for (short value3 : c) { 
			if (value3 == lookupshort) {
				
				count3++; 
			}
			

		}
		
		System.out.println(lookupshort + " is present " + count3 + " times");

		
		double d[] = {2.3, 4.5, 7.8, 2.3, 2.3, 4.5, 7.8, 90.0};
		
		double lookupd = 7.8; 
		
		double count4 = 0; 
		
		for (double value4 : d) {
			if (value4 == lookupd) {
				
				count4++;
			}
		}
		
		System.out.println(lookupd + " is present " + count4 + " times.");
	
	
	char apple[] = {'a', 'b', 'a', 'a'};
	
	char lookupc = 'a'; 
	
	int count5 = 0;
	
	for (int valuechar : apple) {
		if (valuechar == lookupc) {
			
			count5++;
		}
		
	}
	
	System.out.println(lookupc + " is present " + count5 + " times.");

	
//===
			
	int myArray[] = new int [100]; 
//or 
	int [] myArray2 = new int [78]; 
	
	int array[] = new int[5];
	
	array[0] = 1;
	array[1] = 2; 
	array[2] = 3; 
	array[3] = 4;
	array[4] = 5;
	
	System.out.println(array[0]);
	
	long l[] = {55555555L, 55555555553L, 22222222222L};
	
	System.out.println(l[2]);
	
//.toString print all
	
	System.out.println(Arrays.toString(l));
	
	System.out.println(Arrays.toString(a));
	
	System.out.println(Arrays.toString(b));
	
	System.out.println(Arrays.toString(c));
	
	System.out.println(Arrays.toString(d));
	
//for loop print all
	
	for (int i = 0; i < 3; i++) {
		System.out.println(l[i]);
	}
	
	for (int i2 = 0; i2 < 4; i2++) {
		System.out.println(b[i2]);
	}

	for (int i3 = 0; i3 < 13; i3++) {
		System.out.println(c[i3]);
	}
	
	for (int i4 = 0; i4 < 8; i4++) {
		System.out.print(d[i4] + ", ");
	}
	                
	System.out.println();
	
//enhanced loop print all
	
	for (int ma: a) {
		System.out.print(ma + " , ");

	}
	
	System.out.println();
	
	
	for (String mb : b ) {
		System.out.print(mb + ", ");
	}
	
	System.out.println();

	for (char mc : apple) {
		System.out.print(mc + ", ");
		
	}
	
	
// count odd and even
	
	short st[] = { 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 9}; 
	
	short seven = 0; 
	
	short sodd = 0; 
	
	for (short ss : st) {
		if ( ss % 2 == 0) {
			
			seven++; 
		}
		
		else {
			sodd++;
		}
		
	}
	System.out.println();

	System.out.println("even # " + seven);
	System.out.println("odd # " + sodd);
	
// apple or orange
	
	String ao[] = {"apple", "apple", "orange", "orange", "orange"};
	
	String lookup2 = "apple";
	
	int oddcount = 0;
	int evencount = 0;
	
	for (String pp : ao) {
		if (pp == lookup2) {
			oddcount++;
		}
		else { evencount++;
	}
	
	}

	System.out.println("even orange # " + evencount);
	System.out.println("odd apple # " + oddcount);
	
	
	
	int berry[] = {22, 22, 22, 22, 22, 23, 23, 23, 23, 24};
	
	int evencount1 = 0;
	int oddcount1 = 0;
	
	for (int blue : berry) { 
		if (blue % 2 == 0) {
			evencount1++;
		}
		else {
			oddcount1++;
		}
	}

	System.out.println("even # " + evencount1);
	System.out.println("odd # " + oddcount1);
	
	
//main
	
	System.out.println("factorial of 15 is " + dofactorial(15));
	
	System.out.println("F value is " + convertFtoC(42));

	System.out.println("f is " + ctof(52));
}
	
	
	
	
// do factorial
	
public static long dofactorial (int number) {
	
	long factorial = 1; 
	
	while (number > 1) {
		factorial *= number;
		number--;
	}
	
	return factorial;
	
// temp convert 
	
	
	
}

//convert temperature F to C

	 
	public static double convertFtoC (int C) {
		
		double f;
		f = ((C * 9)/5) + 32; 
		
		return f;
		
	}

	
	public static double ctof (int cc) {
		
		double f;
		f = ((cc * 9)/5) + 32;
		
		return f;
		
	}
	

} 
	
	
	
	
	
	
	
	
