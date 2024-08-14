package day0_Homework;

public class AI5_ConvertDaysto {
	
	static final int daysinWeek = 7; 
	
	//function to find year, week, days
	
	static void find (int numOfDays) {
		
		int year, week, days;
		
		//assume that years is of 365 days
		
		year = numOfDays / 365; 
		
		week = (numOfDays % 365) / daysinWeek;
		
		days = (numOfDays % 365) % daysinWeek;
		
		System.out.println("years = " + year);
		
		System.out.println("weeks = " + week);
		
		System.out.println("days = " + days);
		
	}
	
	//driver code 
	
	public static void main (String[] args ) {
		
		int numOfDays = 500;
		
		find (numOfDays); 
	}
	
	
		
		

}
