public class ThermTest								// begin class ThermTest

// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				21/10/2015
/* Purpose : 			Lab 3a - ThermometerTest
*/

{ 												
	public static void main(String args[])			// being main 
	{ 
	
		double tempB;				
		Thermometer thermA = new Thermometer();
		Thermometer thermB = new Thermometer();
		
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());
		thermB.setFahrenheit(50.0);					//set temp is converted and stored in celsius
		tempB = thermB.getCelsius();				// assign return value of getCelsius to a variable
		System.out.println("Temp. of Thermometer B is " + tempB);
		
		System.out.println("Temp. of Thermometer B in fahrenheit " + thermB.getFahrenheit()); //celsius value is retured as fahrenheit
		
						
	} 												// end main
} 													// end class ThermTest
