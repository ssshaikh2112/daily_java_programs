class NumberPattern
{
	public static void main(String args[])
	{
		for(int column=1; column<=5;column++)
		{
			for(int row=1; row<=column;row++)
			{
				System.out.print(" "+row+" ");
			}
			System.out.println();
		}
	}
}