class FinalKeywordInSwitch
{

	

	public static void main(String args[])
	{
		
		int a=2;
		final int x=1 , y=2 , z=3;
		
		switch(a)
		{

				
			case x:
				System.out.println("Within the case x ");
				break;
			case y:
				System.out.println("Within the case y ");
				break;
			case z:
				System.out.println("Within case z ");
		}
	
	}

}
