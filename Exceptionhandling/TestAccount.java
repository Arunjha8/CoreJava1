package Exceptionhandling;

public class TestAccount {
	public static void main(String[] args) throws InsufficentFund {
		Account1 a = new Account1();
		a.setBalance(5000);
		a.setAccounttype("Savings");
		a.setName("215526498515165");

		a.deposit(500);
		try {
			a.withdraw(1501);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			// e.printStackTrace();
		}
		try {
			a.fundtransfer(1000);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			a.paybill(2500);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println();
			System.out.println("Remaining balance = " + a.getBalance());
		}
	}
}
