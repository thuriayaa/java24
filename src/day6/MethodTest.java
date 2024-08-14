package day6;

public class MethodTest {

	public static void main (String[] args) {
		
		/** call method one file...
		 * 
		how to call? by class. 
		
		This method 1: does not take parameter and does not return anything
		
		*/
		
		MethodDemo m = new MethodDemo(); 
		
		m.methodOne();
		
		String result = m.methodTwo();
		
		System.out.println(result);
		
		m.methodThree("Sahana"); //b/c it is not return anything, it cannot be saved under a value. 
		
		int sum = m.add(100, 3); //method 4 returns 
		
		System.out.println(sum);
		
		
	
	}
	
}
