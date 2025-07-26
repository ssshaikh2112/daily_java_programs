class MaleFemaleAgeCheck
{
	public static void main(String args[])
	{
		int men_age = 21;		// legal age for mens to marrage
		int female_age = 19;		// legal age for mens to marrage
		char genderfemale = 'F';	// Gender (case_sensitive)
		char gendermale = 'M';		// Gender (case_sensitive)
		
		if((men_age>=21 && gendermale=='M') || (female_age>=18 && genderfemale =='F'))		//check both conditions , either one is true then exicute if block otherwise else block...
		{
			System.out.println("Eligible for marrage...");
		}
		else
		{
			System.out.println("Not Eligible for marrage...");
		}


		
	}
}
