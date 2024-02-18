class ContinueStatement
{
	public static void main(String args[])
	{
		// Implementation of the continue statement within the for loop.

		for(int i=1; i<=5; i++)
		{
			if(i==3)
			{
				System.out.println("The value of i is : "+i);	// print the value of i = 3
				continue;										// it go to out of for loop for increament the value of i without printing the same value outside the if statement.
			}
			System.out.println(i);								// it print 1,2 and 4,5
		}
	}
}