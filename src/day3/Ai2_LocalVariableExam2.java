package day3;

public class Ai2_LocalVariableExam2 {
	
	//Example 2: Variable's local scope without initialization

public void pupAge() {
	int age = 2; 
	age = age + 7;
	System.out.println("The little dog's age is: " + age);

}

public static void main (String args[]) {

	Ai2_LocalVariableExam2 test = new Ai2_LocalVariableExam2();
	test.pupAge();
}

//1 error -> asks for initial value. 
}
