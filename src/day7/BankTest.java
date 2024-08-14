package day7;

public class BankTest {
	
	public static void main (String[] args) {
		
		Bank bank = new Bank(); //this is creating object
		
		bank.setAccountNo(4004);
		bank.setAccHolder("Nasrin");
		bank.setAmount(20000000);
		
		System.out.println(bank.getAccountNo());
		
		System.out.println(bank.toString());
		
		
		
	}

}
