package Shapes;

/**
 * Demo file, it may not be correct and/or complete.  
 * Please watch the corresponding lecture(s) for more explanations.
 * 
 * @author ashesh
 *
 */

public class Rectangle extends Shape {

	protected double width, height;

	public Rectangle() {
		width = 1.0; 
		height = 1.0;

		count_shapes++;
	}

	public Rectangle(double w, double h) { 
	
		this.width = w; 
		this.height = h; 

		count_shapes++;
	}

	public double area(){ 
		return width*height;
	}

	public double circumference() { 
		return 2*(width + height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	
	
}


