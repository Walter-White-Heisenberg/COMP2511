package Shapes;

/**
 * Demo file, it may not be correct and/or complete.  
 * Please watch the corresponding lecture(s) for more explanations.
 * 
 * @author ashesh
 *
 */

public  abstract class Shape {
	// means all the abstract method need to be defined in subclasses
	public abstract double area();
	public abstract double circumference();

	protected static int count_shapes = 0;

}

