class Shadi2
{
	void govtMarriegeOfficer()
	{
		System.out.println("Inside Government Marriege  Officer method...");
		Thread.sleep(3000);
		/*
			Shadi2.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(3000);
                            ^
			1 error
			error: compilation failed
		*/
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
		Shadi2 couple = new Shadi2();
		couple.govtMarriegeOffice();
	}
}