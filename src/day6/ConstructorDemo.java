package day6;

public class ConstructorDemo {

//need constructor to assign values. constructor has access modifier but does not have a return type, and has name like class name.	
	//can also have parameter or not have it. 
	
	String name; 
	String streetname;
	int housenumber;
	String zipcode;
	
	public ConstructorDemo (String name, String streetname, int housenumber, String zipcode) {
	
		this.name = name; 
		this.streetname = streetname; 
		this.housenumber = housenumber;
		this.zipcode = zipcode;
		
		
	}
	
	
	public String declareAddress() {
		
		return (name + "\n" + housenumber + ", "  + streetname + "\n" + zipcode );
	}
	

}
