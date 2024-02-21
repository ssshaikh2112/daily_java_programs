class StarPattern6
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
		for (int column =5;column >=1 ;column-- )
		{
			for (int space=4;space>=column ;space-- )
			{
				System.out.print(" ");
			}
			for (int row=1;row<=column ;row++ )
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}