package CollectionFramework;

// Name = Primitive to Wrapper class
public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		int i = 10;

		// Primitive to wrapper

		Integer i1 = new Integer(i);

		// wrapper to primitive

		int i2 = i1.intValue();
	}
}
