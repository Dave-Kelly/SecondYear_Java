class Ex3q5

// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				14/10/2015
// Purpose : 			Write a method called power which takes two integer values, 
//						say x and n. Method power should raise integer x to the power of n, 
//						where n is a positive integer. The calculated value of x to the power 
//						of n should be returned to the calling method.


{
	public static void menu()
    {
        System.out.println("****************************"); 
        System.out.println("Introduction to Java Methods"); 
        System.out.println("****************************"); 
    }
    public static double fahToCel(int fah)
    {
    	double celsius;
    	celsius = 5 / 9 * (fah - 32);        
        return celsius;
    }
    
    public static double power(int numX, int numN)
    {
    	int result;
    	result = (int)Math.pow(numX,numN); 
        return result;
    }
    
    public static void main(String[] args)
    {
    	int fah;
    	double temp;
    	int x;
    	int n;
    	
    	menu();
    	//System.out.print("Input a temperature value (Fahrenheit)");
    	//fah = Keyboard.readInt();
    	//temp = fahToCel(fah);
    	//System.out.println(fah + " degrees fahrenheit converts to : " + temp + " degrees Celsius");
    	
    	System.out.print("Enter int (X)");
    	x = Keyboard.readInt();
    	System.out.print("Enter int (N)");
    	n = Keyboard.readInt();
    	
    	System.out.println(x + " to the power of " + n + " is : " + (int)power(x, n));
    	
    }
}
