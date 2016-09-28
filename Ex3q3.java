class Ex3q3

// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				14/10/2015
// Purpose : 			Write a method sum100 that returns the sum of the integers 
//						from 1 to 100, inclusive.
{
	public static int sum100(int num)
    {
    	
    	int sum = 0;
    	while(num<=100)
    		{
    			sum = sum + num;
    			num++;
    		}
    	return sum;
       
    }
    public static void main(String[] args)
    {
    	int num = 1;
    	int result;
    	result = sum100(num);
    	System.out.println("The sum of the integers from 1 to 100, inclusive : " + result);
    }
}
