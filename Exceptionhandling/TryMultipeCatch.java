package Exceptionhandling;

public class TryMultipeCatch {
	public static void main(String[] args) {
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[2]);
			int c = 10 / 1;
			System.out.println(c);
			String name = "ram";
			System.out.println(name.charAt(3));

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// always execute
			System.out.println("arun");
		}
	}
}
