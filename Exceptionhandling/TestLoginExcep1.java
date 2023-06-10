package Exceptionhandling;

public class TestLoginExcep1 {
	public static void main(String[] args) throws LoginException{
		auth("arun");
	}
	private static void auth(String login) throws LoginException{
		if (!login.equals("admin")) {
			LoginException e = new LoginException();
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
