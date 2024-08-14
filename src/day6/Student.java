package day6;

public class Student {
	
	/*
	 * in the class, we don't take the main method. 
	 * this is a non-static
	 * 
	 * class does not create any memory but its object holds heap memory 
	 */
	
	
	int sid; 
	String name;
	char grade;
	
	public void printStudentData() {
		
		System.out.println(sid + " " + name + " " + grade + " ");
		
	}
	
	
}
