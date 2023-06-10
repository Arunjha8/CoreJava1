package Exceptionhandling;

public class Account1 {
	private String name;
	private String accounttype;
	private double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double d) {
		this.balance = balance + d;
	}

	public void withdraw(double w) throws InsufficentFund {
		this.balance = balance - w;
		if (balance < 500) {
			InsufficentFund e = new InsufficentFund();
			throw e;
		}
		System.out.println("Withdrawl = " + w);
	}

	public void fundtransfer(double f) throws InsufficentFund {
		this.balance = balance - f;
		if (balance < 500) {
			InsufficentFund e = new InsufficentFund();
			throw e;
		}
		System.out.println("Fund Transfer = " + f);
	}

	public void paybill(double p) throws InsufficentFund {
		this.balance = balance - p;
		if (balance < 500) {
			InsufficentFund e = new InsufficentFund();
			throw e;
		}
		System.out.println("Pay Bill = " + p);
	}
}