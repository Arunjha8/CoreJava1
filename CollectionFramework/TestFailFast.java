package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(100);
	l.add("one");
	l.add(200);
	l.add("two");
	
	Iterator it = l.iterator();
	
	l.add(300);
	
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
}
}
