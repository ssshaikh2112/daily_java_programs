class StarPattern3
{

	/*
		* * * * *
		* * * *
		* * *
		* *
		*
	*/

	public static void main(String args[])
	{
		for(int column=5;column>=1;column--)  		// column = 5 ,4,3,2,1
		{
			for(int row=1;row<=column;row++)	//Print 5 * in first line and then increase value of row means print then 4 (row=1,2,3,4,5)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
}
