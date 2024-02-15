class NumIsExitingBtw
{
	public static void main(String args[])
	{
		// check the number 3 is present in between 1 to 5 or not
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i==3)
			{
				System.out.println("Number is present in between 1 to 5 : "+i);
				break;
			}
		}
		
	}

}