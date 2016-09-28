public class Ex2q6

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				02/10/2015
/* Purpose : 			Loop Structure - Multiplication Table 
   *******************************************************************/

{
	public static void main(String args[])
	{
		int result = 0;			//result of multiplication	
		int index = 0;
		
		
		System.out.println("Multiplication Table\n");
		for(index = 1; index <= 12; index++)
		{
			System.out.println("\t" + index + " * " + index + " = " + (index * index));
		}
		
			System.out.println("\n\n\n");
	}
}