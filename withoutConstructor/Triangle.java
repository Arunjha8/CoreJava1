package withoutConstructor;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	public void setbase(int base) {
		this.base = base;
	}
	public int getbase() {
		return base;
	}
	public void setheight(int height) {
		this.height = height;
	}
	public int getheight() {
		return height;
	}
	public double area () {
		double a = base*height*0.5;
		System.out.println("Triangle = "+a);
		return a;
	}
	}
