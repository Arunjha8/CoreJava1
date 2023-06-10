package core.java.basic.cloning;

public class TestCustomer {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Customer c1 = new Customer("abc");
	Customer c2 = (Customer) c1.clone();
	c2.setname("arun");
	c2.account.setBalance(200);
	
	System.out.println("orginal object");
	System.out.println("name = "+ c1.getname());
	System.out.println("Balance = "+c1.account.getBalance());
	System.out.println("clone object");
	System.out.println("name = "+ c2.getname());
	System.out.println("Balance = "+c2.account.getBalance());
	
}
}
