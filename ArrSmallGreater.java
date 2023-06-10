
public class ArrSmallGreater {
	public static void main(String[] args) {
		int[] s = { 1, 2, 3, 10, 8, 100, 99, 10, 52 };
		int a = 0;
		int b = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i] > b) {
				a = b;
				b = s[i];
			}
			if (a < s[i] && s[i] < b) {
				a = s[i];
			}
		}
		System.out.println(a);
	}
}
