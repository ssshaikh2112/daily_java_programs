class Example21
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside the try block");
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