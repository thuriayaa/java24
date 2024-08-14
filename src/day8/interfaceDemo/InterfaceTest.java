package day8.interfaceDemo;

public class InterfaceTest implements Shape {

	@Override
	public void circle() {  //triangle shows overridden of interface
		// TODO Auto-generated method stub
		
		
		System.out.println("Circle belongs to abstract method\n\n");
		
	}
	
	public void triangle () {
		
		System.out.println("Triangle belongs to interfacetest class\n\n");
	}
	
	
	public static void main (String[] args) {
		
		InterfaceTest iobj = new InterfaceTest();
		
		iobj.circle(); //abstract method implemented in this class
		iobj.square(); //default method
		iobj.triangle(); //current class method
	
		Shape.rectangle(); //static method, interface name and dot to call it
		
		System.out.println("Area is " + Shape.length * Shape.width);
		
		
	}
	
	
	

}
