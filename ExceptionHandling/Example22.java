class Example22
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside the try block");
			System.out.println(10/0);		// Not print ArithmeticException
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside the catch block");
		}
		finally
		{
			// Finally block will always executed...
			System.out.println("Inside the Finally block");	
		}
	}
}