class Ex3q2

// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				14/10/2015
// Purpose : 			Write a method powersOfTwo that prints the first 10 powers of 2 (starting with 2). 
//						The method takes no parameters and does not return anything.

{
	public static void powersOfTwo()
    {
    	int power = 1;
    	while(power<=10)
    		{
    			System.out.println((int)Math.pow(2,power)); 
    			power++;
    		}
       
    }
    public static void main(String[] args)
    {
    	powersOfTwo();
    	System.out.println("\n\n\n");
    }
}
