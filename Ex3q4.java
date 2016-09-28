class Ex3q4

// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				14/10/2015
// Purpose : 			Method to print message to screen
//						Extended to include method called fahToCel() 
//						which accepts an integer value (Fahrenheit) and 
//						returns a double value (Celsius).Conversion:  C = 5 / 9 * (F - 32)


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
    	celsius = ((fah - 32)*5)/9;      
        return celsius;
    }
    public static void main(String[] args)
    {
    	int fah;
    	double temp;
    	
    	menu();
    	System.out.print("Input a temperature value (Fahrenheit)");
    	fah = Keyboard.readInt();
    	temp = fahToCel(fah);
    	System.out.println(fah + " degrees fahrenheit converts to : " + temp + " degrees Celsius");
    }
}
