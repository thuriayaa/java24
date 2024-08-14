package day3;


public class Ai2_LocalVariables {
	
	//Example 1: Variable's local scope with initialization



	public void pupAge() {
		
		int age = 0; 
		age = age + 7;
		System.out.println("The little dog's age is: " + age);
		}
	
	public static void main(String args[]) {
		Ai2_LocalVariables test = new Ai2_LocalVariables();
		test.pupAge();
	} 
	
	//outcome: The little dog's age is: 7
	
	
}
