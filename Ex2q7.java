public class Ex2q7

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				02/10/2015
/* Purpose : 			Multiplication Table - random number generator
 						(Shows -- BREAK STATEMENT --)
   *******************************************************************/

{
	public static void main(String args[])
	{
		int num1;				//
		int num2;				//
		int min = 1;
		int max = 11;
		int answer = 0;			//result of multiplication	
		int index = 0;			//
		
	//	stop:
			while(answer != -1)
			{		
				num1 = (int)Math.floor(Math.random()*12);
				num2 = (int)Math.floor(Math.random()*12);
				System.out.print("How much is "+num1 +" times " + num2 +" ? (-1 to quit) ");
				answer = Keyboard.readInt();
				if(answer == -1)
				{	
					System.out.println("Goodbye");
					//break stop;
				}
				else if((num1 * num2) == answer)
				{
					System.out.println("Very Good!");
				}
				else
				{	
					System.out.println("No, please try again.");
				}
			}
		
		
		
		System.out.print("\n\n");
	}
}