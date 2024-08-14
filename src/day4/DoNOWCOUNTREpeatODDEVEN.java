package day4;

public class DoNOWCOUNTREpeatODDEVEN {

	
public static void main (String[] args) {
	
	// DO NOW: declare an int array, find out how many even and odd numbers are available in that array
			

int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

int even = 0;
int odd = 0; 

for (int variable :a) {
	
	if (variable%2 == 0) {
		even ++; 
		
	} else {
		odd++;
	}
}
	System.out.println("Number of even numbers: " + even);
	System.out.println("Number of even numbers: " + odd);
}


}

