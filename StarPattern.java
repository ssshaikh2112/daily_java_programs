class StarPattern
{
	public static void main(String args[])
	{
		for(int column=1;column<=5;column++)		// encounter the logic for column where 1st column * star , 2nd column * * , etc
		{
			for(int row=1;row<=column;row++)		// encounter the logic for row where 1st row * star , 2nd row * * , etc
			{
				System.out.print(" * ");			// use only print because print all * in one line
			}
			System.out.println();					// go to the next line after completing the rows operation 
		}
	}
}