package CollectionFramework;

import java.util.*;
import java.util.List;

public class TestIteratorPerson {
public static void main(String[] args) {
	Person p1 = new Person(1, "arun", "indore");
	Person p2 = new Person(2, "rajat", "indore");
	Person p3 = new Person(3, "monil", "indore");
	Person p4 = new Person(4, "rahul", "indore");
	
	List l = new ArrayList();
	
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	
	Iterator it = l.iterator();
	
	while (it.hasNext()) {
		Person p = (Person) it.next();
		
		//System.out.println(p);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAddress());
	}
	
}
}
