package day8.inheritance;

public class InheritanceTest {
	
	public static void main (String[] args) {

System.out.println("\n\nPrint from the Only Child \n\n");

		B obj = new B(); //create a object class
		
		obj.a = 30;
		obj.b = 50; 
		obj.display(); //can see it b/c A & B has parent child relationship
		obj.show(); //its own method
		
System.out.println("\n\nPrint from GrandChild \n\n");

		C objs = new C(); 
		
		objs.c = 100; 
		objs.print();
		
		objs.a = 55;
		objs.b = 70;
		objs.display();
		objs.show();
		
		
System.out.println("\n\nPrinting from the Parent and her 2 Children \n\n");
		
	
	System.out.println("First Child \n\n");

		Child1 kid1 = new Child1();
		

		kid1.display1(130);
		kid1.show1(10);
		
		
	System.out.println("\n\nSecond Child \n\n");

		Child2 kid2 = new Child2();
		

		kid2.display1(800);
		kid2.print2(500);
		
		
	}

}
