package Exceptionhandling;

public class LoginException extends Exception {
	public LoginException() {
		super("Invalid user");
	}
}