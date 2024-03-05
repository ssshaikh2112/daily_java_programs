class Example2
{
	/*
	
		We can create multiple non static blocks.
		Approach of executing non static block is TOP TO BOTTOM.
	
	*/
	
	{
		System.out.println("Its first non static block - 1");
	}

	{
		System.out.println("Its second non static block - 2");
	}
	public static void main(String args[])
	{
		Example2 refVar= new Example2();
	}
}