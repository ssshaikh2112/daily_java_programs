class StarPatternOpposite
{

	/*
		    *
		   **
		  ***
		 ****
		*****
	Print the Above pattern
		*/

	public static void main(String args[])
	{
		for (int column=1;column<=5 ;column++ )
		{
			for (int space=4;space >=column;space--)		// to print the space before the * 
			{
				System.out.print(" ");
			}

			for (int row=1;row<=column ;row++ )				// to print the * at last of space
			{
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
