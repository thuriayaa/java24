package day8;

public class Day8Notes {
	
	
	/**
	 * what did we learn last time?
	 * - polymorphism, 
	 * 
	 * we learned encapsulation, method overloading and concept overloading 
	 */

	/*
	 * Today's topics: 
	 * 
	 * Inheritance: in java, it is the technique where one class acquires the properties (variables) and behavior (method) of another class
	 * is called inheritance. 
	 * 
	 * Objective: 
	 * 
	 * 1. code re-usability 
	 * 2. avoid code duplication
	 * 
	 * types of inheritance: 
	 * 1. single: parent class, child class. one parent and child - single inheritance, keyword is extent
	 * 
	 * 2. multi level: one parent, child has a child who has a child, parent -> child -> child -> child -> child 
	 * 
	 * 3. hierarchy: a class, which is inherited by more than one class. one parent has multiple children.
	 * 
	 * 4. multiple: not possible in java. it is possible with the help of interface. 
	 * 
	 * 
	 * 
	 */
	
	/**
	 * sub package has a dot then another word to name
	 */
	
	/*
	 * Method Overriding (also called run-time-polymorphism and dynamic binding ): takes place between parent and child, 
	 * child wants to have its own implementation. 
	 * 
	 * there has to be a parent child relationship between classes
	 * 
	 * 1. possible only when there is inheritance
	 * relationship between two classes
	 * 2. should not change method signature
	 * 3. return type should be same
	 * 4. run time polymorphism 
	 * 
	 * method signature
	 * 
	 * public static void methodname (int a) {
	 * } 
	 * 
	 * cannot change return type, and public static void must stay same
	 * . what changes is what is between the curly bracket {} 
	 * 
	 * we cannot execute this until we run the code
	 * we create a relationship, but it is not implemented until run
	 * called run-time-polymorphism
	 *  and dynamic binding 
	 * 
	 * 
	 * famous interview question
	 * 
	 * what is the difference between method overloading and method overiding
	 * 
	 * method overloading takes in the same class. 
	 * this is also called complied type polymorphism 
	 * 
	 */
	
	/**
	 * there 53 keywords in java, such as: return, break, continue, public, different colors word are keywords, 
	 * one key word is: Final. 
	 * 
	 * what is the meaning of "final" keyword?
	 * 
	 * variable value cannot be changed or updated as it is final.
	 * 
	 * 
	 */
	
	
	
	
	/*
	 * what is interface?
	 * 
	 * what is data Abstraction? 
	 * - abstraction is the process of hiding the implementation details and showing only the functionality to the user. 
	 * it done inside a frame work or multiple classes, in java, it is done through interface. 
	 * 
	 * how many types of classes in java?
	 * class is a blueprint of an object
	 * 1. concrete: behaviors implemented
	 * 
	 * 2. abstract: have both abstract and concrete method
	 * 
	 * Interface contains only abstract methods 
	 * 
	 * Interface has few attributes: 
	 * 1. interface is blueprint of a class: guides you how to create a class
	 * 
	 * 2. when create variable, those variables are final and static (variables declared inside an interface are final and static)
	 * 
	 * 3. interface contains abstract method
	 * 
	 * 4. an abstract method has the method declaration but do not have implementation {} / 
	 * implementation means it would not have method body.
	 * 
	 * 5. any methods declared inside an interface are always public.
	 * 
	 * 6. Interface supports "Multiple" inheritance 
	 * 
	 * 7. a class extends another class, an interface extends another interface
	 * but a class implements interface 
	 * 
	 * - when we need to make relationship between class and interface, we have to implement. a class will implement an interface.
	 * 
	 * --> in interface there are many unspoken words. 
	 * 
	 * 8. we can create object reference for interface but we cannot instantiate an interface
	 * 
	 * - we declare an interface, example: 
	 * 
	 * public interface myinterface { variables methods }
	 * 
	 * -- we cannot do something like this for interview, like object declaration of concrete class. 
	 * 
	 * Bank b = new Bank(); -> myinterface obj = new myinterface();
	 * 
	 * we can make object reference of interface 
	 * 
	 * RemoteWebDriver
	 * 
	 * WebDriver driver = new ChromeDriver();  // that interface and class, 
	 * if they have inheritance relationship like parent child relationship
	 * 
	 * 
	 * 
	 * what is abstract method? an abstract method has the method declaration but do not have implementation.
	 * 
	 * 
	 */
	
	
	/**
	 * Exception: prevents the normal flow, unwanted or unexpected during the running of the program.
	 * 
	 * an exception is an unwanted event that occurs during the execution of a program, it disrupts its normal flow. 
	 * 
	 * jbm: it creates an exception object and throw, and terminates the running of the code. 
	 * 
	 * 
	 * errors also block normal flow of the code running. 
	 * 
	 * errors are two kinds: 
	 * 1. logical error 
	 * and 
	 * 2. syntax error. 
	 */
	
	/*
	 * errors cannot be handled and need to be fixed. 
	 * 
	 * Types of exceptions are two: 
	 * 1. checked exception: the exceptions are identified by the compiler.
	 * 
	 * 	Ex: FileNotFound
	 * 		IOException
	 * 		InterruptedExceptedException

	 * 2. un-checked exception: Not checked by the compiler and won't show error until the code is executed.
	 * these exception are thrown at run time. The compiler does not identify these exceptions. 
	 * 
	 * Ex:  ArithmeticException
	 * 		NullPointerException
	 * 		ArrayIndexOutOfBoundException
	 * 
	 * 
	 */
	
	
	
	/**
	 *  * Try catch statement: how to catch exception
	 * 
	 * try {
	 * 
	 * line/lines 
	 * line2
	 * line3
	 * } 
	 * 
	 * catch (ArithmeticException np) {
	 * System.out.println("ArithmeticException" ) ;
	 * 
	 * }
	 * 
	 * finally { //finally do not need logic (), will be executed regardless of logic statement. 
	 * 
	 * sc.close();
	 * 
	 * }
	 * 
	 * Finally block: 
	 * 1. case 1: exception occured and catch block handled  --> finally block will execute
	 * 2. case 2: exception occured, catch block not handled --> finally block will execute
	 * 3. case 3: exception does not occured, catch block ignored --> finally block will be executed
	 */
	
	/*
	 * what is the difference between throw and throws? two different key words.
	 * 
	 * throws is used to handle/fix checked exceptions 
	 * 
	 * throw keyword is used to throw an exception while THROWS is used to handle/fix an exception 
	 * 
	 */
	
	
	
	
	
}
