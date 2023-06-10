package core.java.basic.constructor;

public class Circle extends Shape{
private int radius;
public static final double PI = 3.14;

public Circle(){
}
public Circle(int radius) {
	this.radius = radius;
}
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
