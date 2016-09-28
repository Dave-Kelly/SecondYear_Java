public class Ex1q7

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				07/10/2015
/* Purpose : 			
   *******************************************************************/

{
	public static void main(String args[])
	{		
		int index = 0;
		int temp;
		
		System.out.print("Enter temp : ");
		temp = Keyboard.readInt();
		
		if(temp > -10 && temp <= 5 )
		{
			System.out.println("Very Cold");
		}
		else if(temp > 6 && temp <= 15 )
		{
			System.out.println("Cold");
		}
		else if(temp > 16 && temp <= 22 )
		{
			System.out.println("Warm");
		}
		else if(temp > 22 && temp <= 30 )
		{
			System.out.println("Hot");
		}
		else
		{
			System.out.println("Error, temperature out of range");
		}
		
	}
}