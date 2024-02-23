class StarPattern8
{

/*

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *


*/

	public static void main(String args[])
	{
		for (int column=1;column<=5;column++)
		{
			for (int space=4;space>=column;space--)
			{
				System.out.print(" ");
			}

			for (int row=1;row<=column ;row++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int column=1;column<=4 ;column++ )
		{
			for (int space=1;space<=column;space++ )
			{
				System.out.print(" ");
			}
			for (int row=4;row>=column ;row--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}