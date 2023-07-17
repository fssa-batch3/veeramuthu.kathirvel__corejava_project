package day02.Solved;

public class ShapeCalculator {
	
	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	// Calculating Area for Rectangle
	public double calculateArea(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		ShapeCalculator calculator = new ShapeCalculator();
		double circleArea = calculator.calculateArea(3.5); // Output: 38.48451000647496
		double rectangleArea = calculator.calculateArea(4.2, 6.8); // Output: 28.559999999999995
		System.out.println("Circle area: " + circleArea);
		System.out.println("Rectangle area: " + rectangleArea);
	}

}
