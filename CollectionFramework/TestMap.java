package CollectionFramework;

import java.util.HashMap;

public class TestMap {
public static void main(String[] args) {
	HashMap m1 = new HashMap();
	
	m1.put("1", "rajat");
	m1.put("2", "arun");
	m1.put("3", "monil");
	m1.put("4", "rahul");
	
	System.out.println(m1);
	//m1.clear();
	//System.out.println(m1);
	System.out.println(m1.containsKey("2"));
	System.out.println(m1.containsValue("monil"));
//	System.out.println(m1.entrySet());
	System.out.println(m1.get("2"));
	System.out.println(m1.isEmpty());
	m1.put("3", "vipin");
	System.out.println(m1);
	m1.remove("4");
	System.out.println(m1);
	System.out.println(m1.size());
	System.out.println(m1.values());
	
}
}
