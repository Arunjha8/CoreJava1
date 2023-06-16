package comparable;

import java.util.*;

public class TestEmployee {
public static void main(String[] args) {
	List list = new ArrayList();
	
	list.add(new Employee(5, "arun", "indore"));
	list.add(new Employee(2, "raja", "bhopal"));
	list.add(new Employee(1, "rajat", "dewas"));
	list.add(new Employee(4, "monil", "delhi"));
	list.add(new Employee(3, "rahul", "mumbai"));
	list.add(new Employee(6, "mayank", "gwalior"));
	
	//Collections.sort(list);
	Collections.sort(list, new OrderByName());
	
	for (Object object : list) {
		System.out.println(object);
	}
}
}
