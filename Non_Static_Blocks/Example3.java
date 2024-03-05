class Example3
{
	/*
		Non Static block OR Instance block will execute based on how 
		many times objects are created and number of new keywords.
	*/
	{
		System.out.println("Its Non Static block");
	}

	public static void main(String[] args)
	{
		Example3 refVar1 = new Example3();
		Example3 refVar2 = new Example3();
	}
}