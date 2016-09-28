public class Ex1q9

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				07/10/2015
/* Purpose : 			Write a Java application to input 10 integers 
 						and find the largest
   *******************************************************************/

{
	public static void main(String args[])
	{		
		int largest;
		int input;
		int index = 1;
		
		
		System.out.print("Enter Number : ");
		input = Keyboard.readInt();
		
		largest = input;
		while(index<10)
		{
			System.out.print("Enter Number : ");
			input = Keyboard.readInt();
			if(largest<input)
			{
				largest = input;			
			}	
			index++;
		}
		System.out.println("The largest number is : " + largest);	
	}


}