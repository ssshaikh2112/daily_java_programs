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
		for(int column=5;column>=1;column--)
		{
			for(int row=1;row<=column;row++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
}