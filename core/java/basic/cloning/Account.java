package core.java.basic.cloning;

public class Account implements Cloneable{
private int Balance;
public Account(int Balance) {
	this.Balance = Balance;
}
public int getBalance() {
	return Balance;
}
public void setBalance(int Balance) {
	this.Balance = Balance;
}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
}
}
