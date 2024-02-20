class StarPattern4
{
	public static void main(String args[])
	{
		for(int column=5;column>=1;column--)		// we descrese the column because in each column * also descrease.
		{
			for(int space=5;space>=column;space--)	// We need space in 2nd(1 space), 3rd(2 space),etc
			{
				System.out.print(" ");
			}

			for(int row=1;row<=column;row++)		// We need 5 * in First line
			{
				System.out.print("*");
			}

			System.out.println();
		}

	}
}