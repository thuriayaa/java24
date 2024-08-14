package day6;

public class Test {
	
//test class for the class named: Student (the other file)
//every class has a contractor  
	
	public static void main (String[] args ) {
		
		/*
		 * new student() this line creates an object for this class, to use it,
		 *  we need to save it under a variable, student1, data type is student
		 *  
		 *  (create an object of student class, and save it under a reference variable)
		 */

//object of student class
		
		Student student1 = new Student(); 
		student1.sid = 1001;
		student1.name = "Mahmud"; 
		student1.grade = 'A';
		
		student1.printStudentData();	
		
		
		String s = new String("Welcome");
		s.length(); 
		s.replace("W", "X"); 
		

//object of employee class
		
		Employee emp1 = new Employee(); 
		
		emp1.eid = 7007;
		emp1.name = "Malon";
		emp1.department = "Finance";
		emp1.salary = 130000;
		
		emp1.display(); 
		
	/** do not do this way. it gives null values. 
	 * use a reference variable. 
	 * 
		new Employee().name = "Shorna";
		new Employee().eid = 8000;
		new Employee().department = "QA";
		new Employee().salary = 13000;
		new Employee().display(); 
		
		*/
		
		
		
		
	}

}
