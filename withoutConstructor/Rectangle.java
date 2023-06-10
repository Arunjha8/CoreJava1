package withoutConstructor;

public class Rectangle extends Shape{
	private int length;
	private int width;
	
	public int getlenght() {
		return length;
	}
	public void setlenght(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area () {
		double a = length*width;
		System.out.println("Rectangle = "+ a);
		return a;
	}
}
