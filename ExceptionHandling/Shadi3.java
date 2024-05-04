class Shadi3
{
	void govtMarriegeOfficer() throws InterruptedException
	{
		System.out.println("Inside Government Marriege  Officer method...");
		Thread.sleep(3000);
	}

	void marriegeAgent()
	{
		// Because exception is in the govtMarriegeOfficer() method
		System.out.println("Inside Marriege Agent method...");
		try
		{
			System.out.println("Handle the work to upload documents ");
			govtMarriegeOfficer();
		}
		catch (InterruptedException ie)
		{
			System.out.println("we will try another way to fix and handle...");
		}

		/*
		govtMarriegeOfficer();	// InterruptedException  Because exception is in the govtMarriegeOfficer() method
		*/
	}

	void govtMarriegeOffice()
	{
		System.out.println("Inside Government Marriege Officer method...");	
		marriegeAgent();
	}
	
	public static void main(String[] args)
	{
		Shadi3 couple = new Shadi3();
		couple.govtMarriegeOffice();
	}
}