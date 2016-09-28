public class Ex1q4

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				07/10/2015
/* Purpose : 			Write a Java application calculates the squares 
 						and cubes of the numbers from 1 to 5 and  prints 
 						the following table of values: 
   *******************************************************************/

{
	public static void main(String args[])
	{		
		int index = 1;
		
		System.out.println("Number" + "\tSquare" + "\tCube");
		
		while(index <=5)
		{
			System.out.println(index + "\t" + (index*index) + "\t" + (index*index*index));	
			index++;
		}
		
	}
}