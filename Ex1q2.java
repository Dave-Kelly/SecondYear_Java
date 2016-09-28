public class Ex1q2
{
	public static void main(String args[])
	{
		int power = 11, result; //As initial power is set outside the paraemters of the while loop nothing happens.
		final int Max = 10;
		
		while ( power<=Max )
		{
			result = (int) Math.pow(2,power);
			System.out.println("2 to the power of " + power + "= " +  result);
			power++;
		}
	}
}