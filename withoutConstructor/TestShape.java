package withoutConstructor;

public class TestShape {
	public static void main (String [] args) {
	Shape [] s = new Shape[3];
	s[0] = new Rectangle();
	s[2] = new Triangle();
	s[1] = new Circle();
	
	Rectangle r = (Rectangle) s[0] ;
		r.setlenght(10);
		r.setWidth(5);
		
	Circle c = (Circle) s[1];
		c.setradius(4);
		
	Triangle t = (Triangle) s[2];
		t.setbase(10);
		t.setheight(10);
		
		double totalArea = 0;
		
		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}
		System.out.println("Total Area = "+ totalArea);
}
}