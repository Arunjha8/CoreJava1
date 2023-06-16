package CollectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		for (Object e : s) {
		//	System.out.println(e);
		}
		System.out.println(s.first());
		System.out.println(s.last());
	//	System.out.println(s.headSet());
	//	System.out.println(s.tailSet(fromElement));
	//	System.out.println(s.subSet(fromElement, toElement));
	}
}