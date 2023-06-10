package CollectionFramework;

import java.util.*;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "arun", "Indore");
		Employee e2 = new Employee(2, "rajat", "Ratlam");
		Employee e3 = new Employee(3, "monil", "Ujjain");
		Employee e4 = new Employee(4, "rahul", "Dewas");
		Employee e5 = new Employee(5, "vipin", "Mumbai");

		// System.out.println(e1.equals(e2));
		// System.out.println(e2.equals(e3));
		// System.out.println(e3.equals(e4));
		// System.out.println(e4.equals(e5));

		// System.out.println(e1.hashCode());
		// System.out.println(e2.hashCode());
		// System.out.println(e3.hashCode());
		// System.out.println(e4.hashCode());
		// System.out.println(e5.hashCode());

		List list = new ArrayList();
		// list.add("one");
		// System.out.println(list.contains("one"));
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Employee e = (Employee) it.next();
			System.out.print(e.getId() + " ");
			System.out.print(e.getName() + " ");
			System.out.print(e.getAddress() + " ");

		}
	}
}