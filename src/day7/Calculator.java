package day7;

public class Calculator {
	
	int a = 10, b = 20; 
	
// # 1 - no para
	
	public void sum() {
		System.out.println(a+b);
		
	}
	
// # 2 - two para with same data type
	
	public void sum(int x, int y) {
		System.out.println(x + y);
	}
	
	
// # 3 - 2 para with data types different
	
	public void sum (double x, int y) {
		System.out.println(x + y);
	}
	
	
// # 4 - 2 para with data types switched 
	
		public void sum (int x, double y) {
			System.out.println(x + y);
		}
			
	
// # 5 - the number of para changed to 3
		
		public void sum (int x, double y, int z) {
			System.out.println(x + y + z);
		}
		
	

}
