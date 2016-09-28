public class Ex1q6

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				07/10/2015
/* Purpose : 			Program to read in an age amd output if they 
 						are old enough to vote
   *******************************************************************/

{
	public static void main(String args[])
	{		
		int index = 1;
		int age;
		
		System.out.print("Enter age : ");
		age = Keyboard.readInt();
		
		if(age >= 18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are NOT eligible to vote");
		}
		
	}
}