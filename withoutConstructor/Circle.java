package withoutConstructor;

public class Circle extends Shape{
		private int radius;
		public static final double PI = 3.14;

		public void setradius (int radius) {
			this.radius = radius;
		}
		public int getradius() {
			return radius;
		}
		public double area() {
			double a = PI*radius*radius;
			System.out.println("Circle = "+ a);
			return a;
		}
}
