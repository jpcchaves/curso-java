package entities;

public class Retangle {

	public double width, height;

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public double getDiagonal() {
		return Math
			.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
