public class Ex2q8

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				07/10/2015
/* Purpose : 			Prints out all prime numbers up to input int
   *******************************************************************/
{
	// Method checks whether or not a number is prime (returns true if prime)
	public static boolean checkPrime(int index)
	{
		int jump;
		for(jump = 2; jump < index; jump++)
		{
			if(index%jump == 0)
			{
				return false;
			}	
		}
		return true;	
	}
	public static void main(String args[])
	{
		int index;
		int aNum; 									//max number
		boolean isPrime = true; 
		int jump;									//for testing whether or not number at 'index' is prime
		System.out.print("Enter a number (>1) : ");
		aNum = Keyboard.readInt();
		
		for(index = 1; index < aNum; index++)
		{
			isPrime = true;							//Presume number is prime until proven false
			/*
			for(jump = 2; jump < index; jump++)		//begin at two as we know the number divides by one and itself
			{
				if(index % jump == 0)				//Does number at index divide EVENLY by numbers other numbers??
				{								
					isPrime = false;				//If divides evenly - not prime 
					break;							//It's not prime so break out of loop
				}
			}
			*/
			
			if(checkPrime(index) == true)
			{
				System.out.print(index + " ");
			}
		}
	
		System.out.print("\n\n");
	}
}