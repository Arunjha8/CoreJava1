package withoutConstructor;

public class Shape {
	private int borderwidth;
	private String color;


	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double area() {
		return 0;
	}
}
