class Shadi1
{
	void govtMarriegeOfficer()
	{
		System.out.println("Inside Government Marriege  Officer method...");
		try
		{
			System.out.println("Internet not working , but we will try to fix and handle...");
			Thread.sleep(3000);
		}
		catch (InterruptedException ie)
		{
			System.out.println("we will try another way to fix and handle...");
		}
	}

	void marriegeAgent()
	{
		System.out.println("Inside Marriege Agent method...");
		govtMarriegeOfficer();
	}

	void govtMarriegeOffice()
	{
		System.out.println("Inside Government Marriege Officer method...");	
		marriegeAgent();
	}
	
	public static void main(String[] args)
	{
		Shadi1 couple = new Shadi1();
		couple.govtMarriegeOffice();
	}
}