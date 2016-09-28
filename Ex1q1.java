public class Ex1q1
{
	public static void main(String args[])
	{
		int power = 1, result;
		final int Max = 10;
		
		while ( power<=Max )
		{
			result = (int) Math.pow(2,power);
			System.out.println("2 to the power of " + power + "= " +  result);
			power++;
		}
	}
}