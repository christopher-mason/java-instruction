import java.text.NumberFormat;

public class Rectangle { //Step 2
	
	// fields
	private double length; //Step 3
	private double width; //Step 3
	
	// contructors
	public Rectangle() { // Step 4
		length = 0.0; // Step 4
		width = 0.0; //Step 4
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// setters and getters. all are step 3
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		double area = length * width;
		return area;
	}
	
	public String getAreaFormatted() {
		double area = this.getArea();
		NumberFormat areaFormatter = NumberFormat.getNumberInstance();
		areaFormatter.setMinimumFractionDigits(3);
		String format = areaFormatter.format(area);
		return format;
	}
	
	public double getPerimeter() {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	
	public String getPerimeterFormatted() {
		double perimeter = this.getPerimeter();
		NumberFormat perimeterFormatter = NumberFormat.getNumberInstance();
		perimeterFormatter.setMinimumFractionDigits(3);
		String periFormat = perimeterFormatter.format(perimeter);
		return periFormat;
	}

}
