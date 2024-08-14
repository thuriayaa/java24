package day8.interfaceDemo;

public interface Shape {
	
	 /*
	  *  any variable names becomes italic because these are static variable,
	  *  any variables in interface are final and static automatically without writing those keywords final & static
	  *  
	  *  static variable can be called, classname and variable name to call it. no need to make an object of it.
	  *  
	  *  any abstract method we create in interface are public, we don't need to write it public, writing public gives an error 
	  *  
	  *  just return type and method name, no need for {} or method body. 
	  *  
	  *  interface accepts static and default methods 
	  */
	
	int length = 10;
	int width = 20;
	
	void circle();
	
	//default method, need to declare default for it to be default, it will have implementation 
	
	default void square () {
		
		System.out.println( "Square belongs to default method\n\n" );
		
		
	}
	
	//methods are public - without the access modifier 
	
	//interface accepts static method
	
	public static void rectangle () {
		System.out.println("Rectangle belongs to the static method\n\n");
	}
	
	
	
	
}
