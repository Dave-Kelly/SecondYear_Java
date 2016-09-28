public class Ex1q8

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				07/10/2015
/* Purpose : 			Write a Java application out put table of fahreinheit 
 						coresponding celsius values.
   *******************************************************************/

{
	public static void main(String args[])
	{		
		float index = 32;
		float celsius = 0;
		String comment = " ";
		
		System.out.println("Fahreinheit" + "\tCelsius" + "\t\tComment");
		
		while(index <=212)
		{
			celsius = ((index - 32)*5)/9;
			if(celsius <= 20 )
			{
				comment = "Cold";
			}
			else if(celsius > 20 && celsius <= 50 )
			{
				comment = "Warm";
			}
			else if(celsius > 50 )
			{
				comment = "Hot";
			}
			
			System.out.println(index + "\t\t" + Math.round(celsius) + "\t\t" + comment);	
			index = index + 12;
		}
		
	}
}