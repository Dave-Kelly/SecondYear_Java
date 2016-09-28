public class Ex2q4

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				30/09/2015
/* Purpose : 			Write a Java application to input a number between 
 						1 and 10 and then print the factorial of that number, 
 						e.g. 5! = 5.4.3.2.1. 
   *******************************************************************/

{
	public static void main(String args[])
	{
		int num;
		int index = 0;
		
		
		System.out.print("Enter a number (1-10): ");
		num = Keyboard.readInt();

		
		while(num >=1 && num<=10)
		{
			for(index = num; index > 0; index--)
				{
					System.out.print(index + ".");	
				}
			System.out.print("\n\nEnter a number (1-10): ");
			num = Keyboard.readInt();		
		}
		System.out.println("Value not accepted. Goodbye");		
		
	}
}