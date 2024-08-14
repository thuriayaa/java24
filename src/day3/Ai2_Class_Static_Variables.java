package day3;

public class Ai2_Class_Static_Variables {
	
	//salary variable is a private static variable
	
	public static double salary;
	
	// department is a constant
	
	public static final String DEPARTMENT = "Development";
	
	public static void main(String[] args) {
		salary = 1000;
		System.out.println(DEPARTMENT + " average salary: " + salary);
		
	}

}
