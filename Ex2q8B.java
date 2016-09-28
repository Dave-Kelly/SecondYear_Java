public class Ex2q8B

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				02/10/2015
/* Purpose : 			Prints out all prime numbers up to input int
   *******************************************************************/
{
	// Method checks whether or not a number is prime (returns true if prime)
	public static boolean checkPrime(int theNum)
	{
		int index;
		for(index = 2; index < theNum; index++)
		{
			if(theNum%index == 0)
			return false;
		}
		return true;	
	}
	public static void main(String args[])
	{
		int max = 100;
		int index;
		int jump;
        System.out.println("Generate Prime numbers between 1 and " + max);
        // loop through the numbers one by one
        for (index = 1; index < max; index++) 
        {
			boolean isPrimeNumber = true;
			// check to see if the number is prime
			for (jump = 2; jump < index; jump++) 
			{
                if (index % jump == 0) 
                {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }         
            // print the number if prime
            if (isPrimeNumber) 
            {
               System.out.print(index + " ");
            }
        }
    }
/*
	public static void main(String args[])
	{
		int index;
		int aNum;
		//int counter = 0;
		String primeNums = "";
		
		System.out.print("Enter a number (>1) : ");
		aNum = Keyboard.readInt();
		
		for(index = 1; index <= aNum; index++)
		{
			int counter = 0;
			for(aNum = index; aNum>= 1; aNum--)
			{
				if((index % aNum) == 0)
				{
					counter = counter + 1;
				}
			}
			if(counter == 2)
			{
				primeNums = primeNums + index + " ";
			}
		}
		System.out.println("Prime numbers from 1 to " + aNum + " are :");
		System.out.println(primeNums);
		
		
		
		System.out.print("\n\n");
	} */
}