public class Ex2q5

// *******************************************************************
// Student Name : 		David Kelly
// Student Id Number : 	C00193216
// Date :				30/09/2015
/* Purpose : 			Switch Statement 
   *******************************************************************/

{
	public static void main(String args[])
	{
		int pNum;			//Product Number
		int qSold = 0;			//Quantity Sold
		double cost = 0;	//Total Price
		int index = 0;
		
		
		System.out.print("Enter product number (1-5) or -1 to quit : ");
		pNum = Keyboard.readInt();
		if(pNum>=1 && pNum<=5)
			{
				System.out.print("Enter quantity : ");
				qSold = Keyboard.readInt();
			}
		else
			{ 
			 	System.out.println("Product number not found");
			}	
		

		while(pNum >=1 && pNum <=5)
		{
			switch(pNum)
		   		{ 
		      	case 1: 
		      		cost = 2.98 * qSold;
				  	break;
				case 2:
		           	cost = 4.50 * qSold;
				  	break;
				case 3:
					cost = 9.98 * qSold;
				  	break;
				case 4:
					cost = 4.49 * qSold;
				  	break;
				case 5:
					cost = 6.87 * qSold;
				  	break;
				}
			
			System.out.println("Total cost of order : " + cost);
			System.out.print("\n\nEnter product number (1-5) or -1 to quit: ");
			pNum = Keyboard.readInt();
			if(pNum>=1 && pNum<=5)
				{
					System.out.print("Enter quantity : ");
					qSold = Keyboard.readInt();
				}
			else
				{ 
				 	System.out.println("Product number not found");
				}
			}
			System.out.println("Goodbye");
	}
}