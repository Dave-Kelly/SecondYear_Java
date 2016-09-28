public class Ex1q3

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				30/09/2015
/* Purpose : 			Program that takes in an int value >=2 and 
 						outputs the sum of all even ints between 2 and 
 						the input value 
   *******************************************************************/

{
	public static void main(String args[])
	{
		int num = 0;
		int sum = 0;
		int index = 0;
		
		System.out.print("Enter integer (>=2) : ");
		num = Keyboard.readInt();
		
		if(num >=2)
		{
			for(index = 2; index < num; index = index + 2)  //increments in even numbers: 2,4,6 etc, by adding 2 to index.
			{
				sum = sum + index;
			}
			System.out.println("The sum of all even integers between 2 and the imput = " + sum);
		}
		else
		{
			System.out.println("Input Value is less then 2, try again");
		}
		
	}
}