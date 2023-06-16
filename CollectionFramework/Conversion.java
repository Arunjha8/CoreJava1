package CollectionFramework;

public class Conversion {
	public static void main(String[] args) { // Convert string to integer
		String s = "Arun ojha";
		int count = 0, i, j;
//	for (int i = 0; i < s.length(); i++) {
//		if (Character.isDigit(s.charAt(i))) {
//			count = count + Integer.parseInt(String.valueOf(s.charAt(i)));	
//		}
//	}
//	System.out.println(count);

//    Integer to character

		char z;
		for (int k = 0; k < s.length(); k++) {
			z = s.charAt(k);
			for (i = 0; i < s.length(); i++) {
				if (s.charAt(i) == z) {
					count++;
					System.out.println(s.charAt(i) + " -- " + (int) s.charAt(i));
				}
			}
		}
	}
}