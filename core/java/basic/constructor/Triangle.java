package core.java.basic.constructor;

public class Triangle extends Shape{
private int base;
private int height;
public Triangle() {
}
public Triangle(int base, int height) {
	this.base= base;
	this.height= height;
}

public void setbase() {
	this.base = base;
}
public int getbase() {
	return base;
}
public void setheight() {
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
