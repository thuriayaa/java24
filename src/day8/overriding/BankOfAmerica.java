package day8.overriding;

public class BankOfAmerica extends CentralBank {
	
	public double roi() {
		
		return 6.5; //green triangle tells that this class is overriding the roi of central bank with this return value 6.5
	}

}
