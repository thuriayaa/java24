package day3;

public class Ai2_Question2 {

	public static void main (String[] args) {
	String[] person = new String[8];
    person[0] = "name";
    person[1] = "city";
    person[2] = "age";
    person[3] = "college";
    person[4] = "graduationYear";
    person[5] = "profession";
    person[6] = "personCategory";
    person[7] = "personName";
System.out.println("Once there was a person named " 
    + person[0] + "who lived in " + person[1] + ". At the age of " 
		+ person[2] +", name went to college at " + person[3] 
				+ ". namegraduated in " + person[4] 
						+ " and took up a job as a " + person[5] 
								+". Then, " + person[0] + " came across a(n) " + person[6] + " named " 
						+ person[7] + ".");

// or to add line breaks.

System.out.print("\n \n \n Once there was a person named " 
+ person[0] + " who lived in " + person[1] 
		+ ".\n At the age of" + person[2] 
				+", name went to college at " 
		+ person[3] + ".\n name graduated in " 
				+ person[4] + " and took up a job as a " + person[5] + ".\n Then, " 
		+ person[0] + " came across a(n) " + person[6] + " named " + person[7] + ". ");
	
}
}
