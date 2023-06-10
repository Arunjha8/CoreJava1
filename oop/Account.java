package oop;

public class Account {
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

	public void withdraw(double w) {
		this.balance = balance - w;
		if (balance < 500) {
			System.err.println("Insufficent Balance");
		}
	}

	public void fundtransfer(double f) {
		this.balance = balance - f;
	}

	public void paybill(double p) {
		this.balance = balance - p;
	}
}