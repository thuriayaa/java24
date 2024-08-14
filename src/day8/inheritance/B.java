package day8.inheritance;

public class B extends A { //refer to parent A by using extent keyword and B acquires A's variable and method
	
	int b; 
	
	public void show () {
		
		System.out.println("Printing b from child/sub class " + b);
	}

}
