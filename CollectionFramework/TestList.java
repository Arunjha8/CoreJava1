package CollectionFramework;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(2);
		a.add(1);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		System.out.println(a);
		a.add(1, 23);
		System.out.println(a);

		System.out.println(a.get(2));
		a.remove(2);
		System.out.println(a);
		a.set(1, 21);
		System.out.println(a);
		System.out.println(a.indexOf(21));
		System.out.println(a.lastIndexOf(6));
		System.out.println(a.subList(1, 4));
		
	}
}
