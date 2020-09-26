
public class Circle extends Shape {
	
	//Fields
	private double radius;
	
	// constructors
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// getters and setters
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Overrides
	@Override
	public double getArea() {
		double area = Math.PI * radius *radius;
		return area;
	}

}
