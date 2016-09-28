class Ex3q10

// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				16/10/2015
/* Purpose : 			Write a method factorial that takes a single integer 
 						value and returns its factorial. 
*/
{
	public static void intro()
    {
        System.out.println("****************************"); 
        System.out.println("Introduction to Java Methods"); 
        System.out.println("****************************\n"); 
    }
    //****************************
    public static double fahToCel(int fah)
    {
    	double celsius;
    	celsius = 5 / 9 * (fah - 32);        
        return celsius;
    }
    //****************************
    public static double power(int numX, int numN)
    {
    	int result;
    	result = (int)Math.pow(numX,numN); 
        return result;
    }
    //****************************
    public static int search(String word, char find)
    {
    	int result = 0;
    	int index = 0;
        String position = "";
    	
    	while(index < word.length())
    	{
    		if(find == word.charAt(index))
    		{
    			position = position + " - " + index;
    			result++;
    		}
    	index++;	
    	}
    	if(result > 0)
    	{
    		System.out.println("The character '" + find + "' occures at positions :" + position);
    	}
    	
        return result;
    }
    
    //****************************
    public static boolean evenlyDivisible(int num1, int num2)
    {
    	
    	if((num1/num2)==0)
    	{
    		return true;
    	}
    	return false;
    }
    
    //****************************
    public static String multiConcat(String theLine, int num)
    {
    	int index = 1;
    	String concat = "";
    	
    	while(index <= num)
    	{
    		concat = concat + theLine;
    		index++;
    	}
    	return concat;
    }
    //****************************
    public static int theFactorial(int theNum)
    {
    	int fact = 1;
    	int i = 1;
       
    	while(i <= theNum)
    	{
    		fact *= i;
    		i++;
    	}
    
        return fact;
    }
    //MAIN METHOD****************************
    public static void main(String[] args)
    {
    	int fah;
    	double temp;
    	int x;
    	int n;
    	String theWord;
    	char findChar;
    	int result = 0;
    	boolean ifDivis;
    	String newLine;
    	
    	intro();
    	
    	System.out.print("Enter int : ");
    	x = Keyboard.readInt();
    	result = theFactorial(x);
    	System.out.println(x + " factorial = " + result);
    	
    	
    	
    	/*System.out.print("Enter string :");
    	theWord = Keyboard.readLine();
    	System.out.print("Enter int value :");
    	n = Keyboard.readInt();
    	System.out.println(newLine = multiConcat(theWord, n));
    	
    	
    	
    	
    	
    	/*if((x == 0) &! (n ==0))
    	{
    		ifDivis = false;
    	}
    	else
    	{
    		ifDivis = evenlyDivisible(x, n);
    	}
    	
    	System.out.println(ifDivis);
    	
    	
    	//System.out.print("Input a temperature value (Fahrenheit)");
    	//fah = Keyboard.readInt();
    	//temp = fahToCel(fah);
    	//System.out.println(fah + " degrees fahrenheit converts to : " + temp + " degrees Celsius");
    	
    	//System.out.print("Enter int (X)");
    	//x = Keyboard.readInt();
    	//System.out.print("Enter int (N)");
    	//n = Keyboard.readInt();
    	//System.out.println(x + " to the power of " + n + " is : " + (int)power(x, n));
    	
    	
    	/*System.out.print("Enter string : ");
    	theWord = Keyboard.readLine();
    	System.out.print("Enter search character : ");
    	findChar = Keyboard.readChar();
    	result = search(theWord, findChar);
    	if(result == 0)
    	{
    		System.out.println("The character '" + findChar + "' does not occur in the string '" + theWord + "'");
    	}
    	else
    	{
    		System.out.println("Character '" + findChar + "' occures " + result + " times in the string : '" + theWord + "'");
    	}*/
    	
    		
    	
    	
    }
}
