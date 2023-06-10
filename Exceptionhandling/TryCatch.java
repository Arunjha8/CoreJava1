package Exceptionhandling;

public class TryCatch {
	public static void main(String[] args) {
		String name = "Arun";
		System.out.println(name);
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("division = " + c);

		} catch (Exception e) {
			System.out.println("not divided by zero");
		}
	}
}