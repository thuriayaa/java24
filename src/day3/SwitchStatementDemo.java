package day3;

public class SwitchStatementDemo {
	 




	public static void main (String[] args) {
		
/** switch code/syntax starts 
		
switch (variable) {

case 1: {
	//code
	break; 
}

case 2: {
	//code 
	break;
}

default: {
	//code
	break; //this does not make any difference as default is the last bit of code to be executed 
}

}

switch code ends*/
		 
	
	int num = 4; 
	
	switch (num) {
	case 1: {
		System.out.println("Monday");
		break; //break is a jump statement
	} 
	
	case 2: {
		System.out.println("Tuesday");
		break;
	} 
	
	case 3: {
		System.out.println("Wednesday");
		break;
	} 
	
	case 4: {
		System.out.println("Thursday");
		break;
	} 
	
	case 5: {
		System.out.println("Friday");
		break;
	} 
	
	default: {
		System.out.println("This number is not any day of the week");
	}
	
	
	}
		
		
		
		
/** DO NOW
 * write a switch statement to determine which browser to be launched? 
 * 
 * the browser options are: chrome, Firefox, Edge, 		
 */

		System.out.println("Start of Browser code launch");
		
		int browser = 4; 
		
		switch (browser) {
		case 1: {
			System.out.println("Chrome");
			break; //break is a jump statement
		} 
		
		case 2: {
			System.out.println("Firefox");
			break;
		} 
		
		case 3: {
			System.out.println("Edge");
			break;
		} 
		
		
		default: {
			System.out.println("If none found, start Safari");
		}
		
		
		}
			System.out.println("Out of Browser code launch");
		
		
	
/**print the new method [determineBrowser(String browserName)] in this main method*/
			
			determineBrowser("Firefox"); //this is called method calling, this method accepts an argument/string
			
			

			
			
		}
		

	

//start a new method, how to do a new method. 
/**
 * to declare a method, we need to call access modifier
 * 
 * what is method? method is a piece of code, which can be executed independently 
 * we need access modifier - public, static - method type, void - return type
 * we need method name: determineBrowser (should start with small letter, should not start with number, no special 
 * character, may or may not parameter, needs to have a body.)
 * cannot use method as variable
 * 
 * there is also a non-static method, then we don't mention the word static. 
 * 
 * void means there is no return statement, cannot use this method as variable, we can print using it. 
 * 
 */

public static void determineBrowser(String browserName) {
	
	switch(browserName) {
	
	case "Chrome": {
		System.out.println("Launch Chrome Broswer.");
		break;
	}
	case "Firefox": {
		System.out.println("Launch Firefox Broswer.");
		break;
	}
	case "Edge": {
		System.out.println("Launch Edge Broswer.");
		break;
	}
	default: {
		System.out.println("The browser is not supported.");
		break;
	}
	
	}
	
	
	System.out.println("End of Browser code launch with the new method");

	
	
	
	
	
	System.out.println("\n \nAction item 3, print day of the week number");
	
	
	String day = "Monday";
	
	switch (day) {
	
	case "Monday" : {
		System.out.println("Day 1");
		break;
	}
	
	case "Tuesday" : {
		System.out.println ("Day 2");
		break;
	}
	
	case "Wednesday" : {
		System.out.println ("Day 3");
		break;
	}
	
	case "Thursday" : {
		System.out.println ("Day 4");
		break;
	}
	
	case "Friday" : {
		System.out.println ("Day 5");
		break;
	}
	
	case "Saturday" : {
		System.out.println ("Day 6");
		break;
	}
	
	case "Sunday" : {
		System.out.println ("Day 7");
		break;
	}
	
	default: {
		System.out.println("Not a day of the week");
	}
	
	}
	
	System.out.println("End of action item 3");
	
	
	
	
	
	
	
	
	
}









}


