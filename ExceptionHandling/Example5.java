class Example5
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("These is the try block...");	// Execute
			System.out.println(10/2);		// Execute
		}
		catch (ArithmeticException ae)
		{
			System.out.println("These is the catch block...");	// No Execute
			System.out.println(10/2);	// No Execute
		}
	}
}