package day6;

public class MethodDemo {
	
//Method type 1. No parameter and no return
	
	/**
	access modifier: public
	return type: void
	method name: static/non-static. in method avoid static. 
	method name
	
	*/
	
	public void methodOne() {
		
		System.out.println("This is Method one practice");
		
	}

// method 2: no para but returns value
	
	public String methodTwo() {
		String a = "Hello.";
		String b = " How are you?"; 
		
		return a + b; // a + b is called an expression  
		
		//after return statement, all codes are dead and do not return. 
		
	
	}
	

// method 3: parameters but no returns, can have more than 1 parameter
	
	public void methodThree(String name) {
		
		System.out.println(name + ", how are you?");
		
	}
	

// method 4: accepts parameters and returns values 
	
	public int add (int a, int b) {
		return (a + b);
	}
	
	
/*
 * 1. method name is a user defined name
 * but it should display the intent of performing an action
 * 
 * 2. method may or may not return any value
 *
 * 3. method may or may not accept parameters
 * 
 * 4. methods can be invoked through objects
 * 
 * 5. A method is created to perform certain action
 * 
 * 
 * 
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
