public class StaticSwap
{
	static int a=5; 
	static int b=10;

	public static void main(String args[])
	{		
		System.out.println("a = " + a + ", b =  " + b);		
		swap();
		System.out.println("a = " + a + ", b =  " + b);		

	}

	public static void swap()
	{
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
	}
}