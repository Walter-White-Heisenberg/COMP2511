package Shapes;

/**
 * Demo file, it may not be correct and/or complete.  
 * Please watch the corresponding lecture(s) for more explanations.
 * 
 * @author ashesh
 *
 */

public class Circle  extends Shape {
	// final means stable variable, the value would never change
	protected static final double pi = 3.14159; 
	protected  int  x, y;
	protected  int  r;
	protected static int count_circle = 0;

	// Very simple constructor
	// a circle can be described as x,y position of its center and radius.
	// default value, if no input parameter, use these values
	public Circle(){
		this.x = 1;
		this.y = 1;
		this.r = 1;

		count_circle++; 
		count_shapes++;
	}
	// Another simple constructor
	public Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;

		count_circle++; 
		count_shapes++;
	}

	/**
	 * Below, methods that return the circumference 
	 * area of the circle
	 */
	public  double  circumference( ) {  
		return 2 * pi * r ; 
	}
	public  double  area ( ) {
		return  pi * r * r ; 
	}
	// because all the values are protected, so we need to use getter and setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
}
