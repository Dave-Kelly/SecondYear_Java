public class RectangleTest							// begin class RectangleTest

// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				21/10/2015
/* Purpose : 			Lab 3a, Q12 - Rectangle Test
*/

{ 												
	public static void main(String args[])			// being main 
	{ 
	
		float lengthA;	
		float widthA;			
		Rectangle boxA = new Rectangle();
		
		System.out.println("Length of the rectangle is " + boxA.getLength());
		System.out.println("Width of the rectangle is " + boxA.getWidth());
		boxA.setLength(5);
		boxA.setWidth(10);
		System.out.println("Perimeter of the rectangle is " + boxA.getPerim());
		System.out.println("Area of the rectangle is " + boxA.getArea());
		
						
	} 												// end main
} 													// end class RectangleTest
