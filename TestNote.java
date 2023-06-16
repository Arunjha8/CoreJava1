
public class TestNote {
	public static void main(String[] args) {

		int amount = 8258;
		int count = 0;
		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int r = 0;

		for (int i = 0; i < notes.length; i++) {
			count = amount / notes[i];

			if (count > 0) {
				System.out.println(notes[i] + " = " + count);

			}
			r = amount % notes[i];
			amount = r;
		}
	}
}