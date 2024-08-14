package day3;

public class Ai2_InstanceVariable {
	
	//this instance variable is visible for any child class.
	
	public String name;
	
	// salary variable is visible in Employee class only
	
	public double salary; 
	
	// the name variable is assigned in the constructor 
	
	public Ai2_InstanceVariable (String empName) {
		name = empName;
	}

	
	// this salary variable is assigned a value
	
	public void setSalary(double empSal) {
		salary = empSal;
	}
		
	// this method prints the employee details
		
		public void printEmp() {
			System.out.println("name: " + name);
			System.out.println("salary: " + salary);
		}
		
		public static void main (String args[]) {
			Ai2_InstanceVariable empOne = new Ai2_InstanceVariable("Magla");
			empOne.setSalary(1000);
			empOne.printEmp();
			
		}
		
		
	
}
