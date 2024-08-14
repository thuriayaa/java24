package day8.overriding;

public class TestOverriding {
	
	public static void main (String[] args) {
		
	BankOfAmerica ba = new BankOfAmerica();
	
	System.out.println("Rate of Interest - ROI - of Bank of America " + ba.roi());
	
	
	ChaseBank cb = new ChaseBank();
	
	System.out.println("Rate of Interest - ROI - of Chase Bank " + cb.roi());

	
	CentralBank cntb = new CentralBank();
	
	System.out.println("Rate of Interest - ROI - of Central Bank " + cntb.roi());

	
	
	
	
	}
}
