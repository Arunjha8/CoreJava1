package core.java.basic.constructor;

public class TestShape {
public static void main (String [] args) {
	Shape [] s = new Shape [3];
	s [0] = new Rectangle(10, 5);
	s [1] = new Triangle (10, 10);
	s [2] = new Circle (4);
	
	double totalArea = 0;
	
	for (int i = 0; i < s.length; i++) {
		totalArea = totalArea + s[i].area();
	}
	System.out.println("Total area = "+totalArea);
}
}
