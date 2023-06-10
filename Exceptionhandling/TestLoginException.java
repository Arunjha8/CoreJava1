package Exceptionhandling;

public class TestLoginException {
	public static void main(String[] args) throws Exception {
		try {
			String name = "Arun";
			if (name.equals("rajat")) {
				System.out.println("Valid user ...!!!");
			} else {
				throw new LoginException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
