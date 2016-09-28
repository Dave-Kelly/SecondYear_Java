public class Ex2q1

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				30/09/2015
/* Purpose : 			Write a Java application to input a single 
 						integer value and output the corresponding 
 						number of *'s
   *******************************************************************/

{
	public static void main(String args[])
	{
		int num;
		int index = 0;
		
		System.out.print("Enter number of stars : ");
		num = Keyboard.readInt();
		
		for(index = 1; index <= num; index++)
		{
			System.out.print('*');
			
		}
		System.out.println();
		
	}
}