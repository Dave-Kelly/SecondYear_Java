public class Thermometer
{ // begin Thermometer
	private double celsius;	// more about private later
	// celsius is accessible to all methods in this class
	
	public Thermometer()		// constructor method #1
	{
		setCelsius(0);		
	}
		
	public Thermometer(double cel)	// constructor method #2
	{
		setCelsius(cel);
	}

	public void setCelsius(double cel)
	{
		celsius = cel;		
	}
	public void setFahrenheit(double fah)
	{
		celsius = ((fah - 32)*5)/9;
	}

	public double getCelsius()
	{
		return celsius;
	}
	
	public double getFahrenheit() 	
	{
		double fahrenheit;
		fahrenheit = ((celsius * 9) / 5 + 32 );
		return fahrenheit;
	}
} // end class Thermometer
