class Shadi6
{
	void govtMarriegeOfficer() throws InterruptedException
	{
		System.out.println("Inside Government Marriege  Officer method...");
		Thread.sleep(3000);
	}

	void marriegeAgent() throws InterruptedException
	{
		// Because exception is in the govtMarriegeOfficer() method
		System.out.println("Inside Marriege Agent method...");
		govtMarriegeOfficer();	// InterruptedException  Because exception is in the govtMarriegeOfficer() method
	}

	void govtMarriegeOffice() throws InterruptedException
	{
		System.out.println("Inside Government Marriege Officer method...");	
		marriegeAgent();
		/*
			Shadi4.java:19: error: unreported exception InterruptedException; must be caught or declared to be thrown
                marriegeAgent();
                             ^
			1 error
		*/
	}
	
	public static void main(String[] args)
	{
		Shadi6 couple = new Shadi6();
		try
		{
			System.out.println("Try to connect Internet...");
			couple.govtMarriegeOffice();
		}
		catch (InterruptedException ie)
		{
			System.out.println("Alternate way Try to connect Internet...");
		}
		
		
	}
}