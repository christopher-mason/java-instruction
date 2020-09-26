
public class Square extends Shape {
	
	//Fields
		private double width;
		
		// constructors
		public Square(double width) {
			this.width = width;
		}
		
		// getters and setters
		public double getWidth() {
			return width;
		}
		
		public void setRadius(double width) {
			this.width = width;
		}
		
		//Overrides
		@Override
		public double getArea() {
			return Math.pow(width, 2);
		}

}
