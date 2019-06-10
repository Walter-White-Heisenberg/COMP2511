package Shapes;

import java.awt.Color;


/**
 * Demo file, it may not be correct and/or complete.  
 * Please watch the corresponding lecture(s) for more explanations.
 * 
 * @author ashesh
 *
 */

public class TestCircle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(2, 2, 4); 
		System.out.println("c1 area is: " + c1.area());

		Circle c2 = new Circle(5, 1, 3); 
		System.out.println("c2 area is: " +c2.area());		

		Circle c3 = new GraphicalCircle(); 
		System.out.println("c3 area is: " +c3.area());	

		Circle c4 = new GraphicalCircle(3, 2, 4, Color.blue, Color.green); 
		System.out.println("c4 area is: " + c4.area());	

		/**
		 * Class variable, "Circle.count_circle" 
		 */
		System.out.println("Circle.count_circle : " + Circle.count_circle);	

		/**
		 *  Methods Overriding, 
		 *  Polymorphism Example
		 */
		// create an array to hold shapes
		Shape[] shapes = new Shape[4];    
		shapes[0] = new Circle(4, 6, 2);
		shapes[1] = new Rectangle(1.0, 3.0);
		shapes[2] = new Rectangle(4.0, 2.0);
		shapes[3] = new GraphicalCircle(1, 1, 6, 
					    Color.green, Color.yellow);

		double total_area = 0;
		for(int i = 0; i < shapes.length; i++) {
			
			// Compute the area of the shapes using
			// polymorphism (behaviour) below.
			
			total_area += shapes[i].area();    
			
		} 						       		  

		System.out.println("total_area is: " + total_area );
		
		/**
		 * Class variables, 
		 * "Circle.count_circle" and "Shape.count_shapes"
		 */
		System.out.println("Circle.count_circle : " + Circle.count_circle);	
		System.out.println("Shape.count_shapes : " + Shape.count_shapes);	

		/**
		 * Casting example
		 * if shapeTemp is an instance of class Circle, 
		 * cast it to Circle, and call the instance method getR().
		 */
		Shape shapeTemp = shapes[0]; 
		
		if( shapeTemp instanceof Circle ) {
			
			// cast shapes[0] to Circle class
			Circle cTemp = (Circle) shapes[0]; 
			
			// call the instance method getR from the class Circle
			System.out.println(  "(1) Radius is:" + cTemp.getR()   )  ;
			
			// Or use the following one-liner ... 
			System.out.println(  "(2) Radius is:" + ( (Circle) shapes[0] ).getR()   )  ;
		}

		
	}
	
	
}
