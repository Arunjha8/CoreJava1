package CollectionFramework;

import java.util.ArrayList;

public class ToSortLembda {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);

		l.forEach(e -> {
			System.out.println(e);
		});
	}
}
