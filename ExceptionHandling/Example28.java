class Example28
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside the try block");
			System.out.println(10/0);		
		}
		catch (ArithmeticException ae)
		{
			// catch block exception
			System.out.println("Inside the catch block");
			System.out.println(10/2);
		}
		finally
		{
			// Finally block will always executed...
			System.out.println("Inside the Finally block");	
			System.out.println(10/0);	// can not handle
		}
	}
}
/*

	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example28.main(Example28.java:20)
*/