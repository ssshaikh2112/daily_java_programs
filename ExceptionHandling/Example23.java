class Example23
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside the try block");		// Execute -- 1
			System.out.println(10/0);		// Not print ArithmeticException
		}
		catch (NullPointerException np)
		{
			System.out.println("Inside the catch block");
		}
		finally
		{
			// Finally block will always executed...
			System.out.println("Inside the Finally block");		// Execute -- 2
		}
	}
}
/*
	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example23.main(Example23.java:8)
*/

/*
	An exception is raised within the try block but catch block is unable to handle the exception
	due to which it will result in abnormal termination and before the abnormal termination finally block get executed.
*/