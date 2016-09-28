public class Rectangle
{ 
	private float length;	
	private float width;

	
	public Rectangle()		
	{
		setLength(1);
		setWidth(1);		
	}
	
	public void setLength(float theLength)
	{
		length = theLength;		
	}
	
	public void setWidth(float theWidth)
	{
		width = theWidth;		
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getPerim() 	
	{
		return ((length*2) + (width*2));
	}
	
	public double getArea() 	
	{
		return length * width;
	}
	
} 
