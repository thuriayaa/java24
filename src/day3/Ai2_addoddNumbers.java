package day3;

public class Ai2_addoddNumbers {
	
	public static void main (String[] args) {
		
		int sum = 0; 
		
		for (int i = 1; i < 20; i+=2) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}
