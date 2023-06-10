package CollectionFramework;

import java.util.*;

public class TestCollection {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add("one");
		c1.add("two");
		System.out.println(c1);

		Collection c2 = new ArrayList();
		c2.add("arun");
		c2.add("rajat");
		System.out.println(c2);

		c1.addAll(c2);
		System.out.println(c1);

		c2.clear();
		System.out.println(c2);

		System.out.println(c1.contains("rahul"));
		System.out.println(c2.containsAll(c2));
		
		System.out.println(c2.isEmpty());

		c1.remove("two");
		System.out.println(c1);
		
		//c1.removeAll(c1);
		//System.out.println(c1);
		
		c1.retainAll(c1);
		System.out.println(c1);
		
		System.out.println(c1.size());

	}
}
