package core.java.basic.cloning;

public class TestAccount {
public static void main(String[] args) throws Exception {
	Account a1 = new Account(100);
	Account a2 = (Account) a1.clone();
	a2.setBalance(10);
	System.out.println(a1.getBalance());
	System.out.println(a2.getBalance());
}
}
