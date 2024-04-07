class AgeCheckUsingIfElseIf
{
	public static void main(String args[])
	{
		int age=21;
		char gender='F';

		if(age>=21)
		{
			System.out.println("Age is Matching...");
			
			if(gender=='M' || gender=='F')
			{
				System.out.println("Gender is Matching...");
			}
			else
			{
				System.out.println("Gender is not Matching...");
			}
		}
		else
		{
			System.out.println("Age is not MAtching....");
		}
			
	}

}
