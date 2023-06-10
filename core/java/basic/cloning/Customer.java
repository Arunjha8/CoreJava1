package core.java.basic.cloning;

public class Customer implements Cloneable {
	String name = null;
	public Account account = null;
	
	public Customer (String name) {
		this.name = name;
		this.account = new Account(100);
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (Account) account.clone();
		return c;
	}

}
