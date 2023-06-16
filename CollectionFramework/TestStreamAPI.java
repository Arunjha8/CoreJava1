package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TestStreamAPI {
	public static void main(String[] args) {
		
		List l = new ArrayList();		//<E> is generic
		
		l.add(12);
		l.add(14);
		l.add(17);
		l.add(15);
		l.add(25);
		l.add(32);
		l.add(14);
		
		
		l.stream().sorted().distinct().forEach(e -> {				// distinct() - remove repeat value 
			System.out.println(e);
		});
	}

}
