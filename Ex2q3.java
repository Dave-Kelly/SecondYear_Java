public class Ex2q3

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				30/09/2015
/* Purpose : 			Write a Java application to input a single 
 						integer value and output the corresponding 
 						number of *'s (Repear until -1 to exit)
   *******************************************************************/

{
	public static void main(String args[])
	{
		int num;
		int index = 0;
		
		
		System.out.print("Enter number of stars (-1 to quit) : ");
		num = Keyboard.readInt();
		
			
		while(num >=0)
		{
			while(num >=0)
			{
				for(index = 1; index <= num; index++)
				{
					System.out.print('*');
				}
				System.out.println();
				num--;
			}
			System.out.print("\n\nEnter number of stars (-1 to quit) : ");
			num = Keyboard.readInt();
		}	
		
		System.out.println("Goodbye");
		
		
	}
}