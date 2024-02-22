class StarPattern7
{



/*

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*


*/


	public static void main(String args[])
	{
		for (int column =1; column <=5 ;column++ )
		{
			for (int row =1;row<=column ;row++ )
			{
				System.out.print("* ");

			}
			System.out.println();
		}

		

		for (int column =4; column >=1 ;column-- )
		{
			for (int row =1; row<=column ; row++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}