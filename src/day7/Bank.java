package day7;

public class Bank {
	
//encapsulation - making it private 
	
	private int accountNo; 
	private String accHolder;
	private double amount;
	
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", accHolder=" + accHolder + ", amount=" + amount + "]";
	}
	
	
	
	
	
	

}
